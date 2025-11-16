
package javaapplication178;
import java.util.Scanner;

public class JavaApplication178 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
//exercise 26 (monetary units)

        System.out.println("enter the amount of your money (like : 11.56)");
        String money26 = input.next();
        
        int k = money26.indexOf('.');
        System.out.println("the amount of dollors is " + money26.substring(0, k) + " and the amount of the cents is " + money26.substring(k + 1));
        
        
    }
    
    public static double longDistance(double lat1, double lon1, double lat2, double lon2){
        return 6371.01 * Math.acos(Math.sin(lat1) * Math.sin(lat2)+ Math.cos(lat1) * Math.cos(lat2) * Math.cos(lon1 - lon2));

    }
    
}

    
    

