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
    int[] easyHighScoreList = {1000, 900, 800, 700, 600, 500, 400, 300, 200, 100};
    int mediumHighScoreList[] = new int[10];
    int hardHighScoreList[] = new int[10];
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
    
    public void easyComputeHighScore(double userScore) {
        int score = (int) userScore;
        if (isValidScore(score)) {
            if (score < easyHighScoreList[9]) {
                System.out.println("No high score");
                return;
            }
            //sets temperary array
            for (int r = 0; r < 10; r++) {
                tempArray[r] = easyHighScoreList[r];
            }
            //creates new array with scores moved and lowest score dropped
            for (int i = 0; i < 10; i++) {
                if (score >= easyHighScoreList[i]) {
                    tempArray[i] = score;
                    if (i != 9) {
                        for (int x = i + 1; x < 10; x++) {
                            tempArray[x] = easyHighScoreList[x - 1];
                        }
                    }
                    break;
                } else {
                    tempArray[i] = easyHighScoreList[i];
                }
            }
            for (int r = 0; r < 10; r++) {
                easyHighScoreList[r] = tempArray[r];
            }
            displayHighScoreInfo(easyHighScoreList, "Easy High Score List");
        } else {
            System.out.println("NOT A \'VALID\' SCORE");
        }
    }
    
    public void resetHighScoreList() {
        for (int f = 0; f <= 9; f++) {
            easyHighScoreList[f] = 0;
        }
    }

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
        
//        userScore = userInput.length();
//        char [] classy = userInput.toCharArray();
//        for (int i = 0; i < classy.length; i++) {
//            if (classy[i] == '0') {
//                
//            }
//        }
    }
}
