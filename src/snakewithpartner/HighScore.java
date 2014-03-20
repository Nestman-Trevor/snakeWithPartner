/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakewithpartner;

import snakewithpartner.enums.Difficulty;
import java.io.Serializable;
import static java.lang.Integer.parseInt;
import java.util.Scanner;
import static snakewithpartner.enums.Difficulty.*;

/**
 *
 * @author trevornestman
 */
public class HighScore implements Serializable{
    
    //High score title
    private String highScoreTitle = "High Scores";

    //Declares the array of High Scores
    private String easyHighScores[][] = {
        {"Josh", "10000"},
        {"Trevor", "2"},
        {"Josh", "300"},
        {"Erik", "4000"},
        {"aGoodMan", "500"},
        {"MyPuppy", "600"},
        {"aPossummm", "700"},
        {"Tim", "80"},
        {"Air", "9000"},
        {"Trevor", "10"}
    };
    private String mediumHighScores[][] = {
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
    private String hardHighScores[][] = {
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

    private String num = "12";

    private String userInput;

    public HighScore(String userInput) {
        this.userInput = userInput;
    }

    public String getHighScoreTitle() {
        return highScoreTitle;
    }

    public void setHighScoreTitle(String highScoreTitle) {
        this.highScoreTitle = highScoreTitle;
    }

    public String[][] getEasyHighScores() {
        return easyHighScores;
    }

    public void setEasyHighScores(String[][] easyHighScores) {
        this.easyHighScores = easyHighScores;
    }

    public String[][] getMediumHighScores() {
        return mediumHighScores;
    }

    public void setMediumHighScores(String[][] mediumHighScores) {
        this.mediumHighScores = mediumHighScores;
    }

    public String[][] getHardHighScores() {
        return hardHighScores;
    }

    public void setHardHighScores(String[][] hardHighScores) {
        this.hardHighScores = hardHighScores;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getUserInput() {
        return userInput;
    }

    public void setUserInput(String userInput) {
        this.userInput = userInput;
    }
    
    

    //Display everything in High Score
    public void displayHighScoreInfo(String[][] highScoreList, String highScoreTitle) {
        System.out.println(highScoreTitle + "\n");
        for (int i = 0; i < highScoreList.length; i++) {
            System.out.println((i + 1) + ". " + highScoreList[i][0] + " " + highScoreList[i][1]);
        }
    }

    //Sorts high score list
    public void addToHighScores(Player player) {
        int i, j, temp;
        String tempName;
        String[][] newHighScores = new String[11][2];
        boolean isHighScore = false;
        String[][] highScores;
        highScores = new String[10][2];
        if (isValidScore(player.getScore())) {
            switch (player.getDifficulty()) {
                //Easy difficulty sort
                case EASY:
                    for (int k = 0; k < easyHighScores.length; k++) {
                        highScores[k][0] = easyHighScores[k][0];
                        highScores[k][1] = easyHighScores[k][1];
                    }
                    break;
                //Medium difficulty sort
                case MEDIUM:
                    for (int k = 0; k < mediumHighScores.length; k++) {
                        highScores[k][0] = mediumHighScores[k][0];
                        highScores[k][1] = mediumHighScores[k][1];
                    }
                    break;
                //Hard difficulty sort
                case HARD:
                    for (int k = 0; k < hardHighScores.length; k++) {
                        highScores[k][0] = hardHighScores[k][0];
                        highScores[k][1] = hardHighScores[k][1];
                    }
                    break;
                default:
                    System.out.println("No difficulty");
                    return;
            }

            isHighScore = isHighScore(highScores, player.getScore());

            if (!isHighScore) {
                System.out.println("Not a high score.");
                return;
            }
            for (int k = 0; k < highScores.length; k++) {
                newHighScores[k][0] = highScores[k][0];
                newHighScores[k][1] = highScores[k][1];
            }
            newHighScores[10][0] = player.getName();
            newHighScores[10][1] = Integer.toString(player.getScore());
            for (j = 1; j < newHighScores.length; j++) {
                temp = parseInt(newHighScores[j][1]);
                tempName = newHighScores[j][0];
                for (i = j - 1; (i >= 0) && (parseInt(newHighScores[i][1]) < temp); i--) {
                    newHighScores[i + 1][1] = newHighScores[i][1];
                    newHighScores[i + 1][0] = newHighScores[i][0];
                }
                newHighScores[i + 1][1] = Integer.toString(temp);
                newHighScores[i + 1][0] = tempName;
            }

            switch (player.getDifficulty()) {
                case EASY:
                    for (int k = 0; k < (newHighScores.length - 1); k++) {
                        easyHighScores[k][0] = newHighScores[k][0];
                        easyHighScores[k][1] = newHighScores[k][1];
                    }
                    this.displayHighScoreInfo(easyHighScores, "Easy High Scores");
                    break;
                case MEDIUM:
                    for (int k = 0; k < (newHighScores.length - 1); k++) {
                        mediumHighScores[k][0] = newHighScores[k][0];
                        mediumHighScores[k][1] = newHighScores[k][1];
                    }
                    this.displayHighScoreInfo(mediumHighScores, "Medium High Scores");
                    break;
                case HARD:
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

        //This next part is to test the displayHighScoreWithName() function
        Scanner input = SnakeWithPartner.getInFile();
        System.out.println("Do you want to view the high score's with your name? (\'y\' or \'n\'): ");
        if (input.hasNext("y")) {
            displayHighScoreWithName(player);
        } else {
            System.out.println("Thanks anyways!");
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

    public void displayHighScoreWithName(Player player) {
        String[][] highScores = returnTempList(player.getDifficulty());
        int level = 0;
        for(String list[]: highScores){
            if(player.getName().equals(list[0])){
                highScores[level][0] = "*** " + list[0];
            }
            level++;
        }
        this.displayHighScoreInfo(highScores, this.difficultyLevelString(player.getDifficulty()));
    }

    private String[][] returnTempList(Difficulty difficulty) {
        String[][] tempList;
        switch (difficulty) {
            case EASY:
                tempList = easyHighScores;
                break;
            case MEDIUM:
                tempList = mediumHighScores;
                break;
            case HARD:
                tempList = hardHighScores;
                break;
            default:
                tempList = null;
                System.out.println("Invalid difficulty");
                break;
        }
        return tempList;
    }
    
    private String difficultyLevelString(Difficulty difficulty){
        String levelDifficulty;
        switch (difficulty) {
            case EASY:
                levelDifficulty = "Easy";
                break;
            case MEDIUM:
                levelDifficulty = "Medium";
                break;
            case HARD:
                levelDifficulty = "Hard";
                break;
            default:
                levelDifficulty = null;
                System.out.println("Invalid difficulty");
                break;
        }
        return levelDifficulty;
    }
}
