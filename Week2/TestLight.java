package com.company;

public class TestLight {

    public static void main(String[] args){
        Light myLight = new Light();
        for(int i=0;i<20;i++){
            System.out.println(myLight.getCurrentLight());
            myLight.changeLights();
            wait1Seconds();//Optional
        }
    }
    public static void wait1Seconds(){//Optional
        long oldTime = System.currentTimeMillis();
        long currentTime = System.currentTimeMillis();
        while((currentTime-oldTime)<1000){
            currentTime = System.currentTimeMillis();
        }
    }


}
