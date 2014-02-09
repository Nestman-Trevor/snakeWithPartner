/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package snakewithpartner;

import java.util.Scanner;

/**
 *
 * @author trevornestman
 */
public class MainMenuView {
    //List of options the player can select from
    private final static String[][] menuItems = {
        {"1", "Launch Play Menu"},
        {"2", "High Score Menu"},
        {"3", "Settings Menu"},
        {"4", "Display Help Menu"},
        {"0", "exit"}
    };

    // Create instance of the HelpMenuControl (action) class
    private MainMenuControl mainMenuControl = new MainMenuControl();

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
}
