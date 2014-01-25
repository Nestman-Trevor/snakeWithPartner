/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package snakewithpartner;

/**
 *
 * @author trevornestman
 */
public class PlayMenu {
    //Title of play menu
    String playMenuTitle = "Play";
    //The titles of the difficulty levels
    String easyTitle = "Easy";
    String mediumTitle = "Medium";
    String hardTitle = "Hard";
    
    //This displays the strings within the PlayMenu
    public void displayPlayMenuStrings(){
        System.out.println(playMenuTitle + " " + easyTitle + " " + mediumTitle 
                + " " + hardTitle);
    }
}
