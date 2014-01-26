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
public class Time {
    //Current timestamp in seconds
    long timeStampSecs = System.currentTimeMillis() / 1000;
    
    //display timestamp in seconds
    public void showTimeInSeconds(){
        System.out.println("Time in Seconds: " + timeStampSecs);
    }
    
}
