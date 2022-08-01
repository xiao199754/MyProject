package org.example;

public class ThreadDemo extends Thread{

    @Override
    public void run() {
        System.out.println("这是一个线程:"+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        ThreadDemo threadDemo = new ThreadDemo();
        threadDemo.start();
    }
}
