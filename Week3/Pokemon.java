package com.company;

import java.util.Date;
import java.util.Random;

public class Pokemon {

    private int x;
    private final Date birthDate;
    private double height;
    private double weight;
    private double energyLevel = 0.0;
    private int petId;
    private static int count;
    private Date lastFed;

    public Pokemon(double height, double weight, int length) {
        this.height = height;
        this.weight = weight;
        this.birthDate = new Date();
        this.petId = this.petId + this.count;
        this.count++;
        //We need to take area or let say length to put our Pokemon on a random position.
        Random rnd = new Random();
        x = rnd.nextInt(length);
    }

    public void feed(){
        if (lastFed == null) {
            lastFed = new Date();
            energyLevel += 1;
        }else { //check if fed within a day
            int diffInDays = (int) ((new Date().getTime() - lastFed.getTime()) / (1000 * 60 * 60 * 24));
            if (diffInDays >= 1) {//1 means 1 day. We need to feed them daily otherwise they will lose weight 0.02.
                weight -= 0.02;
                energyLevel = 0;
            }
            energyLevel += 1;
        }

        if (energyLevel >= 10) {//Finally, we need to check energyLevel.
            weight += 0.04;
            height += 0.01;
        }
    }

    public void move(){
        //true--> increase x
        //false--> decrease x
        boolean direction = new Random().nextBoolean(); //random direction
        if (energyLevel > 3) {
            if (direction==true) {
                x++;
            } else {
                x--;
            }
            energyLevel -= 3;
        }
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "x=" + x +
                ", BirthDate=" + birthDate +
                ", height=" + height +
                ", weight=" + weight +
                ", energyLevel=" + energyLevel +
                ", petId=" + petId +
                ", lastFed=" + lastFed +
                '}';
    }
}