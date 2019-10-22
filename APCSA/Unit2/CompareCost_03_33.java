import java.util.Scanner;
import java.lang.Math.*;

public class CompareCost_03_33 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Util u = new Util();
    //System.out.print("Enter weight and price for package 1: ");
    int weight1 = u.getIntegerResponse("Enter weight for package 1: ");
    double price1 = u.getDoubleResponse("Enter the price for package 1: ");
    
   // System.out.print("Enter weight and price for package 2: ");
    int weight2 = u.getIntegerResponse("Enter weight for package 2: ");
    double price2 = u.getDoubleResponse("Enter the price for package 2: ");

    if (price1 / weight1 > price2 / weight2)
      System.out.println("Package 2 has a better price.");
    else if (price1 / weight1 == price2 / weight2)
      System.out.println("Two packages have the same price");
    else 
      System.out.println("Package 1 has a better price.");
  }
}