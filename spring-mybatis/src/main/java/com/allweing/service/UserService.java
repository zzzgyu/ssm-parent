package com.allweing.service;

import com.allweing.mapper.UserMapper;
import com.allweing.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * @auther: zzzgyu
 */

@Component
@Transactional
public class UserService {

    @Autowired
    UserMapper userMapper;

    public User queryUserById(Long id) {
        User user = userMapper.findUserById(id);
        return user;
    }
}
