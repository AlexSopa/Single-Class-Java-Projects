public class AverageSpeedInMiles_01_10 {
  public static void main(String[] args) {
  
  double miles = 14/1.6;
  double time = 45*60 + 30;
  
  System.out.println("The runner runs at a spead of " + Math.round(miles/(time/60)));
  
  
  } //14 kilometers in 45 minutes and 30seconds. 
    //Write a program that displays the average speed in miles per hour. 
    //(Note that1 mile is 1.6 kilometers.)
}