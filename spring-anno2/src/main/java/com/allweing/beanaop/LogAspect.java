package com.allweing.beanaop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * @auther: zzzgyu
 */
@Aspect
public class LogAspect {


    @Pointcut("execution(public int com.allweing.beanaop.Math.*(..))")
    public void pointCut() {

    }

    @Before("pointCut()")
    public void before(JoinPoint joinPoint) {
        System.out.println(joinPoint.getSignature().getName()+"==============before===============");
    }

    @After("pointCut()")
    public void after(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        System.out.println(joinPoint.getSignature().getName()+"===============after================="+args[0]);

    }

    @AfterReturning(value = "pointCut()",returning = "value")
    public void afterReturning(Object value) {
        System.out.println("=============afterReturning=============="+value);
    }


    @AfterThrowing(value = "pointCut()",throwing = "ex")
    public void afterException(Exception ex) {
        System.out.println("==============afterExpection=========="+ex);
    }
}
