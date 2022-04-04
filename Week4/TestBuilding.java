package com.company;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ozay
 */
public class TestBuilding {

    public static void main(String[] args) {
        Building building1 = new Building(630, 13);
        if (building1.isFull()) {
            System.out.println("Crowded!");
        } else {
            System.out.println("Not crowded!");
        }
        System.out.println(building1.getConstructionDate());
        System.out.println(building1.getInfo());
        int count = 5;
        count += count;
        System.out.println(count);
    }
}
