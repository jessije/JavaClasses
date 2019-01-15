package com.lecture.RockSizzorsPaper;

import java.util.Random;

public class RandomComputerPlayer implements Player {
    private final Random random;

    public RandomComputerPlayer(Random random) {
        this.random = random;
    }

    public String play() {
        return CHOICES[this.random.nextInt(CHOICES.length)];
    }
}