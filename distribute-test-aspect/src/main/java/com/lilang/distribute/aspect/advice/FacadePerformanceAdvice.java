package com.lilang.distribute.aspect.advice;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.MDC;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

import java.lang.reflect.Method;

/**
 * Created by lilang on 17/4/29.
 */
@Slf4j
@Component
public class FacadePerformanceAdvice implements MethodInterceptor {

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        return null;
    }

    public void serviceCost(ProceedingJoinPoint joinPoint, Object... parameters) {
        MethodSignature signature = (MethodSignature)joinPoint.getSignature();
        Method method = signature.getMethod();
        String traceLogId = null;
        for (Object obj : parameters) {
            if (obj instanceof String) {
                traceLogId = (String)obj;
            }
        }
        String name = createInvocationTraceName(method);
        MDC.put(name, traceLogId);
        //method.getParameters()
        StopWatch stopWatch = new StopWatch(name);
        stopWatch.start();
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
    }

    private String createInvocationTraceName(Method method) {
        StringBuilder builder = new StringBuilder();
        Class clazz = method.getDeclaringClass();
        builder.append(clazz.getName()).append(method.getName());
        return builder.toString();
    }
}
