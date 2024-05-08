package com.tech.miniproject;

import java.util.Random;
import java.util.Scanner;

public class NumberGuess {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int minRange = 0;
        int maxRange =100;
        int targetValue = random.nextInt(maxRange - minRange + 1) +minRange;
        int attempts = 1;

        System.out.println("Min range is " + minRange +" and Max range is " + maxRange);


        for(int attempt = 5; attempt >=attempts; attempt--){
            System.out.println(attempt + " attempts left.");
            System.out.println("Enter a number : ");
            int guess = sc.nextInt();



            if (!(guess >minRange && guess<maxRange)){
                System.out.println("Invalid Number! Try again ...");
            }else if (guess == targetValue){
                System.out.println("Number is correct.");
                return;
            } else if (guess<targetValue) {
                System.out.println("Too Low, Try again ");
            }else {
                System.out.println("Too high! Try again.");
            }

        }
        System.out.println("Sorry! Out of attempts");
        System.out.println("Target number was : " + targetValue);
    }

}
