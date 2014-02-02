/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package snakewithpartner;

/**
 *
 * @author jmarchello
 */
import java.awt.*;
import javax.swing.*;

public class Board extends JFrame{
    //Height and Width of board in pixels
    int height = 400;
    int width = 400;
    
    
    public Board(){
        super("Snake!");
        setLayout(new FlowLayout());

    }
    
    //Display board's height and width
    public void displayBoardSize(){
        System.out.println("The board is " + height + " pixels by " + width + "pixels");
    }
}

