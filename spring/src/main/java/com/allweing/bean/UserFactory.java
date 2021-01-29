package com.allweing.bean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @auther: zzzgyu
 */

public class UserFactory implements FactoryBean<User> {
    public User getObject() throws Exception {

        User user = new User();
        user.setUserId(99);
        user.setUserName("user--zhu");
        return user;
    }

    public Class<?> getObjectType() {
        return User.class;
    }
}
