package com.lecture;

import java.util.Scanner; // first do checkups and then , use else if

public class Rer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print a number");

        int number = scanner.nextInt();
        int counter;

        if (number > 5) {
            System.out.println("doesn't match");
        } else {
            for (counter = 0; counter < number; counter++) {
                System.out.print(number); }
        }
        if (number == 0) {
            System.out.println("we got nothing to print");
        }
        if (number < 0) {
            System.out.println("error");
        }
    }
}












