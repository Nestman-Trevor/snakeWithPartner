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
public class Food {
    //Score value per food item collected by snake
    int scoreValue = 100;
    
    //Display score value per item collected
    public void displayScoreValue(){
        System.out.println("Each food item collected is worth " + scoreValue + "points.");
    }
}
