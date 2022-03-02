/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comp1112_week1;

/**
 *
 * @author lab
 */
public class TV {

    private int channel = 1;
    private int volume = 0;
    private boolean on = false;

    public TV() {
    }

    public void channelUp() {
        if (this.channel <= 119) {
            this.channel++;
        } else {
            System.out.println("You can not increase the channel. Channel has the maximum value (120)");
        }
    }

    public void channelDown() {
        if (this.channel >= 1) {
            this.channel--;
        } else {
            System.out.println("You can not decrease the channel. Channel has the minimum value (0)");
        }

    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public void volumeUp() {
        if (this.volume <= 6) {
            this.volume++;
        } else {
            System.out.println("You can not increase the volume. Volume has the maximum value (7)");
        }
    }

    public void volumeDown() {
        if (this.volume >= 1) {
            this.volume--;
        } else {
            System.out.println("You can not decrease the volume. Volume has the minimum value (0)");
        }
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void turnOn() {
        this.on = true;
    }
    
    public void turnOff(){
        this.on = false;
    }

}
