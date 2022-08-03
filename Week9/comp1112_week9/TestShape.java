package comp1112_week9;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author talha
 */
public class TestShape {
    
    public static ArrayList<Shape> allShapes;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        allShapes = new ArrayList<>();
       int choice;
       boolean filled;
       String color;
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter color: ");
            color = input.next();
            System.out.println("Enter filled: ");
            filled = input.nextBoolean();
            System.out.println("1- Square\n2-Circle");
            choice = input.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter width: ");
                    double w = input.nextDouble();
                    System.out.println("Enter  height: ");
                    double h = input.nextDouble();
                    allShapes.add(new Rectangle(h, w, color, filled));
                    break;
                case 2:
                    System.out.println("Enter rad: ");
                    double rad = input.nextDouble();
                    allShapes.add(new Circle(rad, color, filled));
                    break;
                default:
                    break;         
            }
            for (int j = 0; j < allShapes.size(); j++) {
                System.out.print(allShapes.get(i) + " ");
                System.out.println(allShapes.get(i).getArea());
            }
        }
    }
}
