package com.tech.multithreading;

public class Producer extends Thread {
    Company c;

    Producer(Company c) {
        this.c = c;
    }

    @Override
    public void run() {
        int i = 1;
        while (i<20) {
            try {
            this.c.produceItem(i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            i++;
        }
    }
}
