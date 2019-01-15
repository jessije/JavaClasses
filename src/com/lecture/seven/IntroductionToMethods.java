package com.lecture7;

import java.util.Arrays;
import java.util.Scanner;

public class IntroductionToMethods {

     public void welcomeUser(String[] vegetables, String[] fruits) {
        System.out.println("Enter a fruit or vegetable from the list");
        System.out.println("Vegetables" + Arrays.toString(vegetables));
        System.out.println("Fruits" + Arrays.toString(fruits));
        System.out.println();
    }

    public boolean isThisVegetable(String customerItem, String[] vegetables) {
        for (int counter = 0; counter < vegetables.length; counter++) {
            //If the customer item is part of the array
            if (customerItem.equals(vegetables[counter])) {
                System.out.println(customerItem + " is a vegetable");
                return true;
            }
        }
        return false;
    }

    public boolean isThisFruit(String customerItem, String[] fruits) {
        for (int counter = 0; counter < fruits.length; counter++) {
            //If the customer Item is part of array of fruit
            if (customerItem.equals(fruits[counter])) {
                System.out.println(customerItem + " is a fruit");
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] fruits = {"Banana", "Orange", "Grape", "Apple", "Kiwi", "Pineapple"};
        String[] vegetables = {"Carrot", "Potato", "Onion", "Garlic", "Eggplant"};
        IntroductionToMethods introductionToMethods = new IntroductionToMethods();
        introductionToMethods.welcomeUser(vegetables, fruits);


        String[] customerList = new String[7];
        for (int counter = 0; counter < customerList.length; counter++) {
            customerList[counter] = scanner.next();
        }
        int fruitcounter = 0;
        int vegetablecounter = 0;

        /**
         * First "for" responsible for the customer Item loop
         * meaning first we get the first item of the customer
         * then we check if it a number if fruit or vegetable
         */

        for (String customerItem : customerList) {
            System.out.println("Deciding if " + customerItem + " is a fruit or vegetable");
            // This will decide if it is a vegetable !
            boolean isThisVegetable = introductionToMethods.isThisVegetable(customerItem, vegetables);
            boolean isThisFruit = introductionToMethods.isThisFruit(customerItem, fruits);
            if (isThisVegetable){
                vegetablecounter++;
            }else if (isThisFruit){
                fruitcounter++;
            }else{
                System.out.println("What is this ? wrong input !!"+customerItem);
                System.exit(1);
            }
        }
         System.out.println("We have " + fruitcounter + " fruits");
         System.out.println("We have " + vegetablecounter + " vegetables");
        }
    }

