/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakewithpartner;

/**
 *
 * @author trevornestman
 */
public class HighScore {

    //High score title
    String highScoreTitle = "High Scores";
    //Declares the array of High Scores
    int easyHighScoreList[] = new int[10];
    int mediumHighScoreList[] = new int[10];
    int hardHighScoreList[] = new int[10];
    int tempArray[] = new int[10];

    //Display everything in High Score
    public void displayHighScoreInfo() {
        System.out.println(highScoreTitle + "\n");
        for (int i = 0; i <= 9; i++) {
            System.out.println("\n" + i + ". " + easyHighScoreList[i]);
        }
    }

    public void easyComputeHighScore(int score) {
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
    }

    public void resetHighScoreList() {
        for (int f = 0; f <= 9; f++) {
            easyHighScoreList[f] = 0;
        }
    }
}
