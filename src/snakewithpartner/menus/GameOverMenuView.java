/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakewithpartner.menus;

import java.util.Scanner;
import snakewithpartner.SnakeWithPartner;
import snakewithpartner.interfaces.DisplayInfo;

/**
 *
 * @author jmarchello
 */
public class GameOverMenuView extends Menu{

    //List of options the player can select from
    private final static String[][] menuItems = {
        {"1", "Play Again"},
        {"2", "Go to Main Menu"},
        {"3", "View High Scores"},
        {"0", "Exit"}
    };

    // Create instance of the GameOverMenuControl (action) class
    private GameOverMenuControl gameOverMenuControl = new GameOverMenuControl();

    public GameOverMenuView(){
        super(GameOverMenuView.menuItems);
    }
    
    
    @Override
    public void getInput() {
        int selection = -1;
        boolean isValid = false;

        do {
            this.displayMenu();
            Scanner input = SnakeWithPartner.getInFile();
            do {
                try {
                    selection = input.nextInt();
                    isValid = true;
                } catch (NumberFormatException numx) {
                    System.out.println("Invalid Input. Please input a valid number.");
                    isValid = false;
                }
            } while (!isValid);
            switch (selection) {
                case 1:
                    this.gameOverMenuControl.repeatGame();
                    break;
                case 2:
                    this.gameOverMenuControl.goToMain();
                    break;
                case 3:
                    this.gameOverMenuControl.goToHighScores();
                case 0:
                    break;
                default:
                    System.out.println("Please enter a valid menu item:");
                    continue;
            }
        } while (selection != 0);
    }

    private class GameOverMenuControl implements DisplayInfo{

        public void goToMain() {
            this.displayBorder();
            System.out.println(
                    "\tTakes the user to the main menu"
            );
            this.displayBorder();
        }

        public void goToHighScores() {
            this.displayBorder();
            System.out.println(
                    "\tTakes player to the High Score Menu"
            );
            this.displayBorder();
        }

        public void repeatGame() {
            this.displayBorder();
            System.out.println(
                    "\tStarts the game again with the same settings"
            );
            this.displayBorder();
        }

        @Override
        public void displayBorder() {
            System.out.println(
                    "\t-----------------------------------------------------------------------------");
        }
    }
}
