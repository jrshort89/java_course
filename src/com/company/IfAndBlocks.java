package com.company;

public class IfAndBlocks {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;
        if (score == 5000)
            System.out.println("Score is 5000");
        int highScore = calculateScore(100, 7000, 2);
        System.out.println("this is my custom high score: " + highScore);

        System.out.println("The if statement has no code block");

//        if (levelCompleted < 5) {
//            System.out.println("Get to level 5!");
//        } else if (levelCompleted == 5) {
//            System.out.println("Great work on level 5.");
//        } else {
//            System.out.println("You're a master.");
//        }

        if (gameOver) {
            calculateScore(score, levelCompleted, bonus);
        }

        for (int i = 0; i < 100; i++) {
            System.out.println("This is the number " + i);
        }

    }

    public static int calculateScore(int score, int level, int bonus) {
        int finalScore = score + (level * bonus);
        System.out.println("Final score: " + finalScore);
        return finalScore;
    }
}
