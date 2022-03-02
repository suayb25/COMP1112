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
public class TestTV {

    public static void main(String[] args) {
        TV tv1 = new TV();
        TV tv2 = new TV();
        tv1.setChannel(9);
        tv1.setVolume(3);
        System.out.println(tv1);
        tv2.turnOn();
        tv2.volumeUp();
        tv2.channelUp();
        System.out.println(tv2);
        tv2.turnOff();
        System.out.println(tv2);
    }

}
