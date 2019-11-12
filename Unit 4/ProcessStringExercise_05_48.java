import java.util.Scanner;

public class ProcessStringExercise_05_48 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String s = input.nextLine();
    String returnVal = "";
    for(int i=1; i < s.length();i++) //Starts at 1 -> The first character.
    {
    
      if(i%2 != 0)
      {
         returnVal+=(s.toCharArray()[i-1]); //Uses magic number of 1 because arrays start at 0
        
      
      }
    
    }
    System.out.println(returnVal);
  }
}