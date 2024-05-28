package com.tech.practice;

import java.util.Scanner;

class Palindrome {

    Scanner sc = new Scanner(System.in);

    int random;
    int constant;
    int rev_num = 0;

    public void palindrome() {
        System.out.println("Enter any number : ");
        random = sc.nextInt();

        constant = random;

        while (random > 0) {
            int rem = random % 10;
            rev_num = (rev_num * 10) + rem;
            random /= 10;
        }

        if (constant == rev_num) {
            System.out.println("Number is palindrom");
        } else {
            System.out.println("Number is not palindrom");
        }

    }


    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        palindrome.palindrome();

    }


}