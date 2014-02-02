/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakewithpartner;

import java.util.Scanner;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author trevornestman
 */
public class SnakeWithPartner {
    double finalScore;
    String name;
    String instructions = "Welcome to Snake!\nVersion: 1.0\n"
            + "The goal is to eat the food and not yourself.\n"
            + "Also, avoid trying to leave the area.";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Board snakeBoard = new Board();
        snakeBoard.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        snakeBoard.setSize(snakeBoard.height,snakeBoard.width);
        snakeBoard.setVisible(true);
        
        drawingComponent DC = new drawingComponent();
        snakeBoard.add(DC);
        
//        HighScore myScore = new HighScore();
//        myScore.testHighScore();
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
