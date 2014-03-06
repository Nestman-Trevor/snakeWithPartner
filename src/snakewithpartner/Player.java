/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakewithpartner;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author trevornestman
 */
public class Player implements Serializable{

    //Sets the player string
    String name;
    private int score;
    private int difficulty;

    public Player(String name, int score, int difficulty) {
        this.name = name;
        this.score = score;
        this.difficulty = difficulty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }
    
    

    //We already have a score element... so I'm not sure if it's necessary
    //Display the Player's name
    public void displayName() {
        System.out.println(name);
    }

    public void askName() {
        Scanner input = SnakeWithPartner.getInFile();
        System.out.println("What's your name: ");
        name = input.next();
    }

    /**
     *
     * @author jmarchello
     */
    public class Score {

        //Player's current score
        int score = 0;
        //This variable will be stored elsewhere, but will be used to measure the difficulty
        int difficulty;
        //Player's inputed score
        String userScore;
        //user input is "done"
        boolean done = false;

        //diplay players score
        public void displayScore() {
            System.out.println("Score: " + score);
        }

        //Add to score
        public void scoreAdd() {
            Scanner input = SnakeWithPartner.getInFile();
            System.out.println("Enter your score (or \"done\" to stop): ");
            do {
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
            } while (done != true);
            System.out.println("Total score = " + score);
        }
    }

}
