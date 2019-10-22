public class Cost_Of_Driving
{
  public static void main(String[] args) 
  {
      /*
      Enter Distance:
      Enter MPG:
      Enter PPG:
      Cost is :---
      */
      double distance,mpg,ppg,cost;
      java.util.Scanner input = new java.util.Scanner(System.in); 
      System.out.println("Enter the driving distance : ");
      distance = input.nextDouble();
      System.out.println("Enter miles per gallon : ");
      mpg = input.nextDouble();
      System.out.println("Enter price per gallon : ");
      ppg = input.nextDouble();
      cost = (distance / mpg) * ppg;
      System.out.println("That drive will cost you : " + cost);
      
  
  }
}