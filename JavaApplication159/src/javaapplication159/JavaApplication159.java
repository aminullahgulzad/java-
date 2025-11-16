
package javaapplication159;
import java.util.Scanner;

public class JavaApplication159 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
//exercise 7 (corner points coordinates)

        System.out.print("Enter the radius of the bounding circle: ");
        double r7 = input.nextDouble();

        int numPoints = 5;

        System.out.println("The coordinates of the five points are:");

        for (int i = 0; i < numPoints; i++) {
            double angle = 2 * Math.PI * i / numPoints; 
            double x = r7 * Math.cos(angle);
            double y = r7 * Math.sin(angle);
            System.out.printf("P%d: (%.2f, %.2f)%n", i + 1, x, y);
        }
        
    }
    
}
