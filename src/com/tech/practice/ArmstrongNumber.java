package com.tech.practice;

import java.util.Scanner;

public class ArmstrongNumber {

    Scanner sc = new Scanner(System.in);
    int num;
    int temp;
    int size;
    int newNum = 0;

    public boolean armstrongNum() {

        System.out.println("Enter any number : ");
        num = sc.nextInt();
        temp = num;

        size = String.valueOf(num).length();

        while (num > 0) {
            int rem = num % 10;
            newNum += (int) Math.pow(rem, size);
            num /= 10;
        }
        return newNum == temp;
    }

    public static void main(String[] args) {

        ArmstrongNumber number = new ArmstrongNumber();
        if (number.armstrongNum()) {
            System.out.println("Is armstrong number");
        } else {
            System.out.println("Is not armstrong number");
        }

    }


}
