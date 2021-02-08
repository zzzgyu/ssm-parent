package com.allweing.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Role;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @auther: zzzgyu
 */
@Service
public class UserService {

    @Autowired
    UserDao userDao;

    @Transactional
    @Role(BeanDefinition.ROLE_APPLICATION)
    public void insert() {

        userDao.insert();
        System.out.println("完成用户插入");
        int i=10/0;
    }
}
