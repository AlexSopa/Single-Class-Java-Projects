import java.util.Scanner;

public class CompoundOperator_03_26 {
  public static void main(String[] args) {
      java.util.Scanner input = new java.util.Scanner(System.in);
      Util u = new Util();
    // Enter an integer
   // System.out.print("Enter an integer: ");
     int number = u.getIntegerResponse("Enter an integer: ");

    System.out.println("Is " + number + " divisible by 5 and 6? " +
      ((number % 5 == 0) && (number % 6 == 0)));

    System.out.println("Is " + number + " divisible by 5 or 6? " +
      ((number % 5 == 0) || (number % 6 == 0)));

    System.out.println("Is " + number +
      " divisible by 5 or 6, but not both? " +
      ((number % 5 == 0) ^ (number % 6 == 0)));
  }
}