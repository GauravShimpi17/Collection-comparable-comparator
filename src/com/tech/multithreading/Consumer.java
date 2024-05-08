package com.tech.multithreading;


public class Consumer extends Thread {

    Company c;
    int a = 0;

    Consumer(Company c) {
        this.c = c;
    }

    @Override
    public void run() {
        while (true) {
            try {
                this.c.consumeItem();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
