import java.util.Scanner;

public class ConvertLetterGradeToNumber_04_14 {
  public static void main(String[] args) {
  Util u = new Util();
    Scanner input = new Scanner(System.in);
    char grade = u.getStringResponse("Enter a letter grade: ").charAt(0);

    int value = 0;
    if (Character.toUpperCase(grade) == 'F')
      value = 1;
    else if (Character.toUpperCase(grade) == 'D')
      value = 2;
    else if (Character.toUpperCase(grade) == 'C')
      value = 3;
    else if (Character.toUpperCase(grade) == 'B')
      value = 4;
    else if (Character.toUpperCase(grade) == 'A')
      value = 5;
    else {
      System.out.println(grade + " is an invalid grade");
      System.exit(1);
    }

    System.out.println("The numeric value for grade " + grade 
      + " is " + value);
  }  
}
