package com.allweing.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @auther: zzzgyu
 */

public class MyProcessHandler implements BeanPostProcessor {
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("===============bean 初始化前===========");
        System.out.println(beanName);
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("===============bean 初始化后方法===========");
        System.out.println(beanName);
        return bean;
    }
}
