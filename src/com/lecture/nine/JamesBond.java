package com.lecture.nine;

import java.util.Scanner;

public class JamesBond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dear User please enter your name:");
        String name = scanner.nextLine();
        name = name.replaceAll("(?i)James Bond", "007");
        name = name.replaceAll("(?i)agent", "007");
        System.out.println("Hello " + name);
        }
    }

