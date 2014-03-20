/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakewithpartner.menus;

import snakewithpartner.SnakeWithPartner;
import java.util.Scanner;

/**
 *
 * @author trevornestman
 */
public class MainMenuView extends Menu{

    //List of options the player can select from
    private final static String[][] menuItems = {
        {"1", "Play"},
        {"2", "High Scores"},
        {"3", "Settings"},
        {"4", "Help"},
        {"0", "exit"}
    };

    // Create instance of the HelpMenuControl (action) class
    private MainMenuControl mainMenuControl = new MainMenuControl();

    public MainMenuView(){
        super(MainMenuView.menuItems);
    }
    
    @Override
    public void getInput() {
        String selection;

        do {
            this.displayMenu();
            Scanner input = SnakeWithPartner.getInFile();
            selection = input.nextLine();
            switch (selection) {
                case "1":
                    this.mainMenuControl.launchPlayMenu();
                    break;
                case "2":
                    this.mainMenuControl.displayHighScores();
                    break;
                case "3":
                    this.mainMenuControl.launchSettingsMenu();
                    break;
                case "4":
                    this.mainMenuControl.launchHelpMenu();
                    break;
                case "0":
                    break;
                default:
                    System.out.println("Please enter a valid menu item:");
                    continue;
            }
        } while (!selection.equals("0"));
    }

    @Override
    public void display() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private class MainMenuControl {

        public void launchPlayMenu() {
            PlayMenuView playMenu = new PlayMenuView();
            playMenu.getInput();
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
            helpMenu.getInput();
        }

        private void displayBorder() {
            System.out.println(
                    "\t-----------------------------------------------------------------------------");
        }
    }
}
