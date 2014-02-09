/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package snakewithpartner;

/**
 *
 * @author Josh
 */
public class PlayMenuControl {
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

    public void displayBorder() {
        System.out.println(
                "\t-----------------------------------------------------------------------------");
    }    
}
