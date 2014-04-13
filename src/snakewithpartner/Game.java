/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakewithpartner;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Timer;
import static snakewithpartner.enums.Difficulty.*;
import snakewithpartner.enums.Direction;
import snakewithpartner.frames.BoardFrame;
import snakewithpartner.frames.GameOverFrame;
import snakewithpartner.players.HighScore;
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
    Player player;
    Food food;
    Board board;
    BoardFrame boardFrame;
    HighScore highScore;
    boolean isPaused = false;

    public Game(Player player) {
        this.player = player;
        this.highScore = SnakeWithPartner.getHighScore();
    }

    public void initGame() {
        switch (player.getDifficulty()) {
            case EASY:
                speed = 300;
                break;
            case MEDIUM:
                speed = 200;
                break;
            case HARD:
                speed = 50;
                break;
            default:
                break;
        }
        board = new Board();
        food = new Food(board);
        SnakeWithPartner.boardFrame = new BoardFrame(this, snake);
        SnakeWithPartner.boardFrame.setVisible(true);
        SnakeWithPartner.boardFrame.paintBoard(snake, food, player);
    }

    public void startSnake() {
        ActionListener taskPerformer = new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                snake.move();
                SnakeWithPartner.boardFrame.paintBoard(snake, food, player);
                checkBoundaryCollision();
                checkTailCollision();
                checkForFood();
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
            case KeyEvent.VK_P:
                isPaused = !isPaused;
                if(isPaused){timer.stop();}
                else{timer.start();}
                break;
            case KeyEvent.VK_Q:
                this.endGame();
                break;
        }
    }

    public void checkForFood() {
        if ((snake.getxPosition() == food.getxFood()) && (snake.getyPosition() == food.getyFood())) {
            System.out.println("You got some food!");
            player.addToScore();
            snake.growTail();
            food = new Food(board);
            System.out.println("Your score is: " + player.getScore());
        }
    }

    public void checkBoundaryCollision() {
        if ((snake.getxPosition() < 0) || (snake.getxPosition() > 49)) {
            endGame();

        }
        if ((snake.getyPosition() < 0) || (snake.getyPosition() > 49)) {
            endGame();
        }
    }

    public void checkTailCollision() {
        TailSection[] tail = snake.getTail();
        for (int i = 1; i < tail.length; i++) {
            if ((snake.getxPosition() == tail[i].getxCordinate()) && (snake.getyPosition() == tail[i].getyCordinate())) {
                endGame();
            }
        }
    }

    public void endGame() {
        boolean isHighScore = false;
        
        System.out.println("Game Over");
        this.timer.stop();
        SnakeWithPartner.boardFrame.dispose();
        SnakeWithPartner.GameOverFrame = new GameOverFrame(player);
        SnakeWithPartner.GameOverFrame.setVisible(true);
        isHighScore = highScore.addToHighScores(player);
        if (isHighScore){
          SnakeWithPartner.GameOverFrame.newHighScore();
        }
        inGame = false;
        try {
            this.finalize();
            snake.kill();
            food.throwAway();
            board.burn();
        } catch (Throwable ex) {
            Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
