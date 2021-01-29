package com.allweing.bean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * @auther: zzzgyu
 */
@Component
public class UserFactory implements FactoryBean<User>, InitializingBean {
    public User getObject() throws Exception {

        User user = new User();
        user.setUserId(99);
        user.setUserName("user--zhu");
        return user;
    }

    public Class<?> getObjectType() {
        return User.class;
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("---");
    }
}
