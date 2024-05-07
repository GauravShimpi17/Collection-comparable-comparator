package com.tech.multithreading;

import java.util.TreeMap;

public class Thread2 implements Runnable{
    @Override
    public void run() {
        try {
            for (int i=10; i>=1;i--){
                System.out.println("thread2 "+i);
                Thread.sleep(500);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
