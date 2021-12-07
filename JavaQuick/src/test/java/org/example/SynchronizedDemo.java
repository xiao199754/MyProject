package org.example;

public class SynchronizedDemo implements Runnable{
        int x = 100;

        public synchronized void m1() {
            x = 1000;
            try {
                System.out.println("休眠了1S");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("x=" + x);
        }

        public synchronized void m2() {
            try {
                System.out.println("休眠了0.2S");
                Thread.sleep(200);
                //System.out.println("x=" + x);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            x = 2000;
        }

        public synchronized void m3() {
            try {
                System.out.println("休眠了0.3S");
                Thread.sleep(300);
                //System.out.println("x=" + x);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            x = 3000;
        }

        public static void main(String[] args) throws InterruptedException {
            SynchronizedDemo sd = new SynchronizedDemo();
            new Thread(() -> sd.m1()).start();
            new Thread(()->sd.m2()).start();
            sd.m3();
            System.out.println("Main x=" + sd.x);
        }

        @Override
        public void run() {
            m1();
        }
    }
