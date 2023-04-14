package com.example.multithreading;

import java.util.concurrent.*;

class MyClass implements Runnable
{

    @Override
    public void run() {

        System.out.println("Inside run()..");

    }
}

class AnotherClass implements Callable
{

    @Override
    public Integer call() throws Exception {
        return 20;
    }
}
public class ExecutorDemo {

    public static void main (String args[]) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(10);

        Runnable r = new MyClass();
        Thread t = new Thread(r);
        executorService.execute(r);  //execute() takes only Runnable & does not return any value

        AnotherClass anotherClass = new AnotherClass();

        Future<Integer> future  = executorService.submit(anotherClass); //submit() takes Runnable/Callable & returns a Future type

        System.out.println(future.get());

        executorService.shutdown();

    }
}
