package com.allweing.bean;

import org.springframework.stereotype.Component;

/**
 * @auther: zzzgyu
 * CREATE TABLE `user` (
 *   `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
 *   `name` varchar(30) DEFAULT NULL COMMENT '姓名',
 *   `age` int(11) DEFAULT NULL COMMENT '年龄',
 *   `email` varchar(50) DEFAULT NULL COMMENT '邮箱',
 *   PRIMARY KEY (`id`)
 * ) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
 */
public class User  {

    private String userName;
    private Integer userId;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userId=" + userId +
                '}';
    }
}
