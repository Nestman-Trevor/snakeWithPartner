/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakewithpartner;

import java.util.Scanner;

/**
 *
 * @author josh
 */
public class snakeControlView {

    char input;
    String message;

    String getPlayerInput() {
        Scanner scan = new Scanner(System.in);
        while (input != 'q') {
            try {
                input = scan.next().charAt(0);
            } catch (IndexOutOfBoundsException e) {
                continue;
            }
            switch (input) {
                case 'w':
                    message = "Up";
                    break;
                case 's':
                    message = "Down";
                    break;
                case 'a':
                    message = "Left";
                    break;
                case 'd':
                    message = "Right";
                    break;
                case 'p':
                    message = "Game Paused";
                    break;
                case 'q':
                    message = "Quiting";
                    break;
                default:
                    System.out.println("Invalid Input");
                    continue;
            }
            return message;
        }

        return null;
    }

    void displayInput() {
        System.out.println("Use the \"w\", \"s\", \"a\", and \"d\" keys as arrow keys to control the snake. You can pause by\n"
                + " pressing \"p\" and quit by pressing \"q\"");
        String output = getPlayerInput();
        System.out.println(output);
    }
}
