package com.tech.iterator;



public class LambdaDemo {
    public static void main(String[] args) {


        play p1 = (a,b)->{
          return (a+b);
        };

        play p2 = (a,b)->{
          return (a+b);
        };
        System.out.println(p1.add(2,4));
        System.out.println(p2.add(200,400));
        System.out.println(p2.add(200,400)/p1.add(2,4));

    }
}
