package org.example;

public class RunnableDemo implements Runnable{
    @Override
    public void run() {
        System.out.println("这是一个线程:"+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        RunnableDemo runnableDemo = new RunnableDemo();
        Thread thread = new Thread(runnableDemo);
        thread.start();
    }
}
