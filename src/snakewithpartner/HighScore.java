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
        {"Jake", "2"},
        {"Nalla's Ex", "300"},
        {"Pigs", "4000"},
        {"Tim", "500"},
        {"Sim", "600"},
        {"Kim", "700"},
        {"myRim", "80"},
        {"Dim", "9000"},
        {"brainDead", "10"}
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
        String[][] newHighScores = new String[10][2];
        boolean isHighScore = false;
        String[][] highScores;
        highScores = new String[11][2];
        if (isValidScore(score)) {
            switch (difficulty) {
                //Easy difficulty sort
                case 1:
                    System.arraycopy( easyHighScores, 0, highScores, 0, highScores.length);
                    break;
                //Medium difficulty sort
                case 2:
                    System.arraycopy( mediumHighScores, 0, highScores, 0, highScores.length);
                    break;
                //Hard difficulty sort
                case 3:
                    System.arraycopy( hardHighScores, 0, highScores, 0, highScores.length);
                    break;
                default:
                    System.out.println("No difficulty");
                    return;
            }
            for (int t = 0; t < highScores.length; t++) {
                temp = parseInt(highScores[t][1]);
                if(score >= temp){
                    isHighScore = true;
                }
            }
            if(!isHighScore){
                System.out.println("Not a high score.");
                return;
            }
            highScores[10][0] = name;
            highScores[10][1] = Integer.toString(score);
            for (i = 1; i < highScores.length; i++) {
                temp = parseInt(highScores[i][1]);
                tempName = highScores[i][0];
                for(j = i-1;(j >= 0)&&(parseInt(highScores[j][1])<temp);j--){
                    highScores[j+1] = highScores[j];
                }
                highScores[j+1][1] = Integer.toString(temp);
                highScores[j+1][0] = tempName;
            }
            
//            for(int k = 0;k < 10;k++){
//                newHighScores[k] = highScores[k];
//            }
            switch(difficulty){
                case 1:
                    System.arraycopy(newHighScores, 0, easyHighScores, 0, 10);
                    this.displayHighScoreInfo(easyHighScores, "Easy High Scores");
                    break;
                case 2:
                    System.arraycopy(newHighScores, 0, mediumHighScores, 0, 10);
                    this.displayHighScoreInfo(mediumHighScores, "Medium High Scores");
                    break;
                case 3:
                    System.arraycopy(newHighScores, 0, hardHighScores, 0, 10);
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

}
