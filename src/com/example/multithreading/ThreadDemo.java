package com.example.multithreading;

class MyThread extends Thread
{

    @Override
    public void run()
    {
        System.out.println("Inside run()..." + Thread.currentThread().getName());
    }
}
public class ThreadDemo {

    public static void main (String args[]) throws InterruptedException {
         MyThread myThread1 = new MyThread();

         MyThread myThread2 = new MyThread();

         myThread1.start();
         myThread2.start();

         myThread1.join();
    }
}
