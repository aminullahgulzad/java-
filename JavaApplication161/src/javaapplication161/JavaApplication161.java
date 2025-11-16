
package javaapplication161;
import java.util.Scanner;

public class JavaApplication161 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
//exercise 9 (unicode of a character)

        System.out.println("enter the character to find its unicode:");
        String character9 = input.next();
        char character99 = character9.charAt(0);
        int unicode9 = (int)(character99);
        
        System.out.println("the unicode of this character is " + unicode9);
        
    }
    
}
