
package javaapplication172;
import java.util.Scanner;


public class JavaApplication172 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input =  new Scanner(System.in);
        
//exercise 20 (process a string)

        System.out.println("enter a string:");
        String namestring = input.next();
        
        int lenghtString = namestring.length();
        char firstchar20 = namestring.charAt(0);
        
        System.out.println("the length is " + lenghtString + " and the first character is " + firstchar20);
        
    }
    
}
