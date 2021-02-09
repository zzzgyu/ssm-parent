package com.allweing.ext;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @auther: zzzgyu
 */
@Component
public class GreenColor implements BeanDefinitionRegistryPostProcessor {
    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        System.out.println("---------postProcessBeanDefinitionRegistry-----------");
        AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.rootBeanDefinition(RedColor.class).getBeanDefinition();
        registry.registerBeanDefinition("hello",beanDefinition);
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("=================postProcessBeanFactory=================");
        int beanDefinitionCount = beanFactory.getBeanDefinitionCount();
        int beanPostProcessorCount = beanFactory.getBeanPostProcessorCount();
        String[] beanDefinitionNames = beanFactory.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println("beanDefinitionName的名称："+beanDefinitionName);
        }
        System.out.println("beanDefinitionCount的数量："+beanDefinitionCount);
        System.out.println("beanPostProcessorCount的数量："+beanPostProcessorCount);

    }
}
