package com.allweing.bean;

public interface Color {

    default void print(){
        System.out.println("null");
    }
}
