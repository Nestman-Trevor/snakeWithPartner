/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package snakewithpartner;

import java.util.Scanner;

/**
 *
 * @author jmarchello
 */
public class GameOverMenuView {
    //List of options the player can select from
    private final static String[][] menuItems = {
        {"1", "Play Again"},
        {"2", "Go to Main Menu"},
        {"3", "View High Scores"},
        {"0", "Exit"}
    };

    // Create instance of the GameOverMenuControl (action) class
    private GameOverMenuControl gameOverMenuControl = new GameOverMenuControl();

    public void displayMenu() {
        System.out.println("\n\t+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("\tEnter the number that coorisponds with your desired menu item:");

        for (int i = 0; i < menuItems.length; i++) {
            System.out.println("\t\t" + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\t++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
    }

    public void getPlayerSelection() {
        String selection;

        do {
            this.displayMenu();
            Scanner input = new Scanner(System.in);
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
}
