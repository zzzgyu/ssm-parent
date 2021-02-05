package com.allweing.bean;

import org.springframework.stereotype.Component;

/**
 * @auther: zzzgyu
 */
@Component
public class GreenColor implements Color {
    @Override
    public void print() {
        System.out.println("Green");
    }
}
