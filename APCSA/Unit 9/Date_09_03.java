import java.util.Date;
/**
(Use the Dateclass) Write a program that creates a Date object, 
sets its elapsed time  to  10000, 100000, 1000000, 10000000, 100000000,
1000000000, 10000000000,  and  100000000000,  and  displays  the  date 
 and  time  using  the  toString() method, respectively


*/

public class Date_09_03 {
  public static void main(String[] args) {
    Date date = new Date();
    
    int count = 1;
    long time = 10000;
    
   // Decide what type of loop should be created starting on line #20. 
    
    while (count <= time) {
      date.setTime(time);
      System.out.println(date.toString());   
      count++;
      time *= 10;
    }
  }
}