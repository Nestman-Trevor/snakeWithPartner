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
public class MainMenu {
    //The main title
    String mainMenuTitle = "Main Menu";
    //Button names
    String settingsButtonName = "Settings";
    String playButtonName = "Play";
    String helpButtonName = "Help";
    String highScoreButtonName = "High Score";
    
    //Displays title of Main menu and the buttons
    public void displayTitles(){
        System.out.println(mainMenuTitle + " " + settingsButtonName + " "
         + playButtonName + " " + helpButtonName + " " + highScoreButtonName);
    }
}
