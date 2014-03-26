/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakewithpartner;

import snakewithpartner.menus.HelpMenuView;
import snakewithpartner.menus.MainMenuView;
import snakewithpartner.menus.PlayMenuView;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author trevornestman
 */
public class SnakeWithPartner {
    
    String instructions = "Welcome to Snake!\nVersion: 1.0\n"
            + "The goal is to eat the food and not yourself.\n"
            + "Also, avoid trying to leave the area.";
    
    private static Scanner inFile = new Scanner(System.in);
    private static Random generator = new Random();
    private static MainMenuView mainMenu = new MainMenuView();
    private static PlayMenuView playMenu = new PlayMenuView();
    private static HelpMenuView helpMenu = new HelpMenuView();

    

    public SnakeWithPartner() {
    }

    public static Scanner getInFile() {
        return SnakeWithPartner.inFile;
    }
    
    public static Random getGenerator() {
        return generator;
    }

    public static MainMenuView getMainMenu() {
        return SnakeWithPartner.mainMenu;
    }

    public static PlayMenuView getPlayMenu() {
        return SnakeWithPartner.playMenu;
    }

    public static HelpMenuView getHelpMenu() {
        return helpMenu;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.getInput();
        }
        catch(Throwable ex){
        System.out.println("ERROR: Unexpected error" + ex.getMessage());
        }

    }
}
