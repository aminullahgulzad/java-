
package javaapplication155;
import java.util.Scanner;

public class JavaApplication155 {

  
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
//exercise 3 (estimate area)

        double atlantaLat = Math.toRadians(33.7489954);
        double atlantaLon = Math.toRadians(-84.3879824);
        double orlandoLat = Math.toRadians(28.5383355);
        double orlandoLon = Math.toRadians(-81.3792365);
        double savannahLat = Math.toRadians(32.0835407);
        double savannahLon = Math.toRadians(-81.0998342);
        double charlotteLat = Math.toRadians(35.2270869);
        double charlotteLon = Math.toRadians(-80.8431267);
        
        double atlantaOrlando = longDistance(atlantaLat, atlantaLon, orlandoLat, orlandoLon);
        double orlandoSavannah = longDistance(orlandoLat, orlandoLon, savannahLat, savannahLon);
        double atlantaSavannah = longDistance(atlantaLat, atlantaLon, savannahLat, savannahLon);
        double atlantaCharlotte = longDistance(atlantaLat, atlantaLon, charlotteLat, charlotteLon);
        double savannahCharlotte = longDistance(savannahLat, savannahLon, charlotteLat, charlotteLon);

        double s1 = (atlantaOrlando + orlandoSavannah + atlantaSavannah) / 2;
        double area1 = Math.sqrt(s1 * (s1 - atlantaOrlando) * (s1 - orlandoSavannah) * (s1 - atlantaSavannah));

        double s2 = (atlantaSavannah + savannahCharlotte + atlantaCharlotte) / 2;
        double area2 = Math.sqrt(s2 * (s2 - atlantaSavannah) * (s2 - savannahCharlotte) * (s2 - atlantaCharlotte));

        double totalArea = area1 + area2;

        System.out.printf("total area enclosed by these four cities(Atlanta, Orlando, Savannah, Charlotte) is:\n%.2f km²%n", totalArea);
        
    }
    
}
