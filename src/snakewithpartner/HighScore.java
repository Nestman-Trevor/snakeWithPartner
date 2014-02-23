/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakewithpartner;

import static java.lang.Integer.parseInt;
import java.util.Scanner;
import java.lang.*;

/**
 *
 * @author trevornestman
 */
public class HighScore {

    //High score title
    String highScoreTitle = "High Scores";

    //Declares the array of High Scores
    String easyHighScores[][] = {
        {"Josh", "10000"},
        {"O'bummer", "2"},
        {"aDeadBaby", "300"},
        {"10bleadingCaterpillers", "4000"},
        {"aGoodMan", "500"},
        {"MyPuppy", "600"},
        {"aPossummm", "700"},
        {"miTio", "80"},
        {"Air", "9000"},
        {"BadPerson", "10"}
    };
    String mediumHighScores[][] = {
        {"Simba", "10000"},
        {"Jake", "20000"},
        {"Nalla's Ex", "30000"},
        {"Pigs", "40000"},
        {"Tim", "50000"},
        {"Sim", "60000"},
        {"Kim", "70000"},
        {"myRim", "80000"},
        {"Dim", "90000"},
        {"brainDead", "100000"}
    };
    String hardHighScores[][] = {
        {"H1N1", "10000"},
        {"CommonCold", "2"},
        {"BirdFlu", "300"},
        {"Ebola", "4000"},
        {"OldAge", "500"},
        {"Spiders", "600"},
        {"Josh", "700"},
        {"2Hard4Me", "80"},
        {"Potassium", "9000"},
        {"where'sTheAnyKey?", "10"}
    };

    String num = "12";
    //This is the score that the player got that will be sent to the array of high scores
    int userScore;
    //This variable will be stored elsewhere, but will be used to measure the difficulty
    int difficulty;
    String userInput;

    //Display everything in High Score
    public void displayHighScoreInfo(String[][] highScoreList, String highScoreTitle) {
        System.out.println(highScoreTitle + "\n");
        for (int i = 0; i < highScoreList.length; i++) {
            System.out.println((i + 1) + ". " + highScoreList[i][0] + " " + highScoreList[i][1]);
        }
    }

    //Sorts high score list
    public void addToHighScores(String name, int score, int difficulty) {
        int i, j, temp;
        String tempName;
        String[][] newHighScores = new String[11][2];
        boolean isHighScore = false;
        String[][] highScores;
        highScores = new String[10][2];
        if (isValidScore(score)) {
            switch (difficulty) {
                //Easy difficulty sort
                case 1:
                    for (int k = 0; k < easyHighScores.length; k++) {
                        highScores[k][0] = easyHighScores[k][0];
                        highScores[k][1] = easyHighScores[k][1];
                    }
                    break;
                //Medium difficulty sort
                case 2:
                    for (int k = 0; k < mediumHighScores.length; k++) {
                        highScores[k][0] = mediumHighScores[k][0];
                        highScores[k][1] = mediumHighScores[k][1];
                    }
                    break;
                //Hard difficulty sort
                case 3:
                    for (int k = 0; k < hardHighScores.length; k++) {
                        highScores[k][0] = hardHighScores[k][0];
                        highScores[k][1] = hardHighScores[k][1];
                    }
                    break;
                default:
                    System.out.println("No difficulty");
                    return;
            }
            
            isHighScore = isHighScore(highScores, score);
            
            if (!isHighScore) {
                System.out.println("Not a high score.");
                return;
            }
            for (int k = 0; k < highScores.length; k++) {
                newHighScores[k][0] = highScores[k][0];
                newHighScores[k][1] = highScores[k][1];
            }
            newHighScores[10][0] = name;
            newHighScores[10][1] = Integer.toString(score);
            for (j = 1; j < newHighScores.length; j++) {
                temp = parseInt(newHighScores[j][1]);
                tempName = newHighScores[j][0];
                for (i = j - 1;(i >= 0) && (parseInt(newHighScores[i][1]) < temp); i--) {
                    newHighScores[i + 1][1] = newHighScores[i][1];
                    newHighScores[i + 1][0] = newHighScores[i][0];
                }
                newHighScores[i + 1][1] = Integer.toString(temp);
                newHighScores[i + 1][0] = tempName;
            }

            switch (difficulty) {
                case 1:
                    for (int k = 0; k < (newHighScores.length - 1); k++) {
                        easyHighScores[k][0] = newHighScores[k][0];
                        easyHighScores[k][1] = newHighScores[k][1];
                    }
                    this.displayHighScoreInfo(easyHighScores, "Easy High Scores");
                    break;
                case 2:
                    for (int k = 0; k < (newHighScores.length - 1); k++) {
                        mediumHighScores[k][0] = newHighScores[k][0];
                        mediumHighScores[k][1] = newHighScores[k][1];
                    }
                    this.displayHighScoreInfo(mediumHighScores, "Medium High Scores");
                    break;
                case 3:
                    for (int k = 0; k < (newHighScores.length - 1); k++) {
                        hardHighScores[k][0] = newHighScores[k][0];
                        hardHighScores[k][1] = newHighScores[k][1];
                    }
                    this.displayHighScoreInfo(hardHighScores, "Hard High Scores");
                    break;
                default:
                    System.out.println("Invalid difficulty");
                    return;
            }
        } else {
            System.out.println("Not a valid score.");
        }
    }

    private boolean isValidScore(int score) {
        boolean isValid = (score >= 0);
        return isValid;
    }

    private boolean isHighScore(String[][] highScores, int score) {
        boolean isHighScore = false;
        for (String[] hScore : highScores) {
            int hScoreNumber = parseInt(hScore[1]);
            if (score >= hScoreNumber) {
                isHighScore = true;
            }
        }
        return isHighScore;
    }

}
