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
 * @author Josh
 */
public class PlayMenuView extends Menu{

    //List of options the player can select from
    private final static String[][] menuItems = {
        {"1", "Easy"},
        {"2", "Medium"},
        {"3", "Hard"},
        {"0", "Back"}
    };

    // Create instance of the HelpMenuControl (action) class
    private PlayMenuControl playMenuControl = new PlayMenuControl();

    public PlayMenuView(){
        super(PlayMenuView.menuItems);
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
                    this.playMenuControl.playEasy();
                    break;
                case 2:
                    this.playMenuControl.playMedium();
                    break;
                case 3:
                    this.playMenuControl.playHard();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Please enter a valid menu item:");
                    continue;
            }
        } while (selection != 0);
    }

    private class PlayMenuControl implements DisplayInfo{

        public void playEasy() {
            this.displayBorder();
            System.out.println("\t\tThis will launch the Easy game board and begin gameplay");
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

        @Override
        public void displayBorder() {
            System.out.println(
                    "\t-----------------------------------------------------------------------------");
        }
    }
}
