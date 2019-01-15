package com.lecture.RockSizzorsPaper;

import java.util.Scanner;

public class RPS {
    String comparableChoice;
    String userComparableChoice;


    public String startGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose, (1)Rock, (2)Paper or (3)Scissors");
        System.out.println("enter number: 1,2 or 3");
        int userChoice = scanner.nextInt();

        if (userChoice == 1) {
            System.out.println("Your choice: Rock");
            userComparableChoice = "Rock";
        } else if (userChoice == 2) {
            System.out.println("Your choice: Paper");
            userComparableChoice = "Paper";
        } else if (userChoice == 3) {
            System.out.println("Your choice: Scissors");
            userComparableChoice = "Scissors";
        } else if (userChoice < 1 || userChoice > 3) {
            System.out.println("It's wrong input");

        }
        return userComparableChoice;
    }

    public String computerChoice() {
        int computerChoiceNumber = (int) (Math.random() * 10);
        if (computerChoiceNumber <= 3) {
            System.out.println("Computer choice: Rock");
            comparableChoice = "Rock";
        } else if (computerChoiceNumber <= 6) {
            System.out.println("Computer choice: Paper");
            comparableChoice = "Paper";
        } else {
            System.out.println("Computer choice: Scissors");
            comparableChoice = "Scissors";
        }
        return comparableChoice;
    }

    public boolean evaluateGame(String userFormal, String computerFormal) {

        if (userFormal.equals(computerFormal)) {
            System.out.println("It's a tie");
            return true;
        } else if (userFormal.equalsIgnoreCase("Rock") && computerFormal.equalsIgnoreCase("Scissors")) {
            System.out.println("You won!");
            return true;
        } else if (userFormal.equalsIgnoreCase("Paper") && computerFormal.equalsIgnoreCase("Rock")) {
            System.out.println("You won");
            return true;
        } else if (userFormal.equalsIgnoreCase("Scissors") && computerFormal.equalsIgnoreCase("Paper")) {
            System.out.println("You won");
            return true;
        } else {
            System.out.println("computer won");

        }
        return false;
    }
}

