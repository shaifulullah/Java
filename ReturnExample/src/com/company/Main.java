package com.company;

public class Main {

    public static void main(String[] args) {
        int highScore1 = calculateScore(true, 8000, 5, 100);
        System.out.println("High Score is : " + highScore1);
        int highScore2 = calculateScore(true, 10000, 8, 200);
        System.out.println("High Score is : " + highScore2);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        }
        return -1;
    }
}