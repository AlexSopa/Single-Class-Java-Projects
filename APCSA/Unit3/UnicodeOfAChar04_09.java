import java.util.Scanner;

public class UnicodeOfAChar04_09 {
  public static void main(String[] args) {
  Util u = new Util();
    char ch = u.getStringResponse("Enter a single character : ").charAt(0);

    // Display result
    System.out.println("The Unicode for the character " + ch + " is "
      + (int)ch);
  }
}