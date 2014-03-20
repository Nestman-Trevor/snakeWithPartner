/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakewithpartner.menus;

import java.util.Scanner;
import snakewithpartner.SnakeWithPartner;

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
        String selection;
        Scanner input = SnakeWithPartner.getInFile();

        do {
            this.displayMenu();
            selection = input.nextLine();
            switch (selection) {
                case "1":
                    this.gameOverMenuControl.repeatGame();
                    break;
                case "2":
                    this.gameOverMenuControl.goToMain();
                    break;
                case "3":
                    this.gameOverMenuControl.goToHighScores();
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

    private class GameOverMenuControl {

        public void goToMain() {
            this.displayGameOverMenuBorder();
            System.out.println(
                    "\tTakes the user to the main menu"
            );
            this.displayGameOverMenuBorder();
        }

        public void goToHighScores() {
            this.displayGameOverMenuBorder();
            System.out.println(
                    "\tTakes player to the High Score Menu"
            );
            this.displayGameOverMenuBorder();
        }

        public void repeatGame() {
            this.displayGameOverMenuBorder();
            System.out.println(
                    "\tStarts the game again with the same settings"
            );
            this.displayGameOverMenuBorder();
        }

        public void displayGameOverMenuBorder() {
            System.out.println(
                    "\t-----------------------------------------------------------------------------");
        }
    }
}
