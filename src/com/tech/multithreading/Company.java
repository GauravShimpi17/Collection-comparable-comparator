package com.tech.multithreading;

public class Company {

    int n;
    boolean f = false;

    synchronized public void produceItem(int n) throws InterruptedException {
        if (f) {
            wait();
        }
        this.n = n;
        System.out.println("Item produced : " + this.n);
        f = true;
        notify();
        Thread.sleep(500);
    }

    synchronized public void consumeItem() throws InterruptedException {
        if (!f) {
            wait();
        }
        if (Product.product >= 1) {
            System.out.println("Item Consumed : " + this.n);

        }
        f = false;
        notify();
        Thread.sleep(500);
    }
}
