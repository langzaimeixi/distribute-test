package com.lilang.distribute.aspect.plugin;

import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;
import org.slf4j.MDC;
import org.springframework.util.StopWatch;

import java.lang.reflect.Method;
import java.sql.Connection;
import java.util.Properties;

/**
 * Created by lilang on 17/5/1.
 */
@Slf4j
@Intercepts({@Signature(type = Executor.class, method = "update", args = {MappedStatement.class, Object.class}),
            @Signature(type = Executor.class, method = "query", args = {MappedStatement.class, Object.class, RowBounds.class, ResultHandler.class}),
            @Signature(type = StatementHandler.class, method = "prepare", args = {Connection.class})})
public class DaoTimeInterceptor implements Interceptor {
    private ThreadLocal<StopWatch> tl = new ThreadLocal<StopWatch>();
    public Object intercept(Invocation invocation) throws Throwable {
        Method method = invocation.getMethod();
        Class clazz = method.getDeclaringClass();
        if (tl.get() == null) {
            tl.set(new StopWatch());
        }
        try {
            StopWatch stopWatch = tl.get();
            String statement = null;
            if (clazz == Executor.class) {
                stopWatch.start("CONN_TIME_TASK");
                Object[] args = invocation.getArgs();
                for (Object oj : args) {
                    if (oj instanceof MappedStatement) {
                        MappedStatement mappedStatement = (MappedStatement) oj;
                        statement = mappedStatement.getId();
                    }
                }
            }
            if (clazz == StatementHandler.class) {//预编译
                stopWatch.stop();
                stopWatch.start("EXE_SQL_TASK");
                return invocation.proceed();
            }
            Object obj = invocation.proceed();
            stopWatch.stop();
            perfromanceDaoLog(stopWatch, MDC.get("TRACE_LOG_ID"), statement);
            return obj;
        } catch (Exception e) {
            log.error("deal interceptor error, e:", e);
        } finally {
            return invocation.proceed();
        }


    }

    private void perfromanceDaoLog(StopWatch stopWatch, String trace_log_id, String statement) {
        StopWatch.TaskInfo[] taskInfos = stopWatch.getTaskInfo();
        Long connTime = null;
        Long exeTime = null;
        for (StopWatch.TaskInfo taskInfo: taskInfos) {
            if ("CONN_TIME_TASK".equals(taskInfo.getTaskName())) {
                connTime = taskInfo.getTimeMillis();
                continue;
            }
            if ("EXE_SQL_TASK".equals(taskInfo.getTaskName())) {
                exeTime = taskInfo.getTimeMillis();
            }
        }
        Long totalTime = stopWatch.getTotalTimeMillis();
        StringBuilder sb = new StringBuilder(trace_log_id + "");
        sb.append(" ").append(statement).append(" ").append(connTime).append(" ").append(exeTime).append(" ").append(totalTime);
        log.trace(sb.toString());
    }

    public Object plugin(Object o) {
        return Plugin.wrap(o, this);
    }

    public void setProperties(Properties properties) {

    }
}
