/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package snakewithpartner;

/**
 *
 * @author jmarchello
 */

public class Board{
    //Height and Width of board in pixels
    int height = 400;
    int width = 400;
    
    /*
    *This will be the board for the game.
    *Numerical values will mark the value of what the board space is...
    *       0 = blank
    *       1 = border
    *       2 = food
    *       3 = head
    *       4 = tail
    */
    int[][] board = new int[50][50];
    
    Food food = new Food();
    
    //Display board's height and width
    public void displayBoardSize(){
        System.out.println("The board is " + height + " pixels by " + width + "pixels");
    }
    //Displays the board in console and tests the fill board and food
    public void displayBoard(){
        this.fillBoard();
        board = food.newFood(board);
        for(int i = 0;i < board.length;i++){
            System.out.println();
            for(int j = 0;j < board.length;j++){
                System.out.print(board[i][j]);
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
    
}

