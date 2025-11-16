
package javaapplication176;
import java.util.Scanner;

public class JavaApplication176 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
//exercise 24 (order three cities)

        System.out.println("enter the first city name:");
        String city1Name = input.next();
        System.out.println("enter the second city name:");
        String city2Name = input.next();
        System.out.println("enter the third city name:");
        String city3Name = input.next();
        
        
        char cityOne24 = city1Name.charAt(0);
        char cityTwo24 = city2Name.charAt(0);
        char cityThree24 = city3Name.charAt(0);
        
        if (cityOne24 < cityTwo24 && cityOne24 < cityThree24){
            if(cityTwo24 < cityThree24)
                System.out.println("the aphabetic order is " + city1Name + " " + city2Name + " " + city3Name);
            else if(cityThree24 < cityTwo24)
                System.out.println("the order is " + city1Name + " " + city3Name + " " + city2Name);
        }
        
        else if (cityTwo24 < cityOne24 && cityTwo24 < cityThree24){
            if(cityOne24 < cityThree24)
                System.out.println("the order is " + city2Name + " " + city1Name + " " + city3Name);
            else if(cityThree24 < cityOne24)
                System.out.println("the order is " + city2Name + " " + city3Name + " " + city1Name);
        }
        
        else if (cityThree24 < cityOne24 && cityThree24 < cityTwo24){
            if(cityOne24 < cityTwo24)
                System.out.println("the order is " + city3Name + " " + city1Name + " " + city2Name);
            else if(cityTwo24 < cityOne24)
                System.out.println("the order is " + city3Name + " " + city2Name + " " + city1Name);
        }
        
        
    }
    
}
