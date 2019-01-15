package com.lecture.seven;

import java.util.Scanner;

public class AdvancedWelcomCaller {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AdvancedWelcomeUtilities advancedWelcomeUtilities = new AdvancedWelcomeUtilities();
        System.out.println("write your name");
        String name = scanner.nextLine();
        System.out.println("Welcome write your surname");
        String surname =scanner.nextLine();
        advancedWelcomeUtilities.setName(name);
        advancedWelcomeUtilities.setSurname(surname);
        advancedWelcomeUtilities.printNameAndSurname();

    }
}
