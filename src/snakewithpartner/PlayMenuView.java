/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakewithpartner;

import java.util.Scanner;

/**
 *
 * @author Josh
 */
public class PlayMenuView {

    //List of options the player can select from
    private final static String[][] menuItems = {
        {"1", "Easy"},
        {"2", "Medium"},
        {"3", "Hard"},
        {"0", "Back"}
    };

    // Create instance of the HelpMenuControl (action) class
    private PlayMenuControl playMenuControl = new PlayMenuControl();

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
        Scanner input = SnakeWithPartner.getInFile();
        do {
            this.displayMenu();
            selection = input.nextLine();
            switch (selection) {
                case "1":
                    this.playMenuControl.playEasy();
                    break;
                case "2":
                    this.playMenuControl.playMedium();
                    break;
                case "3":
                    this.playMenuControl.playHard();
                    break;
                case "0":
                    break;
                default:
                    System.out.println("Please enter a valid menu item:");
                    continue;
            }
        } while (!selection.equals("0"));
    }

    private class PlayMenuControl {

        public void playEasy() {
            this.displayBorder();
            System.out.println("\t\t1This will launch the Easy game board and begin gameplay");
            this.displayBorder();
        }

        public void playMedium() {
            this.displayBorder();
            System.out.println("\t\tThis will launch the Medium game board and begin gameplay");
            this.displayBorder();
        }

        public void playHard() {
            this.displayBorder();
            System.out.println("\t\tThis will launch the Hard game board and begin gameplay");
            this.displayBorder();
        }

        private void displayBorder() {
            System.out.println(
                    "\t-----------------------------------------------------------------------------");
        }
    }
}
