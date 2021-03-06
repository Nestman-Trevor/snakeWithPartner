/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakewithpartner.players;

import snakewithpartner.enums.Difficulty;
import java.io.Serializable;
import java.util.NoSuchElementException;
import java.util.Scanner;
import snakewithpartner.SnakeWithPartner;

/**
 *
 * @author trevornestman
 */
public class Player implements Serializable {

    //Sets the player string
    private String name;
    private Difficulty difficulty;
    private int score;

    public Player() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    //We already have a score element... so I'm not sure if it's necessary
    //Display the Player's name
    public void displayName() {
        System.out.println(name);
    }

    public void askName() {
        Scanner input = SnakeWithPartner.getInFile();
        System.out.println("What's your name: ");
        try {
            name = input.next();
        }
        catch(NoSuchElementException | IllegalStateException inEx){
            System.out.println("System failed to get input due to the following: " + inEx.getMessage());
        }
    }

    //diplay players score
    public void displayScore() {
        System.out.println("Score: " + score);
    }

    //Add to score
    public void addToScore() {
        switch (this.difficulty){
            case EASY:
                this.score += 100;
                break;
            case MEDIUM:
                this.score += 150;
                break;
            case HARD:
                this.score += 200;
                break;
            default:
                //handle error
                break;
        }
    }

}
