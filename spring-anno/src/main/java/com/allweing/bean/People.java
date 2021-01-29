package com.allweing.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @auther: zzzgyu
 */
@Component
public class People {

    @Value("people")
    private String name;

    public void say() {
        System.out.println("========"+name+"================");
    }
}
