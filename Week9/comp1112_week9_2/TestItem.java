/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comp1112_week9_2;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author talha
 */
public class TestItem {

    public static ArrayList<Item> allitems;

    public static void main(String[] args) {
        Location2D.setDimX(50);
        Location2D.setDimY(50);
        allitems = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            if (rnd.nextBoolean()) {
                allitems.add(new Frog("Green"));
            } else {
                allitems.add(new Mosquito(45));
            }
            for (int c = 0; c < 1000; c++) {
                for (int j = 0; j < allitems.size(); j++) {
                    allitems.get(i).move();
                }
                for (int j = 0; j < allitems.size(); j++) {
                    for (int k = 0; k < allitems.size(); k++) {
                        if (allitems.get(i) instanceof Frog) {
                            //Frog f = (Frog) allitems.get(i);
                            ((Frog) allitems.get(i)).eat(allitems.get(k));
                        }
                    }
                }
            }
        }
    }
}
