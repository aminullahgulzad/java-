
package javaapplication175;
import java.util.Scanner;

public class JavaApplication175 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
//exercise 23 (payroll)

        System.out.print("Enter employee's name: ");
        String name23 = input.nextLine();

        System.out.print("Enter number of hours worked in a week: ");
        double hours23 = input.nextDouble();

        System.out.print("Enter hourly pay rate: ");
        double payRate23 = input.nextDouble();

        System.out.print("Enter federal tax withholding rate (e.g., 0.20 for 20%): ");
        double federalTaxRate23 = input.nextDouble();

        System.out.print("Enter state tax withholding rate (e.g., 0.09 for 9%): ");
        double stateTaxRate23 = input.nextDouble();

        double grossPay = hours23 * payRate23;
        double federalWithholding = grossPay * federalTaxRate23;
        double stateWithholding = grossPay * stateTaxRate23;
        double totalDeduction = federalWithholding + stateWithholding;
        double netPay = grossPay - totalDeduction;

        System.out.println("\nEmployee Name: " + name23);
        System.out.println("Hours Worked: " + hours23);
        System.out.println("Pay Rate: $" + payRate23);
        System.out.println("Gross Pay: $" + grossPay);
        System.out.println("Deductions:");
        System.out.printf("  Federal Withholding (%.1f%%): $%.2f\n", federalTaxRate23 * 100, federalWithholding);
        System.out.printf("  State Withholding (%.1f%%): $%.2f\n", stateTaxRate23 * 100, stateWithholding);
        System.out.printf("  Total Deduction: $%.2f\n", totalDeduction);
        System.out.printf("Net Pay: $%.2f\n", netPay);
        
    }
    
}
