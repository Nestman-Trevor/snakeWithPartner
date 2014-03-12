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

    private class HelpMenuControl {

        public void displayRules() {
            this.displayHelpBorder();
            System.out.println(
                    "\tRULES"
                    + "\n\tThe goal of snake is to eat as much food as possible! To get the"
                    + "\n\thighest score without hitting the wall or eating yourelf. And"
                    + "\n\tthat's it, that's the whole thing."
            );
            this.displayHelpBorder();
        }

        public void displayControls() {
            this.displayHelpBorder();
            System.out.println(
                    "\tCONTROLS"
                    + "\n\tUse arrow keys to change direction"
                    + "\n\tPress \"P\" to pause"
                    + "\n\tPress \"Q\" to quit"
            );
            this.displayHelpBorder();
        }

        public void displayHelpBorder() {
            System.out.println(
                    "\t-----------------------------------------------------------------------------");
        }
    }
}
