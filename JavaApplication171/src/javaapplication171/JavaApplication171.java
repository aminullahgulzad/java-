
package javaapplication171;
import java.util.Scanner;

public class JavaApplication171 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        
//exercise 19 (ISBN revised with string)

         System.out.println("enter the 9 digit of ISBN:");
         String nineISBN = input.next();
         
         char d1 = nineISBN.charAt(0);
         char d2 = nineISBN.charAt(1);
         char d3 = nineISBN.charAt(2);
         char d4 = nineISBN.charAt(3);
         char d5 = nineISBN.charAt(4);
         char d6 = nineISBN.charAt(5);
         char d7 = nineISBN.charAt(6);
         char d8 = nineISBN.charAt(7);
         char d9 = nineISBN.charAt(8);
         
         int d1_ = d1 - '0';
         int d2_ = d2 - '0';
         int d3_ = d3 - '0';
         int d4_ = d4 - '0';
         int d5_ = d5 - '0';
         int d6_ = d6 - '0';
         int d7_ = d7 - '0';
         int d8_ = d8 - '0';
         int d9_ = d9 - '0';

            
         int tenISBN = ((d1_ * 1) + (d2_ * 2) + (d3_ * 3) + (d4_ * 4) + (d5_ * 5) + (d6_ * 6) + (d7_ * 7) + (d8_ * 8) + (d9_ * 9)) % 11;
            
         if (tenISBN == 10)
            System.out.println(nineISBN + "X");
         else if (tenISBN < 10)
            System.out.println(nineISBN + "" + tenISBN);
        
    }
    
}
