import java.util.*;
/*
Driver : Alex
Navigator : Kristi
*/
public class AWordList
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    
    String[] words = new String[10];
    
    for(int i = 0; i < 10; i++)
   {
       words[i] = keyboard.nextLine(); 
   }
   
   for(String word : words)
   {
      System.out.println(word);
   
   }
   
   
   
   
    
  }
}