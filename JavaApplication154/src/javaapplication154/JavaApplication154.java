
package javaapplication154;
import java.util.Scanner;

public class JavaApplication154 {

  
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner input = new Scanner(System.in);
       
//exercise 2 (great circle distance)

        System.out.println("enter the latitude and longitude of the point one in degrees:");
        double latitude1 = input.nextDouble();
        double longitude1 = input.nextDouble();
        System.out.println("enter the latitude and longitude of the point two in degrees:");
        double latitude2 = input.nextDouble();
        double longitude2 = input.nextDouble();
        
        latitude1 = Math.toRadians(latitude1);
        longitude1 = Math.toRadians(longitude1);
        
        latitude2 = Math.toRadians(latitude2);
        longitude2 = Math.toRadians(longitude2);
        
        double distance2 = (6371.01 * Math.acos(Math.sin(latitude1) * Math.sin(latitude2) + (Math.cos(latitude1) * Math.cos(latitude2) * Math.cos(longitude1 - longitude2))));

        System.out.println("the distance between these two points is " + distance2 + " KM");

    }
    
}
