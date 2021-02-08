package com.allweing.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * @auther: zzzgyu
 */
@Repository
public class UserDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public void insert() {
        String s = UUID.randomUUID().toString().substring(0, 5);
        jdbcTemplate.update("INSERT INTO `ly_user` (username,age) VALUES (?,?)",s,18);
    }
}
