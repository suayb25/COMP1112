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
public abstract class Item {
    protected Location2D pos;
    private static int count;
    private int id;
    
    protected Item(){
        id = count++;
        pos = new Location2D();
    }
    
    public abstract void move();
    
    public boolean chechIfSameLocation(Item item){
        return this.pos.equals(item.pos);
    }

    public Location2D getPos() {
        return pos;
    }

    public int getId() {
        return id;
    }
    
}
