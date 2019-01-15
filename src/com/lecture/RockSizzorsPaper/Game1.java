package com.lecture.RockSizzorsPaper;

import java.util.Random;
import java.util.Scanner;

public class Game1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int youWin = 0;
        int compWin = 0;
        int draw = 0;

        System.out.print("Choose scissors(0), rock(1), paper(2), or -1 to end the game: ");

        while (youWin < 5 && compWin < 5) { // Reapet asking untils someone won 5 times
            int you = scanner.nextInt();
            int comp = random.nextInt(3);
            if (you == 0 && comp == 1) {
                System.out.println("You chose scissors. Computer chose rock. Computer wins!");
                compWin++;
                System.out.println("Count: " + youWin + ":" + compWin);
            } else if (you == 0 && comp == 2) {
                System.out.println("You chose scissors. Computer chose paper. You win!");
                youWin++;
                System.out.println("Count: " + youWin + ":" + compWin);
            } else if (you == 1 && comp == 0) {
                System.out.println("You chose rock. Computer chose scissors. You win!");
                youWin++;
                System.out.println("Count: " + youWin + ":" + compWin);
            } else if (you == 1 && comp == 2) {
                System.out.println("You chose rock. Computer chose paper. User2 wins!");
                compWin++;
                System.out.println("Count: " + youWin + ":" + compWin);
            } else if (you == 2 && comp == 0) {
                System.out.println("You chose paper. Computer chose scissors. User2 wins!");
                compWin++;
                System.out.println("Count: " + youWin + ":" + compWin);
            } else if (you == 2 && comp == 1) {
                System.out.println("You chose paper. Computer chose rock. You win!");
                youWin++;
                System.out.println("Count: " + youWin + ":" + compWin);
            } else if (you == 0 && comp == 0) {
                System.out.println("You chose scissors. Computer chose scissors. Its a draw!");
                draw++;
                System.out.println("Count: " + youWin + ":" + compWin);
            } else if (you == 1 && comp == 1) {
                System.out.println("You chose rock. Computer chose rock. Its a draw!");
                draw++;
                System.out.println("Count: " + youWin + ":" + compWin);
            } else if (you == 2 && comp == 2) {
                System.out.println("You chose paper. Computer chose paper. Its a draw!");
                draw++;
                System.out.println("Count: " + youWin + ":" + compWin);
            } else if (you < 0 || you > 2) {
                System.out.println("Invalid input, try again");
                continue;

            } else if (you == -1) {
                break;
            }
        }
        if (youWin > compWin) {
            System.out.println("Game over! You are the winner with count " + youWin + ":" + compWin);

        }
        if (youWin < compWin) {
            System.out.println("Game over! You are the winner with count " + youWin + ":" + compWin);
        }
    }
}
