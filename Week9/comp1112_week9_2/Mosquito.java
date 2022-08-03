/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comp1112_week9_2;

/**
 *
 * @author talha
 */
public class Mosquito extends Item{
    private double weight;
    private boolean isDead;
    
    public Mosquito(double weight){
        this.weight = weight;
    }
    
    @Override
    public void move() {
        int r1 = (int)(Math.random()*2);
        int r2 = (int)(Math.random()*2);
        pos.setX(pos.getX()+r1);
        pos.setY(pos.getY()+r2);
    }
    
    public double produceEnergy(){
        System.out.println("Mosquito " + getId() + " has been eaten.");
        return weight;
    }

    public boolean isIsDead() {
        return isDead;
    }

    public void setIsDead(boolean isDead) {
        if(isDead){
            this.weight = 0;
        }
        this.isDead = isDead;
    }
   
}
