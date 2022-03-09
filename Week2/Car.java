package com.company;

public class Car {

    private String make;
    private String model;
    private String color;
    private int year;
    private double price;
    private boolean isStarted = false; //For first if
    //For second if
    //for average speed
    private int distance = 0;
    private double timeMin = 0;


    public Car(String make, String model, String color, int year, double price) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.price = price;
    }

    public void start() { //we may assume there is one button to start and stop the vehicle.
        if(this.isStarted){
            this.isStarted = false;
            System.out.println("You stopped the car!");
        }else{
            this.isStarted = true;
            System.out.println("You started the car!");
        }
    }

    public void drive(int distance, double timeMinute) {
        if (isStarted) {
            System.out.println("Driving...");
            this.distance = distance;
            this.timeMin = timeMinute;
        } else {
            System.out.println("You need to start the car before you drive!");
        }
    }

    public void calculateAvgSpeed(){ //We can drive car with 10, 20, 30. Question asked us to calculate average speed, so distance and time are enough.
        System.out.println(make + " " + model + "'s average speed: " + distance/(timeMin/60));
    }

    public void park() {
        if (isStarted) {
            System.out.println("You're parking the car...");
            this.distance = 0;
            this.timeMin = 0;
            System.out.println("You parked the car!");
            start();
        } else {
            System.out.println("You need to start the car before you park!");
        }
    }

    public void changeColor(String color) {
        this.color = color;
    }

    public void changePrice(double price) {
        this.price = price;
    }


}
