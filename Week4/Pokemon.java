package com.company;

import java.util.Date;
import java.util.Random;

public class Pokemon {

    private Location2D loc;
    private final Date birthDate;
    private double height;
    private double weight;
    private double energyLevel = 0.0;
    private int petId;
    private static int count;
    private Date lastFed;

    public Pokemon(double height, double weight) {
        this.height = height;
        this.weight = weight;
        this.birthDate = new Date();
        this.petId = this.petId + this.count;
        this.count++;
        loc = new Location2D();
    }

    public void feed() {
        if (lastFed == null) {
            lastFed = new Date();
            energyLevel += 1;
        } else { //check if fed within a day
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

    public void move() {
        //0--> x--
        //1--> x++
        //2--> y--
        //3--> y++
        Random rnd = new Random();
        int dir = rnd.nextInt(4);
        int curX = loc.getX();
        int curY = loc.getY();
        if (energyLevel >= 3) {
            switch (dir) {//Also, you can write if-else.
                case 0:
                    loc.changeLocation(curX--, curY);
                    break;
                case 1:
                    loc.changeLocation(curX++, curY);
                    break;
                case 2:
                    loc.changeLocation(curX, curY--);
                    break;
                case 3:
                    loc.changeLocation(curX, curY++);
                    break;
            }
            energyLevel -= 3;
        }
    }

    public Location2D getLoc() {
        return loc;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public double getEnergyLevel() {
        return energyLevel;
    }

    public int getPetId() {
        return petId;
    }

    public Date getLastFed() {
        return lastFed;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "loc=" + loc +
                ", birthDate=" + birthDate +
                ", height=" + height +
                ", weight=" + weight +
                ", energyLevel=" + energyLevel +
                ", petId=" + petId +
                ", lastFed=" + lastFed +
                '}';
    }
}