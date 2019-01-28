package com.lecture.FirstLessons;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println(" Please enter number for factorial. -1 is special command to exit");
        Scanner scanner = new Scanner(System.in);
        int i,fact =1;
        int number = scanner.nextInt();
        for(i=1;i<number;i++){
            fact = fact*i;
        }
        System.out.println("Factorial of " + number + "is: "+ fact);
    }

}

