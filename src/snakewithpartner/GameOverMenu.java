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
public class GameOverMenu {
    //Menu items
    String option1 = "Play Again";
    String option2 = "High Scores";
    String option3 = "Exit";
    
    //Display Menu Items
    public void displayMenu(){
        System.out.println("1. " + option1 + "\n");
        System.out.println("2. " + option2 + "\n");
        System.out.println("3. " + option3 + "\n");
    }
}
