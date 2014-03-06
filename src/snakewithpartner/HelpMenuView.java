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
public class HelpMenuView {

    //List of options the player can select from
    private final static String[][] menuItems = {
        {"1", "Rules"},
        {"2", "Controls"},
        {"0", "exit"}
    };

    // Create instance of the HelpMenuControl (action) class
    private HelpMenuControl helpMenuControl = new HelpMenuControl();

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
            Scanner input = SnakeWithPartner.getInFile();
            selection = input.nextLine();
            switch (selection) {
                case "1":
                    this.helpMenuControl.displayRules();
                    break;
                case "2":
                    this.helpMenuControl.displayControls();
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