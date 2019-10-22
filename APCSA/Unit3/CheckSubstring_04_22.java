import java.util.Scanner;

public class CheckSubstring_04_22 {
  public static void main(String[] args) {
   /* Scanner input = new Scanner(System.in);
    System.out.print("Enter string s1: ");
    
    create a string variable called s1
   
    
    System.out.print("Enter string s2: ");
    Create a second string and call it s2. 
    ________________________*/
    
    Util u = new Util();
    String s1 = u.getLineResponse("Enter string s1: ");
    String s2 = u.getLineResponse("Enter string s2: ");
    
    if (s1.indexOf(s2) != -1) { // -1 means that s2 is not an index of s1
      System.out.println(s2 + " is a substring of " + s1);
    }
    else {
      System.out.println(s2 + " is not a substring of " + s1);
    }
    u.p(s1.substring(2,5));
  }
}