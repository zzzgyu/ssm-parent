package com.allweing;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @auther: zzzgyu
 */
@Controller
public class HelloController {

    @RequestMapping("/success")
    public String hello() {
        System.out.println("=================hello===================");
        return "success";
    }
}
