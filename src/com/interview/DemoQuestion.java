package com.interview;

import java.util.ArrayList;
import java.util.List;

public class DemoQuestion {

    public static void main(String[] args) {

        m1(3);
        m1(new Long(2));
        m1(null);

        List<Long> list = new ArrayList<>();

        //list.add(new Integer(2));

    }

        public static void m1(int n) {

            System.out.println("Inside m1 1");

        }

    public static void m1(Integer n) {

        System.out.println("Inside m1 2");

    }

    public static void m1(Object n) {

        System.out.println("Inside m1 3");

    }

}
