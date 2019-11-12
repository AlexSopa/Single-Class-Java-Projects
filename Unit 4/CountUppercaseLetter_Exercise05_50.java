public class CountUppercaseLetter_Exercise05_50 {
  public static void main(String[] args) {
    java.util.Scanner input = new java.util.Scanner(System.in);

    System.out.print("Enter a string: ");
    String s = input.nextLine();
    int total = 0;
    
    // create a for statement that recognizes whether a string contains capital letters. 
    
    for(char c : s.toCharArray())
      if(Character.isUpperCase(c)) total++;

    System.out.println("The number of uppercase letters is " +
      total);
  }
}