package com.lecture.twelve;


import com.lecture.thirteen.Account;

import java.io.BufferedReader;
import java.util.Arrays;
import java.util.Scanner;

public class SuperMarket {

    public static void main(String[] args) {
        System.out.println("Welcome, user, please enter the items");
        Scanner scanner = new Scanner(System.in);
        String[] items = new String[2];
        double[] prices = new double[2];
        SuperMarketUtilities superMarketUtilities = new SuperMarketUtilities();

        for (int counter = 0; counter < items.length; counter++) {
            System.out.println("Please enter the item name");
            String itemName = scanner.next();

            if (superMarketUtilities.dublicateChecker(itemName, items) != -1) {
                System.out.println(" This is dublicate item: " + itemName);
                counter--;
            } else {
                items[counter] = itemName;
                System.out.println("Please enter the price for " + itemName);
                double itemPrice = scanner.nextDouble();
                prices[counter] = itemPrice;
            }
            /*
            for (int counter1 = 0; counter1 < items.length; counter1++) {
                if (items[counter].equalsIgnoreCase(items[counter1])) {
                    System.out.println("its dublicate");
                    continue;
                }
            }
            */
        }
        for (int counter = 0; counter < items.length; counter++) {
            System.out.println(items[counter] + " is " + prices[counter]);
        }

        //-----------------Lecture 13-----------------
        System.out.println("Please enter your budget");
        double budget = scanner.nextDouble();
        Account account = new Account(budget);
        System.out.println("Your budger is " + account.getBalance());

        //now lets buy some items
        //if you are "done" you finish the buying
        //while loop

        while (true) {
            System.out.println("what do you want to buy");
            String requestedItem = scanner.next();
            if (requestedItem.equalsIgnoreCase("done")) {
                break;
            }
            //check dublicatechecker
            int locatedIndex = superMarketUtilities.getItemIndex(requestedItem, items);
            if (locatedIndex == -1) {
                System.out.println("this item does not exist");

            } else {
                // now here we know item exists in the super market
                // we ask how many you want.  then we will call our method in account
                //and add that item.
                // if done break it...
                // --------------- lecture 14 ---------
                System.out.println("how many of " + requestedItem + " do you want");
                int requestedQuantity = scanner.nextInt();
                double totalCost = prices[locatedIndex] * (new Double(requestedQuantity));
                totalCost = superMarketUtilities.round(totalCost);
                boolean isEnoughMoney = account.deduct(totalCost);
                if (isEnoughMoney) {//Lets check if the person has enough money to buy the product
                    //if so deduct the balance and insert the items.
                    account.insertBoughtItem(requestedItem, requestedQuantity);
                }
            }
        }
        account.printAccountInfo();
    }
}






