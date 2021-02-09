package com.allweing.ext;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @auther: zzzgyu
 */
@Component
@Primary
public class RedColor implements Color {
    public RedColor() {
        System.out.println("RedColor----------Constructor");
    }

    @Override
    public void print() {
        System.out.println("RedColor----------------------");
    }
}
