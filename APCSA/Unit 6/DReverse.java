import java.util.*;

/*
Driver : Alex
Nav : Kristi
*/

public class DReverse
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    
    int[] nums = new int[20];
 
   for(int i = 0; i < 20; i++)
      {
     System.out.print("Num " + (i + 1) + " --> ");
     nums[i] = keyboard.nextInt(); 
       }
     
   for(int i = 19; i > 0; i--) /* while the int is bigger than 0 run whatever  */
   {
      System.out.println("Num" + (i-1) + " --> " + nums[i]);
      
   
   }
       
   
   
       
       
       
    
  }
}