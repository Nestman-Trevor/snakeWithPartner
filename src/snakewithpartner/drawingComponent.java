/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakewithpartner;

/**
 *
 * @author Josh
 */
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Rectangle;
import java.awt.Color;

public class drawingComponent extends JComponent{
    public void snakeFoodPaint(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        
        Rectangle snakeFood = new Rectangle(5, 15, 100, 200);
        g2.setColor(Color.black);
        g2.draw(snakeFood);
    }
}
