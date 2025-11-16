
package javaapplication173;
import java.util.Scanner;

public class JavaApplication173 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
//exercise 21 (check ssn)    

       System.out.println("Enter a social security number (format DDD-DD-DDDD):");
        String ssnNumber = input.next();

        boolean isValid = true;

        if (ssnNumber.length() != 11) 
            isValid = false;
          else {
            for (int i = 0; i < ssnNumber.length(); i++) {
                char ch = ssnNumber.charAt(i);

                if (i == 3 || i == 6) {
                    if (ch != '-') {
                        isValid = false;
                        break;
                    }
                } else {
                    if (!Character.isDigit(ch)) {
                        isValid = false;
                        break;
                    }
                }
            }
        }

        if (isValid)
            System.out.println(ssnNumber + " is a valid social security number!");
        else
            System.out.println(ssnNumber + " is not a valid social security number!");
        
    }
    
}
