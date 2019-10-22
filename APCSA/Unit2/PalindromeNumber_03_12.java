import java.util.Scanner;

public class PalindromeNumber_03_12 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Util u = new Util();
    int num = u.getIntegerResponse("Enter a three-digit integer :");
   // System.out.print("Enter a three-digit integer: ");
        int reversedInteger = 0, remainder, originalInteger;
        originalInteger = num;

        while( num != 0 )
        {
            remainder = num % 10;
            reversedInteger = reversedInteger * 10 + remainder;
            num  /= 10;
        }
        // palindrome if orignalInteger and reversedInteger are equal
        if (originalInteger == reversedInteger)
            System.out.println(originalInteger + " is a palindrome.");
        else
            System.out.println(originalInteger + " is not a palindrome.");
            
}

/*
        int remainder = palindrome % 10;
        reverse = reverse * 10 + remainder;
        palindrome = palindrome / 10;
*/