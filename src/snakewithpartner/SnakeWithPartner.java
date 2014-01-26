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

    String name;
    String instructions = "Welcome to Snake!\nVersion: 1.0\n"
            + "The goal is to eat the food and not yourself.\n"
            + "Also, avoid trying to leave the area.";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SnakeWithPartner myGame = new SnakeWithPartner();
        myGame.getName();
        myGame.displayHelp();
        
        Board gameBoard = new Board();
        gameBoard.displayBoardSize();
        
        Food snakeFood = new Food();
        snakeFood.displayScoreValue();
        
        GameOverMenu gameOver = new GameOverMenu();
        gameOver.displayMenu();
        
        Help gameHelp = new Help();
        gameHelp.displayHelp();
        
        HighScore gameHighScore = new HighScore();
        gameHighScore.displayHighScoreInfo();
        
        MainMenu gameMainMenu = new MainMenu();
        gameMainMenu.displayTitles();
        
        PlayMenu gamePlayMenu = new PlayMenu();
        gamePlayMenu.displayPlayMenuStrings();
        
        Player player1 = new Player();
        player1.displayName();
        
        Score currentScore = new Score();
        currentScore.displayScore();
        
        Settings settings = new Settings();
        settings.displaySettings();
        
        Snake snake = new Snake();
        snake.displaylength();
        
        Time time = new Time();
        time.showTimeInSeconds();
        
    }

    public void getName() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        this.name = input.next();
    }

    public void displayHelp() {
        System.out.println("\nWelcome " + this.name + "\n");
        System.out.println(this.instructions);
    }
}
