
package javaapplication163;
import java.util.Scanner;

public class JavaApplication163 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        
//exercise 11 (decimal to hex)

        System.out.print("Enter a decimal value (0 to 15): ");
        int number11 = input.nextInt();

        if (number11 >= 0 && number11 <= 15) {
            if (number11 < 10) 
                System.out.println("The hex value is " + number11);
            else {
                char hexChar11 = (char) ('A' + (number11 - 10));
                System.out.println("The hex value is " + hexChar11);
            }
        } else
            System.out.println("Invalid input");
        
    }
    
}
