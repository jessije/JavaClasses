package com.lecture.thirteen;

import com.lecture.twelve.SuperMarketUtilities;

public class Account {
    //balance
    //bought items
    //quantities
    //
   /* private String[] boughtItems;
    private Integer[] quantities;
    private double balance;
*/
    double balance;
    String[] boughtItems = new String[5];
    Integer[] quantities = new Integer[5];

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public String[] getBoughtItems() {
        return boughtItems;
    }

    public Integer[] getQuantities() {
        return quantities;
    }

    /**
     * this will check if the item was already bought. it it is bougtt already increase the amount with the existing quantity
     * if it is bought the first item then insert item and put the amount inse the quantity
     * it will put hte incoming item in the first empty place of the arrays
     *
     * @param incomingItem
     * @param amount
     */
    public void insertBoughtItem(String incomingItem, int amount) {
        SuperMarketUtilities superMarketUtilities = new SuperMarketUtilities();
        int indexofItem = superMarketUtilities.dublicateChecker(incomingItem, boughtItems);
        if (indexofItem != -1) {
            // this means we have already bought lets increase the amount
            //
            quantities[indexofItem] = quantities[indexofItem] + amount;
        } else {
            //here we have a new item bought
            //let find the empty place in the bought array
            int emptyIndex = superMarketUtilities.getEmptyIndex(boughtItems);
            if (emptyIndex == -1) {
                System.out.println(" what the hell is going on" + "we must have an empty place");
                System.exit(1);
            } else {

                boughtItems[emptyIndex] = incomingItem;
                quantities[emptyIndex] = amount;
            }

        }
    }

    public boolean deduct(double cost) {
        double threshold = .0001;
        SuperMarketUtilities superMarketUtilities = new SuperMarketUtilities();
        if (Math.abs(balance - cost) < threshold) {
            System.out.println("There is enough balance");
            balance = balance - cost;
            balance = superMarketUtilities.round(balance);
            return true;
        } else if (balance >cost) {
            System.out.println("There is enough balance");
            balance = balance - cost;
            balance = superMarketUtilities.round(balance);
            return true;
        } else {
            System.out.println("There is not enough money");
            return false;
        }
    }
        public void printAccountInfo() {
    for (int counter = 0; counter < boughtItems.length; counter++) {
        if (boughtItems[counter] != null) {
            System.out.println("item>" + boughtItems[counter] + " quantity:" + quantities[counter]);
        }
    }
}
}











   /* public Account(String[] boughtItems, String[] quantities, double balance) {
        this.boughtItems = boughtItems;
        this.quantities = quantities;
        this.balance = balance;
    }

    public void setBoughtItems(String[] boughtItems) {
        this.boughtItems = boughtItems;
    }

    public String getBoughtItems() {
        return boughtItems[];
    }

    public void printData() {
        System.out.println("bought items: " + boughtItems + "quantities: " + quantities + "balance: " + balance);
    }
    */
