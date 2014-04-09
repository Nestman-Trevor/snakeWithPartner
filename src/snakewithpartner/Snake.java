/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakewithpartner;

import java.awt.Image;
import java.io.Serializable;
import java.util.Arrays;
import snakewithpartner.enums.Direction;
import static snakewithpartner.enums.Direction.DOWNARROW;
import static snakewithpartner.enums.Direction.LEFTARROW;
import static snakewithpartner.enums.Direction.RIGHTARROW;
import static snakewithpartner.enums.Direction.UPARROW;

/**
 *
 * @author jmarchello
 */
public class Snake implements Serializable {

    //current length of snake
    private int startingLength = 3; //snake is 3 sections long at start of game
    private Direction currentDirection = UPARROW;
    private int xPosition = 25;
    private int yPosition = 10;
    private TailSection tail[] = new TailSection[startingLength];
    

    private Image head;

    public Snake() {
        for (int i = 0; i < this.tail.length; i++){
            this.tail[i] = new TailSection(this.xPosition, this.yPosition + i);
        }
    }

    public int getStartingLength() {
        return startingLength;
    }

    public void setStartingLength(int startingLength) {
        this.startingLength = startingLength;
    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public void setCurrentDirection(Direction currentDirection) {
        switch (currentDirection) {
            case UPARROW:
                if (this.currentDirection != DOWNARROW) {
                    this.currentDirection = currentDirection;
                }
                break;
            case DOWNARROW:
                if (this.currentDirection != UPARROW) {
                    this.currentDirection = currentDirection;
                }
                break;
            case LEFTARROW:
                if (this.currentDirection != RIGHTARROW) {
                    this.currentDirection = currentDirection;
                }
                break;
            case RIGHTARROW:
                if (this.currentDirection != LEFTARROW) {
                    this.currentDirection = currentDirection;
                }
                break;
        }
        this.currentDirection = currentDirection;
    }

    public int getxPosition() {
        return xPosition;
    }

    public void setxPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public int getyPosition() {
        return yPosition;
    }

    public void setyPosition(int yPosition) {
        this.yPosition = yPosition;
    }

    public TailSection[] getTail() {
        return tail;
    }

    public void move() {
        switch (currentDirection) {
            case UPARROW:
                yPosition--;
                break;
            case DOWNARROW:
                yPosition++;
                break;
            case LEFTARROW:
                xPosition--;
                break;
            case RIGHTARROW:
                xPosition++;
                break;
            default:
                //handle exception
                break;
        }
        moveTail();
        System.out.println("x=" + xPosition + " y=" + yPosition + "; tail=" + tail.length);
    }
    
    public void moveTail(){
        for (int i = tail.length - 1; i > 0; i--){
            tail[i] = tail[i-1];
        }
        tail[0] = new TailSection(xPosition, yPosition);
    }
    
    public void growTail(){
        tail = Arrays.copyOf(tail, tail.length + 1);
    }
}
