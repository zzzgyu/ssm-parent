package com.allweing;

import com.allweing.pojo.User;
import com.allweing.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @auther: zzzgyu
 */

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
        UserService bean = applicationContext.getBean(UserService.class);
        User user = bean.queryUserById(1l);
        System.out.println(user);
    }
}
