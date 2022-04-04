package com.company;

import java.util.Random;

public class Location2D {

    private static int dimX;
    private static int dimY;
    private int x;
    private int y;

    //randomly initialize x and y values
    public Location2D(){
        Random rnd = new Random();
        x = rnd.nextInt(dimX);
        y = rnd.nextInt(dimY);
    }

    public Location2D(int xx, int yy) {
        if (xx >= 0 && xx < dimX) {
            x = xx;
        } else {
            Random rnd = new Random();
            x = rnd.nextInt(dimX);
        }

        if (yy >= 0 && yy < dimY) {
            y = yy;
        } else {
            Random rnd = new Random();
            y = rnd.nextInt(dimY);
        }
    }

    public static void setDimXY(int dx, int dy) {
        //prevent changing more than once
        if (dimX == 0 && dimY == 0) {
            dimX = dx;
            dimY = dy;
        }
    }

    public static int getDimX() {
        return dimX;
    }

    public static int getDimY() {
        return dimY;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int xx) {
        x = xx;
    }

    public void setY(int yy) {
        y = yy;
    }

    //if any value is invalid, change request is ignored
    public void changeLocation(int xx, int yy) {
        if (xx >= 0 && xx < dimX && yy >= 0 && yy < dimY) {
            x = xx;
            y = yy;
        }
    }

    public boolean equals(Location2D loc) {
        if (x == loc.getX() && y == loc.getY()) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "x= " + x + " y= " + y;
    }
}
