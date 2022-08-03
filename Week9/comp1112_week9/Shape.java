package comp1112_week9;

import java.util.Date;

/**
 *
 * @author talha
 */
public abstract class Shape {
    private Date dateCr;
    private String color;
    private boolean filled;

    public Shape( String color, boolean filled) {
        this.dateCr = new Date();
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public Date getDateCr() {
        return dateCr;
    }

    public boolean isFilled() {
        return filled;
    }   
    
    public abstract double getArea();
    
}
