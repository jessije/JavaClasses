package com.lecture.six;

import java.util.Scanner;

public class SwtichOperations {
    public static void main(String[] args) {
        /**
         * user will insert 1 number
         * user then inserts another number
         * then we will ask what we will do with these number
         * )1 = adding 2 =substraction 3= multiplication
         * 4=division
         *use switch
         */
        Scanner scanner = new Scanner(System.in);
        double number1;
        double number2;
        int calculation;

        System.out.println("Please enter number 1");
        number1 = scanner.nextDouble();

        System.out.println("Please enter number 2");
        number2 = scanner.nextDouble();

        System.out.println("what should we do: please choose 1 = adding 2 =substraction 3= multiplication ");
        calculation = scanner.nextInt();

double result=0;

        switch (calculation) {
            case (1):
                System.out.println(number1 + number2);
                break;

            case (2):
                System.out.println(number1 - number2);
                break;
            case (3):
                System.out.println(number1 * number2);
                break;
            case (4):
                System.out.println(number1 / number2);
                break;

            default:
            System.out.println("what is it about");
            return; // boolean isValid =true, isValid=false
        }

        }
    }

