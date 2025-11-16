
package javaapplication153;
import java.util.Scanner;


public class JavaApplication153 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
//exercise 1 (Area of a pentagon)
        
        System.out.println("enter the lenght of the center of the pentagon to a vertex:");
        double lenghtOfVertex = input.nextDouble();
        
        double sidePentagon = 2 * lenghtOfVertex * Math.sin(Math.PI / 5);
        double areaPentagon = (5 * Math.pow(sidePentagon, 2)) / (4 * Math.tan(Math.PI / 5));
        
        System.out.printf("the area of the pentagon is %.2f%n", areaPentagon);
        
    }
    
}
