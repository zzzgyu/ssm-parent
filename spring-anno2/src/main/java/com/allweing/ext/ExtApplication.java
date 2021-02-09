package com.allweing.ext;

import org.junit.Test;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @auther: zzzgyu
 */

public class ExtApplication {

    @Test
    public void test() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig3.class);
        applicationContext.publishEvent(new ApplicationEvent(new String("我发布的事件")) {
            @Override
            public Object getSource() {
                return super.getSource();
            }
        });
        RedColor redColor = applicationContext.getBean(RedColor.class);
        redColor.print();
        applicationContext.close();
    }
}
