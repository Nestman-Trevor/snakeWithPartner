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
    int highScoreList[] = new int[10];
    
    //Display everything in High Score
    public void displayHighScoreInfo(){
        System.out.println(highScoreTitle + "\n");
        for(int i = 0;i <= 9;i++){
            System.out.println("\n" + i + ". " + highScoreList[i]);
        }
    }
    public void addToHighScore(int score){
        if (score > highScoreList[9]){
            
        }
        else{}
    }
    public void resetHighScoreList(){
        for(int f = 0;f <= 9;f++){
            highScoreList[f] = 0;
        }
    }
}
