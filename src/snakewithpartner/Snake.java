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
    
    public void displaylength(){
        System.out.println("Snake Length: " + length);
    }
}
