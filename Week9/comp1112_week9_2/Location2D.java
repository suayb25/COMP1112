package comp1112_week9_2;

import java.util.Random;

/**
 *
 * @author talha
 */
public class Location2D {
    private int x, y;
    private static int dimX=-1, dimY=-1;
    public Location2D(){//initializes randomly       
        Random rnd = new Random();
        // a value in the range [0,dimX)
        x = rnd.nextInt(dimX); 
        // a value in the range [0,dimY)
        y = rnd.nextInt(dimY);
    }
    public Location2D(Location2D loc){
        x = loc.getX();
        y = loc.getY();
    }
    public static int getDimX() {
        return dimX;
    }
    public static void setDimX(int aDimX) {
        //we have to prevent changing the dimensions
        if(dimX ==-1)
            dimX= aDimX;
    }
    public static int getDimY() {
        return dimY;
    }
    public static void setDimY(int aDimY) {
        if(dimY==-1)
            dimY = aDimY;
    }   
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public void changeLocation(Location2D loc){
        x = loc.getX();
        y = loc.getY();
    }
    public boolean equals(Location2D loc){
        return x==loc.getX() && y==loc.getY();
    }
    @Override
    public String toString(){
        return "x= "+x+" y= "+y;
    }
}
