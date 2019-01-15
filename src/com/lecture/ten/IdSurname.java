package com.lecture.ten;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class IdSurname {
    public static void main(String[] args) {
        /**
         * we will use scanner to get name and lastname and id number
         * after we get all the values we will validate it
         * id number will be just number
         * name and surname should be a unicode (upper case, lover case and number are acceptable)
         *
         */
        System.out.println("print name and last name ");
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        System.out.println("name " + name);
        String surname = scanner.nextLine();
        System.out.println("surname " + surname);

        System.out.println("print ID-number");
        String idNumber = scanner.nextLine();

        System.out.println("ID number" + idNumber);

        if (idNumber.matches("[0-9]...")) {
            System.out.println("Id is correct");
        }else{
            System.out.println("Id is not correct");
        }
        if (name.matches("[a-zA-Z0-9]*")) {
            System.out.println("name is correct");
        }else{
            System.out.println("name is not correct");
        }
        if (surname.matches("[a-zA-Z0-9]*")) {
            System.out.println("lastname is correct");
        }else{
            System.out.println("lastname is not correct");
        }


    }
}
