package com.lilang.distribute.aspect.advice;

import com.lilang.distribute.aspect.annotation.TraceLog;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.MDC;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/**
 * Created by lilang on 17/4/29.
 */
@Slf4j
@Component
public class FacadePerformanceAdvice implements MethodInterceptor {

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        return null;
    }

    public void serviceCost(ProceedingJoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature)joinPoint.getSignature();
        Method method = signature.getMethod();
        //Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        Parameter[] parameters = method.getParameters();
        Object[] args = joinPoint.getArgs();
        int pos = 0;
        boolean hasLogId = false;
        String traceLogId = null;
        for (Parameter parameter: parameters) {
            if(parameter.isAnnotationPresent(TraceLog.class)) {
                hasLogId = true;
                break;
            } else {
                pos++;
            }
        }
        if (hasLogId) {
            traceLogId = (String)args[pos];
        }
        String name = createInvocationTraceName(method);
        MDC.put("TRACE_LOG_ID", traceLogId);
        StopWatch stopWatch = new StopWatch();
        stopWatch.start(name);
        try {
            joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        } finally {
            stopWatch.stop();
            performanceLog(stopWatch, traceLogId);
        }
    }

    private void performanceLog(StopWatch stopWatch, String traceLogId) {
        //打印性能日志
        StopWatch.TaskInfo taskInfo = stopWatch.getLastTaskInfo();
        long costTime = taskInfo.getTimeMillis();
        String taskName = taskInfo.getTaskName();
        StringBuilder sb = new StringBuilder(taskName);
        String msg = sb.append(" ").append(traceLogId).append(" ").append(costTime).toString();
        log.trace(msg);

    }

    private String createInvocationTraceName(Method method) {
        StringBuilder builder = new StringBuilder();
        Class clazz = method.getDeclaringClass();
        builder.append(clazz.getName()).append(".").append(method.getName());
        return builder.toString();
    }
}
