/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comp1112_week9_3;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author talha
 */
public class TestFarm {
    
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Item>  alltems = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int ch = rnd.nextInt(7);
            switch(ch){
                case 0:
                    alltems.add(new Cat());
                    break;
                case 1:
                    alltems.add(new Chicken());
                    break;
                case 2:
                    alltems.add(new Dog());
                    break;
                case 3:
                    alltems.add(new Lettuce());
                    break;
                case 4:
                    alltems.add(new Tiger());
                    break;
                case 5:
                    alltems.add(new Tomato());
                    break;
                case 6:
                    alltems.add(new Tulip());
                    break;
                default:
                    break;     
            }
            for (int j = 0; j < alltems.size(); j++) {
                if(alltems.get(i) instanceof Lettuce){
                    ((Lettuce) alltems.get(i)).howToEat();
                }else if(alltems.get(i) instanceof Tomato){
                    ((Tomato) alltems.get(i)).howToEat();
                }else if(alltems.get(i) instanceof Chicken){
                    ((Chicken) alltems.get(i)).howToEat();
                }else{
                    System.out.println("Sorry you can not eat me!");
                }
            }
        }
    }
}
