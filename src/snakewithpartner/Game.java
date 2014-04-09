/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package snakewithpartner;

import java.awt.event.ActionListener;
import javax.swing.Timer;
import static snakewithpartner.enums.Difficulty.*;
import snakewithpartner.players.Player;

/**
 *
 * @author Josh
 */
public class Game {
    public void initGame(Player player){
        Snake snake = new Snake();
        switch (player.getDifficulty()){
            case EASY:
                Timer timer = new Timer(1000, snake);
                break;
            case MEDIUM:
                break;
            case HARD:
                break;
            default:
                break;
        }
    }
    
    
}
