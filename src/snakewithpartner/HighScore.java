/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakewithpartner;

import java.util.Scanner;

/**
 *
 * @author trevornestman
 */
public class HighScore {

    //High score title
    String highScoreTitle = "High Scores";
    //Declares the array of High Scores
    //These will be moved to a file soon to record and keep track of high scores
    int[] easyHighScoreList = {1000, 900, 800, 700, 600, 500, 400, 300, 200, 100};
    int mediumHighScoreList[] = {1000, 900, 800, 700, 600, 500, 400, 300, 200, 100};
    int hardHighScoreList[] = {1000, 900, 800, 700, 600, 500, 400, 300, 200, 100};
    //Creates an array that is used to copy over high scores in temporary storage
    int tempArray[] = new int[10];
    
    double userScore;
    String userInput;

    //Display everything in High Score
    public void displayHighScoreInfo(int[] highScoreList, String highScoreTitle) {
        System.out.println(highScoreTitle + "\n");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + ". " + highScoreList[i - 1]);
        }
    }
    
    private boolean isValidScore(int score) {
        boolean isValid = (score >= 0);
        return isValid;
    }
    /*
    *This function will attempt to place the player's score within the easy high score list
    *If the score isn't high enough,it won't be put into the list
    *If the scores are exactly the same the most recent score will bump down the other score.
    */
    public void easyComputeHighScore(double userScore) {
        int score = (int) userScore;
        if (isValidScore(score)) {
            if (score < easyHighScoreList[9]) {
                System.out.println("No high score");
                return;
            }
            //sets temporary array
            for (int r = 0; r < 10; r++) {
                tempArray[r] = easyHighScoreList[r];
            }
            //creates new array with scores moved and lowest score dropped
            for (int i = 0; i < 10; i++) {
                if (score >= easyHighScoreList[i]) {
                    tempArray[i] = score;
                    //checks to see if it's not at the last score
                    if (i != 9) {
                        //sets the internal control variable to one more than the other control variable
                        for (int x = i + 1; x < 10; x++) {
                            tempArray[x] = easyHighScoreList[x - 1];
                        }
                    }
                    break;
                } else {
                    tempArray[i] = easyHighScoreList[i];
                }
            }
            //copies the temporary array back to the easy high score list
            for (int r = 0; r < 10; r++) {
                easyHighScoreList[r] = tempArray[r];
            }
            displayHighScoreInfo(easyHighScoreList, "Easy High Score List");
        } else {
            System.out.println("NOT A \'VALID\' SCORE");
        }
    }
    /*
    *This function will attempt to place the player's score within the medium high score list
    *If the score isn't high enough,it won't be put into the list
    *If the scores are exactly the same the most recent score will bump down the other score.
    */
    public void mediumComputeHighScore(double userScore) {
        int score = (int) userScore;
        if (isValidScore(score)) {
            if (score < mediumHighScoreList[9]) {
                System.out.println("No high score");
                return;
            }
            //sets temporary array
            for (int r = 0; r < 10; r++) {
                tempArray[r] = mediumHighScoreList[r];
            }
            //creates new array with scores moved and lowest score dropped
            for (int i = 0; i < 10; i++) {
                if (score >= mediumHighScoreList[i]) {
                    tempArray[i] = score;
                    //checks to see if it's not at the last score
                    if (i != 9) {
                        //sets the internal control variable to one more than the other control variable
                        for (int x = i + 1; x < 10; x++) {
                            tempArray[x] = mediumHighScoreList[x - 1];
                        }
                    }
                    break;
                } else {
                    tempArray[i] = mediumHighScoreList[i];
                }
            }
            //copies the temporary array back to the medium high score list
            for (int r = 0; r < 10; r++) {
                mediumHighScoreList[r] = tempArray[r];
            }
            displayHighScoreInfo(mediumHighScoreList, "Medium High Score List");
        } else {
            System.out.println("NOT A \'VALID\' SCORE");
        }
    }
    /*
    *This function will attempt to place the player's score within the hard high score list
    *If the score isn't high enough,it won't be put into the list
    *If the scores are exactly the same the most recent score will bump down the other score.
    */
    public void hardComputeHighScore(double userScore) {
        int score = (int) userScore;
        if (isValidScore(score)) {
            if (score < hardHighScoreList[9]) {
                System.out.println("No high score");
                return;
            }
            //sets temporary array
            for (int r = 0; r < 10; r++) {
                tempArray[r] = hardHighScoreList[r];
            }
            //creates new array with scores moved and lowest score dropped
            for (int i = 0; i < 10; i++) {
                if (score >= hardHighScoreList[i]) {
                    tempArray[i] = score;
                    //checks to see if it's not at the last score
                    if (i != 9) {
                        //sets the internal control variable to one more than the other control variable
                        for (int x = i + 1; x < 10; x++) {
                            tempArray[x] = hardHighScoreList[x - 1];
                        }
                    }
                    break;
                } else {
                    tempArray[i] = hardHighScoreList[i];
                }
            }
            //copies the temporary array back to the hard high score list
            for (int r = 0; r < 10; r++) {
                hardHighScoreList[r] = tempArray[r];
            }
            displayHighScoreInfo(hardHighScoreList, "Hard High Score List");
        } else {
            System.out.println("NOT A \'VALID\' SCORE");
        }
    }
    
    //Used to test the high score list and when a new score is entered.
    public void testHighScore() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your score: ");
        while (input.hasNext()){
            if (input.hasNextDouble()){
                userScore = input.nextDouble();
                this.easyComputeHighScore(userScore);
                return;
            }
            else{
                System.out.println("Invalid input. Numbers only.");
                return;
            }
        }
    }
}
