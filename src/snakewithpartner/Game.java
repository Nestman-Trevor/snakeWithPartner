/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakewithpartner;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.Timer;
import static snakewithpartner.enums.Difficulty.*;
import snakewithpartner.enums.Direction;
import snakewithpartner.players.Player;

/**
 *
 * @author Josh
 */
public class Game {

    private int speed = 0;

    Snake snake = new Snake();
    Timer timer;
    boolean inGame = false;

    public void initGame(Player player) {
        switch (player.getDifficulty()) {
            case EASY:
                speed = 1000;
                break;
            case MEDIUM:
                speed = 500;
                break;
            case HARD:
                speed = 200;
                break;
            default:
                break;
        }
    }

    public void startSnake() {
        ActionListener taskPerformer = new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                snake.move();
                checkBoundaryCollision();
            }
        };
        timer = new Timer(speed, taskPerformer);
        timer.start();
        inGame = true;
    }

    public void handleKeyStroke(KeyEvent evt) {
        switch (evt.getKeyCode()) {
            case KeyEvent.VK_SPACE:
                if (!inGame) {
                    this.startSnake();
                }
                break;
            case KeyEvent.VK_UP:
                snake.setCurrentDirection(Direction.UPARROW);
                break;
            case KeyEvent.VK_DOWN:
                snake.setCurrentDirection(Direction.DOWNARROW);
                break;
            case KeyEvent.VK_LEFT:
                snake.setCurrentDirection(Direction.LEFTARROW);
                break;
            case KeyEvent.VK_RIGHT:
                snake.setCurrentDirection(Direction.RIGHTARROW);
                break;
        }
    }

    public void checkBoundaryCollision() {
        if ((snake.getxPosition() < 1) || (snake.getxPosition() > 48)) {
            endGame();

        }
        if ((snake.getyPosition() < 1) || (snake.getyPosition() > 48)) {
            endGame();
        }
    }

    public void endGame() {
        System.out.println("Game Over");
        this.timer.stop();
        inGame = false;
    }
}
