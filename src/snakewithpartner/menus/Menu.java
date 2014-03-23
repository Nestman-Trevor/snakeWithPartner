/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakewithpartner.menus;

import snakewithpartner.interfaces.*;

/**
 *
 * @author trevornestman
 */
public class Menu implements EnterInfo {

    private String[][] menuItems = null;

    public Menu(String[][] menuItems) {
        this.menuItems = menuItems;
    }

    public void displayMenu() {
        System.out.println("\n\t+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("\tEnter the number that coorisponds with your desired menu item:");

        for (String[] menuItem : menuItems) {
            System.out.println("\t\t" + menuItem[0] + "\t" + menuItem[1]);
        }
        System.out.println("\t++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
    }

    @Override
    public void getInput() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
