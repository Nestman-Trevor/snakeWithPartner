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
public class GameOverMenuControl {

    public void goToMain() {
        this.displayGameOverMenuBorder();
        System.out.println(
                "\tTakes the user to the main menu"
        );
        this.displayGameOverMenuBorder();
    }

    public void goToHighScores() {
        this.displayGameOverMenuBorder();
        System.out.println(
                "\tTakes player to the High Score Menu"
        );
        this.displayGameOverMenuBorder();
    }

    public void repeatGame() {
        this.displayGameOverMenuBorder();
        System.out.println(
                "\tStarts the game again with the same settings"
        );
        this.displayGameOverMenuBorder();
    }
    
    public void displayGameOverMenuBorder() {
        System.out.println(
                "\t-----------------------------------------------------------------------------");
    }
}
