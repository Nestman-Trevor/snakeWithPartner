/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package snakewithpartner;

import java.awt.Color;

/**
 *
 * @author trevornestman
 */
public class Settings {
    //
    String settingsTitle = "Settings";
    //Initiates the sound boolean
    String settingsIntro = "\nWelcome to the settings menu! \nHere the sound can be"
            + "turned on and off and the color of the game can be changed."
            + "\n\nTurn the sound off and on here: ";
    boolean soundOn = true;
    //Initiates the color for the game and is set to green 
    String gameColorsIntro = "\nClick here to change the color of the game";
    Color gameColors = Color.green;
    
    //Toggle the sound
    public void displaySettings(){
        System.out.println(settingsTitle + " " + settingsIntro + " " + soundOn);
        System.out.println(gameColorsIntro + " " + gameColors.toString());
    }
}
