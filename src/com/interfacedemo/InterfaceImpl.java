package com.interfacedemo;

public class InterfaceImpl implements I1, I2 {

    @Override
    public void display() {
        I1.super.display();
        I2.super.display();
    }



}
