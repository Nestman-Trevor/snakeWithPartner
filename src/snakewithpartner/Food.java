/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakewithpartner;

import java.util.Random;

/**
 *
 * @author jmarchello
 */
public class Food {

    //Score value per food item collected by snake
    int scoreValue = 100;
    //random number generator to place food on the board
    Random generator = new Random();

    //Display score value per item collected
    public void displayScoreValue() {
        System.out.println("Each food item collected is worth " + scoreValue + "points.");
    }

    public int[][] newFood(int[][] board) {
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
