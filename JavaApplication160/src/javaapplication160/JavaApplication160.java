
package javaapplication160;
import java.util.Scanner;

public class JavaApplication160 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
//exercise 8 (find the character of an ASCII code)

        System.out.println("enter an ASCII code between 0 and 127");
        int ascii8 = input.nextInt();
        char character8 = (char)(ascii8);
        System.out.println("the character is " + character8);
        
    }
    
}
