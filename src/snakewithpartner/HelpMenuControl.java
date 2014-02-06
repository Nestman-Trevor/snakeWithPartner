/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakewithpartner;

/**
 *
 * @author trevornestman
 */
public class HelpMenuControl {

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
