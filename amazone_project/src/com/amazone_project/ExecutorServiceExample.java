package com.amazone_project;

import java.util.concurrent.ExecutorService; //interface
import java.util.concurrent.Executors;       // utillity class

public class ExecutorServiceExample {

    public static void main(String[] args) {

        ExecutorService service =
                Executors.newFixedThreadPool(3);

        
        service.submit(()->{
        	System.out.println("Thread 1 execute");
        });
        service.submit(()->{
        	System.out.println("second 2 thread is execute");
        });
        service.submit(()->{System.out.println("thread  3thread is execute");});
        
        service.submit(()->{System.out.println("another thread is execute");});
        
        System.out.println();
    }
}