import java.util.Scanner;

public class OrderThreeCities_04_24 {
  public static void main(String[] args) {
    Util u = new Util();
    String s1 =  u.getLineResponse("Provide 3 cities seperately : City 1 :");
    String s2 =  u.getLineResponse("Provide 3 cities seperately : City 2 :");
    String s3 =  u.getLineResponse("Provide 3 cities seperately : City 3 :");

    // Create a prompt that allows the user to enter three cities and holds three separate variables. 
    
 
    
    if (s1.compareTo(s2) > 0) {
      // Swap s1 with s2
      String temp = s1;
      s1 = s2;
      s2 = temp;
    }
  
    if (s2.compareTo(s3) > 0) {
      // Swap s2 with s3
      String temp = s2;
      s2 = s3;
      s3 = temp;
    }  
  
    if (s1.compareTo(s2) > 0) {
      // Swap s1 with s2
      String temp = s1;
      s1 = s2;
      s2 = temp;
    }
  
    System.out.print("The three cities in alphabetical order are " 
      + s1 + " " + s2 + " " + s3);
  }
}