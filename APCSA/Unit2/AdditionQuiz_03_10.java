import java.util.*;
public class AdditionQuiz_03_10 {
  public static void main(String[] args) {
    Util u = new Util();
    int number1 = u.generateRandom(9,1);
    int number2 = u.generateRandom(9,1);// 1. Generate two random single-digit integers
 

    int answer = u.getIntegerResponse("What is " + number1 + " + " + number2 + " :");// 2. Prompt the student to answer "what is number1 + number2?"
  

    // 4. Grade the answer and display the result
    String replyString;
    if (number1 + number2 == answer)
      replyString = "You are correct!";
    else
      replyString = "Your answer is wrong.\n" + number1 + " + "
        + number2 + " should be " + (number1 + number2);
    
    System.out.println(replyString);
  }
}

class Util {

      java.util.Scanner input = new java.util.Scanner(System.in);
      
      public  void main(String[] strings)
      {
      
      }
      public double getDoubleResponse(String s)
      {
      
         p(s);
         double response = input.nextDouble();
         return response;
         
      
      }
      public Integer getIntegerResponse(String s)
      {
      
         p(s);
         double r = input.nextDouble();
         if(r % 1 == 0)
         {
            return ((int)r);
         
         }
         return 000000;
      
      }
      public String getStringResponse(String s)
      {
      
         p(s);
         String response = input.next();
         return response;
      
      }
      
      public void p(String... s)
      {
         int i = 0;
         
          for(String str : s)
          {
              System.out.println(s[i]);
              i++;     
          }  
      }
      public void printTable(String... str)
      {
           int i = 0;
           String format = "|%1$-10s|%2$-10s|%3$-20s|\n";
           
           for(String s : str)
           {
               if(str.length > i+2)
               {

               System.out.format(format, str[i], str[i+1], str[i+2]);
               } else {
               return;
               }
               i+=2;
           
           }
      
      
      
      }
      
      public static int generateRandom(int top, int bottom)
      {
         Random rand = java.util.concurrent.ThreadLocalRandom.current();
         return rand.ints(bottom,top).findFirst().getAsInt();
         
      
      
      }


}



