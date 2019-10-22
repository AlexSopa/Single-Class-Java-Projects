import java.util.Scanner;

public class Payroll_04_23 {
  public static void main(String[] args) {
    Util u = new Util();

// Obtain input by asking user for employee's name. Be sure to create a variable to store employee name 
   
//Obtain user's number of hours. Be sure to create variable for hours. 
    String name = u.getLineResponse("Enter employee's name: ");
    double hours = u.getIntegerResponse("Enter employee's hours: ");
    double payRate = u.getDoubleResponse("Enter hourly pay rate: ");
    double fedTaxWithholdingRate = u.getDoubleResponse("Enter federal tax witholding rate (AS DECIMAL): ");
    double  stateTaxWithholdingRate = u.getDoubleResponse("Enter state tax witholding rate (AS DECIMAL): ");
/*Create a statement that requests user's federal tax withholding rate. 
   Be sure to create a variable called fedTaxWithholdingRate   */



/*Create a statement that requests user's federal tax withholding rate. 
   Be sure to create a variable called stateTaxWithholdingRate */



    double grossPay = hours * payRate;
    double fedTaxWithholding = grossPay * fedTaxWithholdingRate;
    double stateTaxWithholding = grossPay * stateTaxWithholdingRate;
    double totalDeduction = fedTaxWithholding + stateTaxWithholding;
    double netPay = grossPay - totalDeduction;

    // Obtain output using println
//    String out = "Employee Name: " + name + "\n\n";
//    out += "Hours Worked:" + "  " + hours + '\n';
//    out += "Pay Rate:" + "  $" + payRate + '\n';
//    out += "Gross Pay:" + "  $" + grossPay + '\n';
//    out += "Deductions:\n";
//    out += "  Federal Withholding (" + fedTaxWithholdingRate * 100 
//      + "%):" + "  $" + (int)(fedTaxWithholding * 100) / 100.0 + '\n';
//    out += "  State Withholding (" + stateTaxWithholdingRate * 100 + "%):" 
//      + "  $" + (int)(stateTaxWithholding * 100) / 100.0 + '\n';
//    out += "  Total Deduction:" + "  $" 
//      + (int)(totalDeduction * 100) / 100.0 + '\n';
//    out += "Net Pay:" + "   $" + (int)(netPay * 100) / 100.0;

    System.out.printf("Employee Name: %s\n", name);
    System.out.printf("Hours Worked: %.2f\n", hours);
    System.out.printf("Pay Rate: $%.2f\n", payRate);
    System.out.printf("Gross Pay: $%.2f\n", grossPay);
    System.out.printf("Deductions: \n");
    System.out.printf("  Federal Withholding (%.2f%%):  $%.2f\n",
      fedTaxWithholdingRate * 100, fedTaxWithholding);
    System.out.printf("  State Withholding (" + stateTaxWithholdingRate * 100 + "%%):" 
      + "  $%.2f\n", stateTaxWithholding);
    System.out.printf("  Total Deduction:" + "  $%.2f\n", totalDeduction);
    System.out.printf("Net Pay:" + "   $%.2f\n", netPay);
  }
}