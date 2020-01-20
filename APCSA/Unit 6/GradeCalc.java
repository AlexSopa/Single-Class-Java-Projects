import java.util.*;
/*
Driver : Alex
Nav : Kristi

*/
public class GradeCalc
{
   private int amountOfStudents;
   private int[] rawScores = new int[1];
   private int bestScore = 0;
   private Scanner keyboard = new Scanner(System.in);
   
   public static void main(String[] args)
   {
   /**Start**/
   GradeCalc gc = new GradeCalc();
   System.out.println("Enter number of students :");
   gc.amountOfStudents();
   System.out.println("Enter grades for each student...");
   gc.enterGrades();
   gc.printData();
   }
   
   public void amountOfStudents()
   {
   amountOfStudents = keyboard.nextInt();
   rawScores = new int[amountOfStudents];
   System.out.println(amountOfStudents + " Students specified");
   
   }
   
   public void printData()
   {
   
         calcBest();
      int temp = 0;
   for(int score : rawScores)
   {
   System.out.print("Student " + temp + " recieved a score of : " + score + " and a grade of : " );
      temp++;
      if(score >= bestScore - 10 ){
      System.out.println("A");
      } else if(score >= bestScore - 20){
      System.out.println("B");
      } else if(score >= bestScore - 30){
      System.out.println("C");
      } else if(score >= bestScore - 40){
      System.out.println("D");
      } else {
      System.out.println("F");
      }
      }
   }
   
   public void enterGrades()
   {
      int temp = 0;
      while(temp < rawScores.length)
      {
         rawScores[temp] = keyboard.nextInt();
         temp++;
      
      }
   
   }
   
   public void calcBest()
   {
   
      for(int i : rawScores)
      {
         if(i > bestScore) bestScore = i;
         
      
      }
   
   }
   
   

}