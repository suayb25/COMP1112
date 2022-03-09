package com.company;

public class Light {

    private static final int GREEN=0;
    private static final int YELLOW=1;
    private static final int RED=2;
    private int currentLight;

    public Light(){
        currentLight = GREEN;
    }

    public void changeLights(){
        currentLight = (currentLight+1)%3;
    }

    public String getCurrentLight(){
        if(currentLight==GREEN){
            return "Green";
        }else if(currentLight==YELLOW){
            return "Yellow";
        }else {
            return "Red";
        }
    }

}
