package com.tech.practice;

import java.util.Scanner;

public class Fibonacci {

    public void fibonacci(int num1, int num2, int count){

        for(int i= num1; i<count; i++){
            int num3 = num1 + num2;
            System.out.print(num1 + " ");
            num1 = num2;
            num2 = num3;
        }

    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        fibonacci.fibonacci(5,6,15);
    }
}
