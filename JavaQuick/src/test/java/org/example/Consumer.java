package org.example;

import java.util.Queue;

//消费者
public class Consumer implements Runnable{

    Queue<String> bags;
    private Integer size;

    public Consumer(Queue<String> bags, Integer size) {
        this.bags = bags;
        this.size = size;
    }

    @Override
    public void run() {
        while (true){
            synchronized (bags){
                if (bags.isEmpty()){
                    System.out.println("bags为空");
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
                String bag = bags.remove();
                System.out.println("消费者消费:"+bag);
                bags.notifyAll();
            }
        }

    }
}
