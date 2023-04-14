package com.multithreading;

import com.demo.Demo;

class DemoClass extends Thread {

    @Override
    public void run()
    {

        System.out.println(Thread.currentThread().getName());
    }

}
public class DeadlockDemo {

    public static void main(String[] args) throws InterruptedException {

        DemoClass obj1 = new DemoClass();
        DemoClass obj2 = new DemoClass();

        obj1.start();
        obj2.start();


        obj2.join();
        obj1.join();

    }
}

