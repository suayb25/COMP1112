package comp1112_week9;

/**
 *
 * @author talha
 */
public class Rectangle extends Shape {
    private double h,w;

    public Rectangle(double h, double w, String color, boolean filled) {
        super(color, filled);
        this.h = h;
        this.w = w;
    }

    public double getH() {
        return h;
    }

    public double getW() {
        return w;
    }
    
    @Override
    public double getArea(){
        return h*w;
    }
    
    @Override
    public String toString(){
        return "Rectangle";
    }
}
