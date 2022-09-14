import java.util.Scanner;

public class Exercise04_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter employee's name: ");
        String name = input.nextLine();
        System.out.print("Enter number of hours worked in a week: ");
        double workHour = input.nextDouble();
        System.out.print("Enter hourly pay rate: ");
        double payRate = input.nextDouble();
        System.out.print("Enter federal tax withholding rate: ");
        double federalWithholdingRate = input.nextDouble();
        System.out.print("Enter state tax withholding rate: ");
        double stateWithholdingRate = input.nextDouble();

        double grossPay = Math.round(payRate * workHour * 10) / 10.0;
        double federalTax = Math.round(grossPay * federalWithholdingRate * 100) / 100.0;
        double stateTax = Math.round(grossPay * stateWithholdingRate * 100) / 100.0;
        double netPay = Math.round((grossPay - stateTax - federalTax) * 100) / 100.0;

        System.out.println("Employee Name: " + name);
        System.out.println("Hours Worked: " + workHour);
        System.out.println("Pay Rate: $" + payRate);
        System.out.println("Gross Pay: $" + grossPay);
        System.out.println("Deductions:");
        System.out.println("    Federal Withholding (" + (100 * federalWithholdingRate) + "%): $" + federalTax);
        System.out.println("    State Withholding (" + (100 * stateWithholdingRate) + "%): $" + stateTax);
        System.out.println("    Total Deduction: $" + (federalTax + stateTax));
        System.out.println("Net Pay: $" + netPay);
    }
}
