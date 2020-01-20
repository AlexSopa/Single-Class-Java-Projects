import java.util.*;
/*
Driver : Kristi
Nav : Alex

*/
public class BSportsEvent
{
    // instance variables
    private double[] scores = new double[8];
    private Scanner keyboard = new Scanner(System.in);
    
    public SportsEvent()
    {
      System.out.println("Enter 8 scores to continue");
      for(int i = 0; i < 8;i++)
         {
         
         scores[i] = keyboard.nextDouble();
         
         }
    
    }
    
    
    public void readScores()
    {
    for(Double score : scores)
      {
      System.out.println("" + score);
       
     }
    }
	
    /* Determines which score in scores is the lowest
     * @return the lowest score in scores
     */
    public double lowest()
    {
        double temp = Double.MAX_VALUE;
        for(Double score : scores)
        {
         if(score < temp) temp = score;
        }
        return temp;
    }
	
	/* Determines which score in scores is the highest
     * @return the highest score in scores
     */
    public double highest()
    {
      double temp = Double.MIN_VALUE;
      for(Double score : scores)
      {
      if(score > temp) temp = score;
      
      }
      return temp;
        
    }
	
    /* Calculates the average of scores with the lowest and highest scores
     * thrown out.
     * @return the average
     */
    public double average()
    {
        double temp = 0.0;
        
        for(Double score : scores)
        {
        temp += score;
        }
        return temp/scores.length;
    }

    /* This method prints a summary report which includes the original list of
     * scores, the average of the scores, the lowest score, and the highest
     * score.
     */
    public void printSummary()
    {
      System.out.println("-----Summary-----\n");
      readScores();
      System.out.println("\nAverage : " + average() + "\nLowest : " + lowest() + "\nHighest : " + highest()); 
    }

    public static void main(String[] args)
    {
        SportsEvent app = new SportsEvent();
        app.readScores();
        app.printSummary();
    }
}