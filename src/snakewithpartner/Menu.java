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
public abstract class Menu {
    
    private String[][] menuItems = null;
    
    public Menu(String[][] menuItems){
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
    
    public abstract void getPlayerSelection();
}
