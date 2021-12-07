package org.example;

import java.util.concurrent.*;

public class CallableDemo implements Callable {
    @Override
    public Object call() throws Exception {
        System.out.println("这是一个线程:"+Thread.currentThread().getName());
        return "Hello Callable";
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future f = executorService.submit(new CallableDemo());
        System.out.println(Thread.currentThread().getName()+"-"+f.get());
    }
}
