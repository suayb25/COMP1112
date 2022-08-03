package comp1112_week9;

/**
 *
 * @author talha
 */
public class Circle extends Shape {
    private double rad;

    public Circle(double rad, String color, boolean filled) {
        super(color, filled);
        this.rad = rad;
    }

    public double getRad() {
        return rad;
    }
    
    @Override
    public double getArea(){
        return Math.PI*rad*rad;
    }
    
    @Override
    public String toString(){
        return "Circle ";
    }
    
}
