/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package snakewithpartner;

import java.util.Scanner;

/**
 *
 * @author jmarchello
 */
public class Score {
    //Player's current score
    int score = 0;
    //Player's inputed score
    String userScore;
    //user input is "done"
    boolean done = false;
    //diplay players score
    public void displayScore(){
        System.out.println("Score: " + score);
    }
    
    //Add to score
    public void scoreAdd(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your score (or \"done\" to stop): ");
        do{
            this.userScore = input.next();
            switch (userScore) {
                case "100": 
                    score += 100;
                    System.out.println("Enter your score again (\"done\" to stop) : ");
                    break;
                case "done":
                    done = true;
                    break;
                default:
                    score -= 100;
                    System.out.println("Enter \"100\" or \"done\"\nEnter your score:");
                    break;
            }
        }while(done != true);
        System.out.println("Total score = " + score);
    }
}
