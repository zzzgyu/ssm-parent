package com.allweing;

import com.allweing.bean.RedColor;
import com.allweing.beanaop.Math;
import com.allweing.config.MyConfig;
import com.allweing.config.Myconfig2;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @auther: zzzgyu
 */

public class Test01 {

    @Test
    public void testDemo() {
        RedColor redColor = new RedColor();
        redColor.print();
    }


    @Test
    public void testDemo2() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();

        applicationContext.register(MyConfig.class);
        applicationContext.refresh();
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {

            System.out.println("===========" + beanDefinitionName);
        }
        RedColor bean = applicationContext.getBean(RedColor.class);
        bean.print();
    }

    @Test
    public void testDemo3() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Myconfig2.class);
       /* Math bean = applicationContext.getBean(Math.class);
        int div = bean.div(2, 1);
        System.out.println(div);*/
        RedColor bean = applicationContext.getBean(RedColor.class);
        bean.print();
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }
}
