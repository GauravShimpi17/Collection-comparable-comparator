package com.tech.multithreading;

public class Thread1 extends Thread{

    @Override
    public void run() {
        System.out.println("Main thread start");
                Thread t = Thread.currentThread();
                String name = t.getName();
                System.out.println( "name "+name);
        try {
            for (int i=0;i<=5;i++){
                System.out.println("Multithreading " + i);
                Thread.sleep(1000);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("Main thread end");
    }
}
