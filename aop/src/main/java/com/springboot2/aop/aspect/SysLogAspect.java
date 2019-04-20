package com.springboot2.aop.aspect;

import com.alibaba.fastjson.JSON;
import com.springboot2.aop.annotation.Log;
import com.springboot2.aop.service.SysLogService;
import com.springboot2.base.domain.SysLog;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.lang.reflect.Method;
import java.util.Date;

/**
 * 系统日志切面
 *
 * @Auther: Akang
 */
@Aspect  // 定义切面类
@Component
@Slf4j
public class SysLogAspect {

    @Resource
    private SysLogService sysLogService;

    /**
     * 定义切入点
     * 切入点函数execution(), args(), within(), @annotation()
     */
//    @Pointcut("execution(* com.springboot2.aop.controller.*.*(..))")
    @Pointcut("@annotation(com.springboot2.aop.annotation.Log)")
    public void sysLog() {
    }

    //切面环绕
    @Around("sysLog()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        long beginTime = System.currentTimeMillis();
        // 执行方法
        Object result = point.proceed();
        // 执行时长(毫秒)
        long time = System.currentTimeMillis() - beginTime;
        //异步保存日志
        saveLog(point, time);
        return result;
    }

    /**
     * 保存操作日志
     */
    private void saveLog(ProceedingJoinPoint joinPoint, long time) {
        SysLog sysLog = new SysLog();

        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        Log annotationLog = method.getAnnotation(Log.class);
        // 注解上的描述
        if (annotationLog != null) {
            sysLog.setOperation(annotationLog.value());
        }
        // 请求的方法名
        String methodName = joinPoint.getTarget().getClass().getName() + "." + signature.getName() + "()";
        sysLog.setMethod(methodName.substring(0, Math.min(methodName.length(), 199)));
        // 请求的参数
        Object[] args = joinPoint.getArgs();
        if (args.length > 0) {
            for (Object arg : args) {
                if (arg instanceof MultipartFile) {
                    args[0] = new Object();
                }
            }
            String params = JSON.toJSONString(args);
            params = params.substring(0, Math.min(4999, params.length()));
            sysLog.setParams(params);
        }
        sysLog.setUserId(-1L);
        sysLog.setUserName("用户名");
        sysLog.setTime((int) time);
        sysLog.setCreateAt(new Date());

        // 保存系统日志
        sysLogService.save(sysLog);
    }
}
