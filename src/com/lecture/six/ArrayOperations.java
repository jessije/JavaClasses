package com.lecture.six;

public class ArrayOperations {
    public static void main(String[] args) {
        int[] arrayOfIntegers = {1, 2, 3, 4, 5, 6};

        /**
         * print all the array values
         */
        for (int item : arrayOfIntegers) {
            System.out.println(item);
        }
        //System.out.println(arrayOfIntegers); //

        /* pirnt all except if the value is 1

         */
        for (int item : arrayOfIntegers) {
            if (item != 1) {
                System.out.print(item);
            }
        }
        System.out.println();
        /**
         * print all ecep if the value is 1 use continue
         */
        for (int item : arrayOfIntegers) {
            if (item == 1) {
                continue;
            } else {
                System.out.println(item);
            }
        }

        /**
         * print items until until 4 shows up break
         */
        for (int item : arrayOfIntegers) {
            if (item == 4) { //until is 4
                break;
            } else {
                System.out.print(item);
            }
        }
    }
}