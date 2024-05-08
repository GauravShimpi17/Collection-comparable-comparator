package com.tech.multithreading;

public class Company {

    int n;
    boolean f = false;
    synchronized public void produceItem(int n) throws InterruptedException {
        if (f){
            wait();
        }
        this.n = n;
        System.out.println("Item produced : " + n);
        f=true;
        notify();
    }

    synchronized public int consumeItem() throws InterruptedException {
        if (!f){
            wait();
        }
        System.out.println("Item Consumed : " + this.n);
        f=false;
        notify();
        Thread.sleep(500);
        return this.n;
    }
}
