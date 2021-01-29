package com.allweing.bean;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @auther: zzzgyu
 */
@Component
@Aspect
public class PeopleProxy {

    @Pointcut(value = "execution(* com.allweing.bean.People.*(..))")
    public void pointCut() {

    }

    @Before(value = "pointCut()")
    public void before() {
        System.out.println("----------before---------");
    }

    @AfterReturning(pointcut = "pointCut()")
    public void after() {
        System.out.println("--------after---------------");
    }
}
