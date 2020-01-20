import java.util.*;

/**
Driver : Alex
Nav : Kristi
*/
public class Exercise_03 {

   private int[] occuring = new int[100];
   private Scanner keyboard = new Scanner(System.in);
   
   public Exercise_03()
   {
   }
   
   public void start()
   {
      populateOccuring(0, keyboard.nextInt());
      System.out.println("Numbers have been entered...");
      
      for(Integer itterator : occuring)
      {
         int occurances = calcOccurances(itterator);
         if(occurances > 0)
         {
            System.out.println(itterator + " occurs " + occurances + " time(s)");
         
         }
      
      
      }      
      
   }
   
   public void populateOccuring(int i, int temp)
   {
      if(temp != 0)
      {
         
         occuring[i] = temp;
         populateOccuring(i+1,keyboard.nextInt());
         
         
      }
      
   }
   
   public int calcOccurances(int occurance)
   {
      int rVal = 0;
      for(int i : occuring)
      {
      if(occurance == i) rVal++;
      
      }
      
      return rVal;
   
   }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   public static void main(String[] s)
   {
   System.out.println("Enter integers 1-100, enter 0 to finish");
   
   Exercise_03 e3 = new Exercise_03();
   
   e3.start();
   
   
   }

}