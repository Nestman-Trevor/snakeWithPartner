/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakewithpartner;

import java.io.Serializable;
import java.util.Random;

/**
 *
 * @author jmarchello
 */
public class Food implements Serializable{

    
    //Score value per food item collected by snake
    private int easyValue = 100;
    
    private int mediumValue = 125;
    
    private int hardValue = 150;
    
    private int currentFoodValue = 100;
    
    public int getEasyValue() {
        return easyValue;
    }

    public void setEasyValue(int easyValue) {
        this.easyValue = easyValue;
    }

    public int getMediumValue() {
        return mediumValue;
    }

    public void setMediumValue(int mediumValue) {
        this.mediumValue = mediumValue;
    }

    public int getHardValue() {
        return hardValue;
    }

    public void setHardValue(int hardValue) {
        this.hardValue = hardValue;
    }

    public int getCurrentFoodValue() {
        return currentFoodValue;
    }

    public void setCurrentFoodValue(int currentFoodValue) {
        this.currentFoodValue = currentFoodValue;
    }


    //Display score value per item collected
    public void setCurrentValWithDifficulty(Player player) {
        switch (player.getDifficulty()){
            case EASY:
                currentFoodValue = easyValue;
                break;
            case MEDIUM:
                currentFoodValue = mediumValue;
                break;
            case HARD:
                currentFoodValue = hardValue;
                break;
            default:
                System.out.println("*!!!No difficulty found!!!*");
                return;
        }
    }

    public int[][] newFood(int[][] board) {
        Random generator = SnakeWithPartner.getGenerator();
        //integers used to place down food
        int xFood;
        int yFood;
        boolean isValidSpace = false;
        do {
            //The following will get random coordinantes to place the food on the board
            //It subtracts two from the possibility and then adds one so it won't get
            //a number that isn't usable. It adds one so that it's not equal to the border.
            xFood = generator.nextInt(board.length - 2);
            xFood += 1;
            yFood = generator.nextInt(board.length - 2);
            yFood += 1;
            if (board[xFood][yFood] == 0) {
                board[xFood][yFood] = 2;
                isValidSpace = true;
            }
        } while (!isValidSpace);
        return board;
    }
}
