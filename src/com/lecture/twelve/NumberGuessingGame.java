package com.lecture.twelve;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {

        System.out.println("Welcome, user");
        Random randomNumber = new Random();
        int number1 = randomNumber.nextInt(101);
        System.out.println(number1);
        System.out.println();


        System.out.println("Please guess the number");

        Scanner scanner = new Scanner(System.in);

        int inputNumber = scanner.nextInt();

        int counter = 1;
        while (inputNumber != number1) {
            System.out.println("attempt nr " + counter + " : This is not correct, try again");
            counter++;
            inputNumber = scanner.nextInt();

            //Lets give a hint
            int difference = Math.abs((number1 - inputNumber));
            if (difference < 5) {
                System.out.println("it is burning");
            } else if (difference < 10) {
                System.out.println("it is very hot");
            } else if (difference < 25) {
                System.out.println("it is warm");
            } else {
                System.out.println("it is cold");
            }
        }
            System.out.println("correct!!");
        }
    }

