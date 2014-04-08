/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakewithpartner;

import java.awt.Image;
import java.io.Serializable;

/**
 *
 * @author trevornestman
 */
public class TailSection implements Serializable {

    private Image ball;
    private int xCordinate, yCordinate;

    public TailSection() {
    }

    public int getxCordinate() {
        return xCordinate;
    }

    public void setxCordinate(int xCordinate) {
        this.xCordinate = xCordinate;
    }

    public int getyCordinate() {
        return yCordinate;
    }

    public void setyCordinate(int yCordinate) {
        this.yCordinate = yCordinate;
    }

    //Changes the x and y cordinates to the new location (movement of the tail)
    public void moveSection(int xCordinate, int yCordinate) {
        this.xCordinate = xCordinate;
        this.yCordinate = yCordinate;
    }
}
