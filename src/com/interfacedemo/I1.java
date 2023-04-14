package com.interfacedemo;

public interface I1 {
    default void display() {
        System.out.println("Inside display of I1");
    }
}
