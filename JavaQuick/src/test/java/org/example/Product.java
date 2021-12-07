package org.example;

import java.util.Queue;

//生产者
public class Product implements Runnable{

    Queue<String> bags;
    private Integer size;

    public Product(Queue<String> bags, Integer size) {
        this.bags = bags;
        this.size = size;
    }

    @Override
    public void run() {
        int i = 0;
        while (true){
            i++;
            synchronized (bags){
                while (bags.size()==size){
                    System.out.println("bags满了");
                    //TODO 阻塞
                    try {
                        bags.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("生产者-生产:bag"+i);
                bags.add("bags"+i);
                //TODO 唤醒处于阻塞状态下的消费者
                bags.notifyAll();
            }
        }
    }
}
