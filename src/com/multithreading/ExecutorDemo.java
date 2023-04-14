package com.multithreading;


import java.sql.Date;
import java.util.concurrent.*;

class Task implements Runnable {

    private String taskName;

    public Task(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {

        for (int i = 0; i <= 5; i++){

            System.out.println("Current thread is " + Thread.currentThread().getName() + " task is " + this.taskName);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
public class ExecutorDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Task t1 = new Task("Task-1");
        Task t2 = new Task("Task-2");
        Task t3 = new Task("Task-3");
        Task t4 = new Task("Task-4");
        Task t5 = new Task("Task-5");

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        executorService.execute(t1);
        executorService.execute(t2);
        executorService.execute(t3);
        executorService.execute(t4);
        executorService.execute(t5);


        Future future = executorService.submit(t1);
        System.out.println(future.get());

        executorService.shutdown();
    }
}
