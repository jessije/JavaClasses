package com.lecture.RockSizzorsPaper;


import java.util.Scanner;

public class HumanPlayer implements Player {
        private final Scanner scanner;
    public HumanPlayer(Scanner scanner) {
        this.scanner = scanner;
    }
    public String play() {
        System.out.println("Select 1, 2, or 3 for Rock, Paper, Scissors");
        int choice = this.scanner.nextInt();
        return CHOICES[choice - 1];
    }
}

