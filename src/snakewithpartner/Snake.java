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



public class Snake {
    //current length of snake
    int length = 3; //snake is 3 sections long at start of game
    int xPosition = 0;
    int yPosition = 0;
    
    public void moveSnake(int xInput, int yInput){
       boolean xIsValid = false;
       boolean yIsValid = false;
       
        
       xIsValid = (xInput >= 0);
       yIsValid = (yInput >= 0);
       
       if (xIsValid){
           xInput = xPosition;
       }
       else {
           System.out.println("Invalid x value! Please enter new coordinates\n");
           return;
       }
       
       if (yIsValid){
           xInput = yPosition;
       }
       else {
           System.out.println("Invalid y value! Please enter new coordinates\n");
           return;
       }
       
       System.out.println("You are at X:");
       System.out.print(xPosition);        
       System.out.println(" Y:");
       System.out.print(yPosition);
       System.out.print("\n");
       return;
    }
    
    public void displaylength(){
        System.out.println("Snake Length: " + length);
    }
}
