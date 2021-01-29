package com.allweing.controller;

import com.allweing.po.User;
import com.allweing.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @auther: zzzgyu
 */

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/user")
    public String user() {
        User user = userService.queryUserById(1l);
        System.out.println(user);
        return "success";
    }
}
