package com.company;

import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ozay
 */
public class Building {

    /*
    Object class is 75 points: 
    variables + constructor = 50
    getter methods + 2 custom methods = 25
    
    Test class is 25 points.

    Please grade the quizes as 25,50,75,100.
    
     */
    private final Date constructionDate;
    private int totalPeopleLiving;
    private int numberOfFloors;
    private static int countBuilding;

    public Building(int totalPeople, int numberOfFloors) {
        this.totalPeopleLiving = totalPeople;
        this.numberOfFloors = numberOfFloors;
        constructionDate = new Date();
        countBuilding++;
    }

    public Date getConstructionDate() {
        return constructionDate;
    }

    public int getTotalPeopleliving() {
        return totalPeopleLiving;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public static int getCountBuilding() {
        return countBuilding;
    }

    public boolean isFull() {
        int avgNumOfPeople = getTotalPeopleliving() / getNumberOfFloors();
        return avgNumOfPeople > 50;
        /*
        if (avgNumOfPeople > 50){
            return true;
        }else{
            return false;
        }
         */
    }

    public String getInfo() {
        return "Construction Date: " + getConstructionDate() + " Total People Living: " + getTotalPeopleliving()
                + " Number of Floor: " + getNumberOfFloors() + " Count building: " + getCountBuilding();
    }

    @Override
    public String toString() {
        return "Building{" +
                "constructionDate=" + constructionDate +
                ", totalPeopleLiving=" + totalPeopleLiving +
                ", numberOfFloors=" + numberOfFloors +
                '}';
    }
}
