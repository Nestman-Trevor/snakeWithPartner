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
 * @author trevornestman
 */
public class HelpMenuView extends Menu{

    //List of options the player can select from
    
    private final static String[][] menuItems = {
        {"1", "Rules"},
        {"2", "Controls"},
        {"0", "exit"}
    };

    // Create instance of the HelpMenuControl (action) class
    private HelpMenuControl helpMenuControl = new HelpMenuControl();
    
    public HelpMenuView(){
        super(HelpMenuView.menuItems);
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
                    this.helpMenuControl.displayRules();
                    break;
                case 2:
                    this.helpMenuControl.displayControls();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Please enter a valid menu item:");
                    continue;
            }
        } while (selection != 0);
    }

    private class HelpMenuControl implements DisplayInfo{

        public void displayRules() {
            this.displayBorder();
            System.out.println(
                    "\tRULES"
                    + "\n\tThe goal of snake is to eat as much food as possible! To get the"
                    + "\n\thighest score without hitting the wall or eating yourelf. And"
                    + "\n\tthat's it, that's the whole thing."
            );
            this.displayBorder();
        }

        public void displayControls() {
            this.displayBorder();
            System.out.println(
                    "\tCONTROLS"
                    + "\n\tUse arrow keys to change direction"
                    + "\n\tPress \"P\" to pause"
                    + "\n\tPress \"Q\" to quit"
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
