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
public class Help {
    //The Title of the help munu
    String helpTitle = "Help and Instructions";
    //How to play the game
    String howToPlay = "Navigate the snake around the map and eat as much food as you can!"
            + "\nThe more you eat, the more points you get! Be careful to not run into the"
            + "\nwall or eat yourself! If you do that, game over.";
    //The controls title
    String controlsTitle = "Controls";
    String controlsList = "Left = the left arrow \nRight = the right arrow \n"
            + "Up = the up arrow \n Down = the down arrow";
    
    //Display all the help content
    public void displayHelp(){
        System.out.println(helpTitle + "\n" + howToPlay + "\n" + controlsTitle
            + "\n" + controlsList);
    }
}
