import java.util.Scanner;

public class CheckSocialSecurityNumber_04_21 {
  public static void main(String[] args) {
   /* Scanner input = new Scanner(System.in);
    System.out.print("Enter a SSN: ");*/
    Util u = new Util();
    String ssn = u.getStringResponse("Enter a SSN: ");
    
    
    boolean isValid = ssn.length() == 11 && //This is tested using 453-14-3288 , comes out as a valid SSN
    		ssn.charAt(0) <= '9' && ssn.charAt(0) >= '0' &&
        Character.isDigit(ssn.charAt(1)) && Character.isDigit(ssn.charAt(2)) && 
        ssn.charAt(3) == '-' && Character.isDigit(ssn.charAt(4)) && 
        Character.isDigit(ssn.charAt(5)) && ssn.charAt(6) == '-' && 
        Character.isDigit(ssn.charAt(7)) && Character.isDigit(ssn.charAt(8)) && 
        Character.isDigit(ssn.charAt(9)) && Character.isDigit(ssn.charAt(10));

// crate if/else statement that communicates to user whether the social security number is valid. 

    if (isValid)
      System.out.println(ssn + " is a valid social security number");
    else
      System.out.println(ssn + " is an invalid social security number");
  }
}