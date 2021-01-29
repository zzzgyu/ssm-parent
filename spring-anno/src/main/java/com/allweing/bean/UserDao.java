package com.allweing.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @auther: zzzgyu
 */
@Component
@Transactional
public class UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void query() {
        List<User1> list = jdbcTemplate.query("select * from user", new BeanPropertyRowMapper<User1>(User1.class));
        System.out.println(list);
    }
}
