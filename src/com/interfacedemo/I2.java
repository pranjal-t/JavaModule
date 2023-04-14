package com.interfacedemo;

public interface I2 {
    default void display() {
        System.out.println("Inside display of I2");
    }
}
