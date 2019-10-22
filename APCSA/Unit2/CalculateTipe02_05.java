public class CalculateTipe02_05 {
  public static void main(String[] args) {
    // Read subtotal
    java.util.Scanner input = new java.util.Scanner(System.in);
    System.out.print("Enter subtotal and gratuity rate: ");
    double subtotal = input.nextDouble();
    double rate = input.nextDouble();

    double tip = subtotal * (rate / 100);
    double grandtotal = tip + subtotal;

    System.out.println("The gratuity is $" + tip+" total is $" + grandtotal);
    }
  }