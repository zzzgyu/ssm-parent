package com.allweing;

import com.allweing.po.User;
import com.allweing.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @auther: zzzgyu
 */

public class Test {
    public static void main(String[] args) {
        String resource = "applicationContext.xml";
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(resource);
        UserService bean = applicationContext.getBean(UserService.class);
        User user = bean.queryUserById(1l);
        System.out.println(user);
    }
}
