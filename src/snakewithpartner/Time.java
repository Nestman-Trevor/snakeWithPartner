/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package snakewithpartner;

import java.io.Serializable;

/**
 *
 * @author jmarchello
 */
public class Time implements Serializable{
    //Current timestamp in seconds
    private long timeStampSecs = System.currentTimeMillis() / 1000;
    

    public Time() {
    }

    public long getTimeStampSecs() {
        return timeStampSecs;
    }

    public void setTimeStampSecs(long timeStampSecs) {
        this.timeStampSecs = timeStampSecs;
    }
    
    //display timestamp in seconds
    public void showTimeInSeconds(){
        System.out.println("Time in Seconds: " + timeStampSecs);
    }
    
}
