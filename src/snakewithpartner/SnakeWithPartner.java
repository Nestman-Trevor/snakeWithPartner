/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakewithpartner;

import java.awt.event.ActionEvent;
import snakewithpartner.menus.HelpMenuView;
import snakewithpartner.menus.MainMenuView;
import snakewithpartner.menus.PlayMenuView;
import java.util.Random;
import java.util.Scanner;
import snakewithpartner.frames.GameOverFrame;
import snakewithpartner.frames.BoardFrame;
import snakewithpartner.frames.EnterPlayerName;
import snakewithpartner.frames.HelpMenuFrame;
import snakewithpartner.frames.HighScoresFrame;
import snakewithpartner.frames.MainFrame;
import snakewithpartner.frames.PlayMenuFrame;
import snakewithpartner.players.HighScore;

/**
 *
 * @author trevornestman
 */
public class SnakeWithPartner {

    public static MainFrame mainFrame;
    public static EnterPlayerName enterPlayerName;
    public static PlayMenuFrame playMenuFrame;
    public static HighScoresFrame highScoresFrame;
    public static HelpMenuFrame helpMenuFrame;
    public static BoardFrame boardFrame;
    public static GameOverFrame GameOverFrame;

    String instructions = "Welcome to Snake!\nVersion: 1.0\n"
            + "The goal is to eat the food and not yourself.\n"
            + "Also, avoid trying to leave the area.";

    private static Scanner inFile = new Scanner(System.in);
    private static Random generator = new Random();
    private static MainMenuView mainMenu = new MainMenuView();
    private static PlayMenuView playMenu = new PlayMenuView();
    private static HelpMenuView helpMenu = new HelpMenuView();
    private static HighScore highScore = new HighScore();

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

    public static HighScore getHighScore() {
        return highScore;
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    SnakeWithPartner.mainFrame = new MainFrame();
                    new MainFrame().setVisible(true);
                }
            });
        } catch (Throwable ex) {
            System.out.println("ERROR: Unexpected error" + ex.getMessage());
        } finally {
            if (SnakeWithPartner.mainFrame != null) {
                SnakeWithPartner.mainFrame.dispose();
            }
        }

    }
}
