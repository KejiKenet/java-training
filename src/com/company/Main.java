package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("Your final score was " + highScore);

        int highScore1 = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore1);

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Bob", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Kenneth", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Kelechi", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("David", highScorePosition);

        long miles = SpeedConverter.toMilesPerHour(10.5);

        SpeedConverter.printConversion(10.5);

        PositiveNegativeZero.calcFeetAndInchesToCentimeters(7, 5);

        PositiveNegativeZero.getDurationString(65, 45);

    }



    public static void  displayHighScorePosition(String playerName, int highScorePosition){
        System.out.println(playerName + " managed to get into position " +
                highScorePosition + " on the high score table");
    }

    public static  int calculateHighScorePosition(int playerScore){
      /*  if (playerScore >= 1000){
            return 1;
        }else if (playerScore >= 500){
            return 2;
        }else if (playerScore >= 100){
            return 3;
        }else
            return 4;*/
      int position = 4; //assuming position 4 will be returned

        if (playerScore >= 1000){
            position = 1;
        } else if (playerScore >= 500){
            position = 2;
        } else if (playerScore >= 100){
            position = 3;
        }

        return position;
    }

    private static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;

            return finalScore;
        }

        return -1;
    }


}
