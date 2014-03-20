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

    @Override
    public void display() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private class PlayMenuControl {

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

        private void displayBorder() {
            System.out.println(
                    "\t-----------------------------------------------------------------------------");
        }
    }
}
