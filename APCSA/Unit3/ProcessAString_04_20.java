import java.util.Scanner;

public class ProcessAString_04_20 {
  public static void main(String[] args) {
  
      Util u = new Util();
    String response = u.getLineResponse("Enter a string: ");
    System.out.println(response);
    System.out.println("The length of the string is " + response.length() + " characters" );
    System.out.println("The first character in the string is " + response.charAt(0));    
  }
}