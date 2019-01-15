package com.lecture.RockSizzorsPaper;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        System.out.println("Hello, let's play");

        System.out.println("Please enter your figure");

        Scanner scanner = new Scanner(System.in);
        Player computer = new RandomComputerPlayer(new Random());
        Player human = new HumanPlayer(scanner);
        for (int i = 0; i < 5; i++) {
            String comp = computer.play();
            String you = human.play();
            System.out.println("Computer says: " + comp + ".");
            System.out.println("You say: " + you + ".");
            if (you.equals(comp)) {
                System.out.println("IT'S A TIE!");
            } else if (("Rock".equals(you) && "Scissors".equals(comp)) ||
                    ("Scissors".equals(you) && "Paper".equals(comp)) ||
                    ("Paper".equals(you) && "Rock".equals(comp))) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }

        }
    }
}