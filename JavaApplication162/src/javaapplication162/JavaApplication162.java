
package javaapplication162;
import java.util.Scanner;


public class JavaApplication162 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
//exercise 10 (guess birthday)

        System.out.println("The program will guess your birthdate by giving you some sets of numbers and asking you if your birthdate is inside the set or not:");
        System.out.println("if your birth date is inside a set enter Y and if not enter N:");
        System.out.println("set one:\n"
                         + "1   3   5    7\n"
                         + "9   11  13  15\n"
                         + "17  19  21  23\n"
                         + "25  27  29  31");
        String set1 = input.next();
        int num1 = 0;
        if (set1.equalsIgnoreCase("Y"))
            num1 = 1;
        
        System.out.println("set two:\n"
                         + "2   3   6   7\n"
                         + "10  11  14  15\n"
                         + "18  19  22  23\n"
                         + "26  27  30  31");
        String set2 = input.next();
        int num2 = 0;
        if (set2.equalsIgnoreCase("y"))
            num2 = 2;
        
        System.out.println("set three:\n"
                         + "4   5   6   7\n"
                         + "12  13  14  15\n"
                         + "20  21  22  23\n"
                         + "28  29  30  31");
        String set3 = input.next();
        int num3 = 0;
        if (set3.equalsIgnoreCase("y"))
            num3 = 4;
        
        System.out.println("set four:\n"
                         + "8   9   10  11\n"
                         + "12  13  14  15\n"
                         + "24  25  26  27\n"
                         + "28  29  30  31");
        String set4 = input.next();
        int num4 = 0;
        if (set4.equalsIgnoreCase("y"))
            num4 = 8;
        
        System.out.println("set five:\n"
                         + "16  17  18  19\n"
                         + "20  21  22  23\n"
                         + "24  25  26  27\n"
                         + "28  29  30  31");
        String set5 = input.next();
        int num5 = 0;
        if (set5.equalsIgnoreCase("y"))
            num5 = 16;
        
        System.out.println("your birthdate is: " + (num1 + num2 + num3 + num4 + num5));
        
    }
    
}
