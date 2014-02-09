/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package snakewithpartner;

/**
 *
 * @author Josh
 */
public class MainMenuControl {
    public void launchPlayMenu() {
        PlayMenuView playMenu = new PlayMenuView();
        playMenu.getPlayerSelection();
    }
    
    public void displayHighScores() {
        this.displayBorder();
        System.out.println("\t\tThis will eventually show all high score lists, \n"
                + "or a menu to choose which list to show");
        this.displayBorder();
    }
    
    public void launchSettingsMenu() {
        this.displayBorder();
        System.out.println("\t\tThis will launch settings menu after the game is more developed");
        this.displayBorder();
    }
    
    public void launchHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.getPlayerSelection();
    }

    public void displayBorder() {
        System.out.println(
                "\t-----------------------------------------------------------------------------");
    }    
}
