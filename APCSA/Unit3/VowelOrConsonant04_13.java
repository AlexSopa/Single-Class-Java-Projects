import java.util.Scanner;

public class VowelOrConsonant04_13 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a letter: ");
    char letter = input.nextLine().charAt(0);
    
    if (Character.toUpperCase(letter) == 'a' || Character.toUpperCase(letter) == 'e' || Character.toUpperCase(letter) == 'i' 
        || Character.toUpperCase(letter) == 'o' || Character.toUpperCase(letter) == 'u')
      System.out.println(letter + " is a vowel");
    else if (Character.isLetter(letter))
      System.out.println(letter + " is a consonant");
    else
      System.out.println(letter + " is an invalid input");
  }
}