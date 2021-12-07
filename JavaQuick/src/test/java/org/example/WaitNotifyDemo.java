package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class WaitNotifyDemo{

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        Product product = new Product(queue,10);
        Consumer consumer = new Consumer(queue,10);

        Thread thread1 = new Thread(product);
        Thread thread2 = new Thread(consumer);
        thread1.start();
        thread2.start();
    }
}
