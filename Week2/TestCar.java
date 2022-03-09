package com.company;

public class TestCar {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", "Cabrio","Black", 2020, 10000); //with color
        Car car2 = new Car("Audi", "a4", "White", 2021, 50000); //default color

        car1.drive(10, 2);
        car2.park();
        //We couldn't drive and park since we did not start them.
        car1.start();
        car2.start();
        System.out.println("----------");
        //Now, we can drive or park.
        car1.drive(100, 2);
        car1.calculateAvgSpeed();
        car1.park();
        car1.calculateAvgSpeed();
        System.out.println("----------");
        car2.drive(180, 2);
        car2.calculateAvgSpeed(); //avg speed can be calculated while driving.
        car2.park();
        car2.calculateAvgSpeed(); // avg speed is NaN when you park the car.
    }
}
