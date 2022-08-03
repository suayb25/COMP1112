/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comp1112_week9_2;

import java.util.Random;

/**
 *
 * @author talha
 */
public class Frog extends Item{
    private String color;
    private int direction = 0;
    private double energy = 100.0;
    
    public Frog(String color){
        this.color = color;
    }

    @Override
    public void move() {
        Random rnd = new Random();
        boolean changeNow = rnd.nextBoolean();
        if(changeNow){
            rotate();
        }
        int curX = pos.getX();
        int curY = pos.getY();
        if(energy>=5){
            energy-=5;
            switch(direction){
                case 0:
                    pos.setX(curX++);
                    break;
                case 1:
                    pos.setY(curY++);
                    break;
                case 2:
                    pos.setX(curX--);
                    break;
                case 3:
                    pos.setY(curY--);
                    break;
                default:
                    break;
            }
        }
    }
    
    private void rotate(){
        if(energy>=1){
            energy--;
            direction++;
            direction = direction % 4;
        }
    }
    
    public void eat(Item i){
        if(this.chechIfSameLocation(i)){
            if(i instanceof Mosquito){
                energy += ((Mosquito) i).produceEnergy();
                System.out.println("by frog " + getId());
                ((Mosquito) i).setIsDead(true);
            }
        }
    }
    
}
