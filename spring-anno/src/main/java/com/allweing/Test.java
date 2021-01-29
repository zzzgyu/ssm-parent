package com.allweing;

import com.allweing.bean.UserDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @auther: zzzgyu
 */

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);

        UserDao bean = applicationContext.getBean(UserDao.class);
        bean.query();
    }
}
