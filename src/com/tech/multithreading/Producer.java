package com.tech.multithreading;

public class Producer extends Thread {
    Company c;

    Producer(Company c) {
        this.c = c;
    }

    @Override
    public void run() {
//        int i = 1;
        for (int i=1;i<10;++i) {
            try {
            this.c.produceItem(i);
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }



        }
    }
}
