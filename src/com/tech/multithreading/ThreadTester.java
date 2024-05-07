package com.tech.multithreading;

public class ThreadTester {
    public static void main(String[] args) throws InterruptedException {
        Thread1 thread1 = new Thread1();

        Thread2 t2 = new Thread2();
        Thread thread = new Thread(t2);
        thread.setPriority(5);
//        thread1.setPriority(1);

        thread1.start();
        thread.start();

    }
}
