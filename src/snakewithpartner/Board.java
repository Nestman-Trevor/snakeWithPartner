/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package snakewithpartner;

import java.io.Serializable;

/**
 *
 * @author jmarchello
 */

public class Board implements Serializable{
    //Height and Width of board in pixels
    private int height = 400;
    private int width = 400;
    
    /*
    *This will be the board for the game.
    *Numerical values will mark the value of what the board space is...
    *       0 = blank
    *       1 = border
    *       2 = food
    *       3 = head
    *       4 = tail
    */
    private int[][] board = new int[50][50];
    
    Food food = new Food();
    
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int[][] getBoard() {
        return board;
    }

    public void setBoard(int[][] board) {
        this.board = board;
    }
    
    //Display board's height and width
    public void displayBoardSize(){
        System.out.println("The board is " + height + " pixels by " + width + "pixels");
    }
    //Displays the board in console
    public void displayBoard(){
        for(int i = 0;i < getBoard().length;i++){
            System.out.println();
            for(int j = 0;j < getBoard().length;j++){
                System.out.print(getBoard()[i][j]);
            }
        }
    }
    //Fills the board with the border and the blank spaces
    private void fillBoard(){
        for(int i = 0;i < board.length;i++){
            for(int j = 0;j < board.length;j++){
                if(i == 0 || j == 0 || i == 49 || j == 49){
                    board[i][j] = 1;
                }
                else{
                    board[i][j] = 0;
                }
            }
        }
    }
    //add food to the board
    public void foodToBoard(){
        board = food.newFood(board);
    }
    
}

