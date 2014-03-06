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
public class SnakeWithPartner {

    String instructions = "Welcome to Snake!\nVersion: 1.0\n"
            + "The goal is to eat the food and not yourself.\n"
            + "Also, avoid trying to leave the area.";
    
    private static Scanner inFile = new Scanner(System.in);

    public SnakeWithPartner() {
    }

    public static Scanner getInFile() {
        return SnakeWithPartner.inFile;
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        MainMenuView mainMenu = new MainMenuView();
//        mainMenu.getPlayerSelection();
//        snakeControlView snakeControl = new snakeControlView();
//        snakeControl.displayInput();
          
//        Player player = new Player();
//        player.askName();
//        System.out.println("Enter your score: ");
//        int score = input.nextInt();
//        System.out.println("Enter the difficulty (1, 2, or 3): ");
//        int difficulty = input.nextInt();
//        HighScore highScore = new HighScore();
//        highScore.addToHighScores(name, score, difficulty);
          Board board = new Board();
          board.displayBoard();

    }
}
