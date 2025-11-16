
package javaapplication177;
import java.util.Scanner;

public class JavaApplication177 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
//exercise 25 (generate vehicle plate number)

        int characterone = (int) ((Math.random() * 26) + 65);
        char randomCharacter1 = (char)(characterone);
        
        int charactertwo = (int) ((Math.random() * 26) + 65);
        char randomCharacter2 = (char)(charactertwo);
        
        int characterthree = (int)((Math.random() * 26) + 65);
        char randomCharacter3 = (char)(characterthree);
        
        int digit1 = (int)(Math.random() * 10);
        int digit2 = (int)(Math.random() * 10);
        int digit3 = (int)(Math.random() * 10);
        int digit4 = (int)(Math.random() * 10);
        
        System.out.println("the plate generated is: ");
        System.out.println(randomCharacter1 + "" + randomCharacter2 + "" + randomCharacter3 + "" + digit1 + "" + digit2 + "" + digit3 + "" + digit4);
        
    }
    
}
