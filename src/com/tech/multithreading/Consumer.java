package com.tech.multithreading;


public class Consumer extends Thread {

    Company c;


    Consumer(Company c) {
        this.c = c;
    }

    @Override
    public void run() {
        for (int i = 1;i<10;++i) {
            try {
                this.c.consumeItem();
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

    }
}
