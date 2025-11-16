
package javaapplication158;
import java.util.Scanner;

public class JavaApplication158 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
//exercise 6 (random points on a circle)

        double radius6 = 40;

        double a1 = Math.random() * 2 * Math.PI;
        double a2 = Math.random() * 2 * Math.PI;
        double a3 = Math.random() * 2 * Math.PI;

        double x1 = radius6 * Math.cos(a1);
        double y1 = radius6 * Math.sin(a1);

        double x2 = radius6 * Math.cos(a2);
        double y2 = radius6 * Math.sin(a2);

        double x3 = radius6 * Math.cos(a3);
        double y3 = radius6 * Math.sin(a3);

        double side16 = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
        double side26 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2)); 
        double side36 = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        
        double angle1 = Math.acos((side26 * side26 + side36 * side36 - side16 * side16) / (2 * side26 * side36));
        double angle2 = Math.acos((side16 * side16 + side36 * side36 - side26 * side26) / (2 * side16 * side36));
        double angle3 = Math.acos((side16 * side16 + side26 * side26 - side36 * side36) / (2 * side16 * side26));
        
        angle1 = Math.toDegrees(angle1);
        angle2 = Math.toDegrees(angle2);
        angle3 = Math.toDegrees(angle3);

        System.out.printf("The three randomly generated angles are %.2f, %.2f, and %.2f\n", angle1, angle2, angle3);
        
    }
    
}
