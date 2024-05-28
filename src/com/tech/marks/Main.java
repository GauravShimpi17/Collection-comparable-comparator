package com.tech.marks;

public class Main {
    public static void main(String[] args) {
        A a = new A(70,80,85);
        B b = new B(89,88,66,76);

        System.out.println("Percentage of Student A : " + a.getPercentage());
        System.out.println("Percentage of Student B : " + b.getPercentage());

    }
}
