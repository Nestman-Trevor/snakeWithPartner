/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakewithpartner.players;

import snakewithpartner.enums.Difficulty;
import java.io.Serializable;
import static java.lang.Integer.parseInt;
import java.util.Scanner;
import snakewithpartner.SnakeWithPartner;
import static snakewithpartner.enums.Difficulty.*;

/**
 *
 * @author trevornestman
 */
public class HighScore implements Serializable {

    //High score title
    private String highScoreTitle = "High Scores";

    //Declares the array of High Scores
    private String easyHighScores[][] = {
        {"Josh", "1400"},
        {"Trevor", "1300"},
        {"Josh", "1200"},
        {"Erik", "1100"},
        {"aGoodMan", "1000"},
        {"MyPuppy", "900"},
        {"aPossummm", "800"},
        {"Tim", "700"},
        {"Air", "600"},
        {"Trevor", "500"}
    };
    private String mediumHighScores[][] = {
        {"Josh", "1400"},
        {"Trevor", "1300"},
        {"Josh", "1200"},
        {"Erik", "1100"},
        {"aGoodMan", "1000"},
        {"MyPuppy", "900"},
        {"aPossummm", "800"},
        {"Tim", "700"},
        {"Air", "600"},
        {"Trevor", "500"}
    };
    private String hardHighScores[][] = {
        {"Josh", "1400"},
        {"Trevor", "1300"},
        {"Josh", "1200"},
        {"Erik", "1100"},
        {"aGoodMan", "1000"},
        {"MyPuppy", "900"},
        {"aPossummm", "800"},
        {"Tim", "700"},
        {"Air", "600"},
        {"Trevor", "500"}
    };

    private String num = "12";

    private String userInput;

    public HighScore() {
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
    public boolean addToHighScores(Player player) {

        try {
            int i, j, temp = 0;
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
                        return false;
                }

                isHighScore = isHighScore(highScores, player.getScore());

                if (!isHighScore) {
                    System.out.println("Not a high score.");
                    return false;
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
                        return true;
                    case MEDIUM:
                        for (int k = 0; k < (newHighScores.length - 1); k++) {
                            mediumHighScores[k][0] = newHighScores[k][0];
                            mediumHighScores[k][1] = newHighScores[k][1];
                        }
                        return true;
                    case HARD:
                        for (int k = 0; k < (newHighScores.length - 1); k++) {
                            hardHighScores[k][0] = newHighScores[k][0];
                            hardHighScores[k][1] = newHighScores[k][1];
                        }
                        return true;
                    default:
                        System.out.println("Invalid difficulty");
                        return false;
                }
            } else {
                System.out.println("Not a valid score.");
                return false;
            }

            //This next part is to test the displayHighScoreWithName() function
//            Scanner input = SnakeWithPartner.getInFile();
//            System.out.println("Do you want to view the high score's with your name? (\'y\' or \'n\'): ");
//            if (input.hasNext("y")) {
//                displayHighScoreWithName(player);
//            } else {
//                System.out.println("Thanks anyways!");
//            }
        } catch (NumberFormatException numEx) {
            System.out.println("Error adding score to High Scores.\n"
                    + numEx.getMessage());
        }
        return false;
    }

    private boolean isValidScore(int score) {
        boolean isValid = (score >= 0);
        return isValid;
    }

    private boolean isHighScore(String[][] highScores, int score) throws NumberFormatException{
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
        for (String list[] : highScores) {
            if (player.getName().equals(list[0])) {
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

    private String difficultyLevelString(Difficulty difficulty) {
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
