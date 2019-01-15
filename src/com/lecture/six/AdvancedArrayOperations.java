package com.lecture.six;

import java.util.Arrays;
import java.util.Scanner;

public class AdvancedArrayOperations {
    public static void main(String[] args) {

        String[] arrayofFruits = new String[7];
        arrayofFruits[0] = "Banana";
        arrayofFruits[1] = "Orange";
        arrayofFruits[2] = "grape";
        arrayofFruits[3] = "apple";
        arrayofFruits[4] = "kiwi";
        arrayofFruits[5] = "pineapple";
        arrayofFruits[6] = "mango";

        System.out.printf(Arrays.toString(arrayofFruits));

        String[] arrayofVeg = new String[7];
        arrayofVeg[0] = "potato";
        arrayofVeg[1] = "tomato";
        arrayofVeg[2] = "cabbage";
        arrayofVeg[3] = "eggplant";
        arrayofVeg[4] = "carrot";
        arrayofVeg[5] = "cucumber";

        System.out.println(Arrays.toString(arrayofVeg));
        Scanner scanner = new Scanner(System.in);


        String[] customerList = new String[7];
        System.out.println("please enter vegetable of fruit");
        // customerList[0]=scanner.next(); -- a solution, but not good

        for (int counter = 0; counter < customerList.length; counter++) {
            customerList[counter] = scanner.next();
        }
        int vegetableAmount = 0;
        int fruitAmount = 0;


        //String firstItem=custemerList[0]; - bad way but possible
        //first for is responsible for the customer Item loop
        //meaning first we get the first item of the custemer
        //then we check if it is a member of fruit or vegetable array
        for (String customerItem : customerList) {
            System.out.println("Deciding " + customerItem + " if fruit or vegetable");
            // this"for" will decide if it is a vegetable
            for (int counter = 0; counter < arrayofVeg.length; counter++) {
                // if the customer item is part of the array
                if (customerItem.equals(arrayofVeg[counter])) {
                    vegetableAmount++;
                    System.out.println(customerItem + "  is a vegetable");
                    break;
                }
            }
            //this part is responsible for fruit checking
            for (int counter = 0; counter < arrayofFruits.length; counter++) {

                if (customerItem.equals(arrayofFruits[counter])) {
                    fruitAmount++;
                    System.out.println(customerItem + "  is a fruit");
                    break;
                }
            }
        }
        if (vegetableAmount + fruitAmount != 7) {
            System.out.println("in the array list there is unknown info (neither fruit or vegetable");
        } else {

            System.out.println("we have " + vegetableAmount + "of vegetables");
            System.out.println("we have " + fruitAmount + "of fruits");
        }

    }
}

