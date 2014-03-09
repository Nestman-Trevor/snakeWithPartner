/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package snakewithpartner;

import java.awt.Color;
import java.io.Serializable;

/**
 *
 * @author trevornestman
 */
public class Settings implements Serializable{
    //
    private final String settingsTitle = "Settings";
    //Initiates the sound boolean
    private final String settingsIntro = "\nWelcome to the settings menu! \nHere the sound can be"
            + "turned on and off and the color of the game can be changed."
            + "\n\nTurn the sound off and on here: ";
    private boolean soundOn = true;
    //Initiates the color for the game and is set to green 
    private final String gameColorsIntro = "\nClick here to change the color of the game";
    private Color gameColors = Color.green;

    public Settings() {
    }

    public boolean isSoundOn() {
        return soundOn;
    }

    public void setSoundOn(boolean soundOn) {
        this.soundOn = soundOn;
    }

    public Color getGameColors() {
        return gameColors;
    }

    public void setGameColors(Color gameColors) {
        this.gameColors = gameColors;
    }
    
    
    
    //Toggle the sound
    public void displaySettings(){
        System.out.println(settingsTitle + " " + settingsIntro + " " + soundOn);
        System.out.println(gameColorsIntro + " " + gameColors.toString());
    }
}
