package com.allweing;

import com.allweing.bean.Teacher;
import com.allweing.bean.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @auther: zzzgyu
 */

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        User bean =(User) applicationContext.getBean("user");
        Teacher bean1 = applicationContext.getBean(Teacher.class);
        System.out.println(bean1);
        System.out.println(bean);
    }
}
