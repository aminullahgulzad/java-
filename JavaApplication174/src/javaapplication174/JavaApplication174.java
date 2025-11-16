
package javaapplication174;
import java.util.Scanner;

public class JavaApplication174 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
//exercise 22 (check substring) 

        System.out.println("enter the first String:");
        String one22 = input.next();
        System.out.println("enter the second String:");
        String second22 = input.next();
        
        if (one22.indexOf(second22) != -1)
            System.out.println("the second string is a substring of first string");
        else
            System.out.println("the second string is not a substring of the first string");
        
    }
    
}
