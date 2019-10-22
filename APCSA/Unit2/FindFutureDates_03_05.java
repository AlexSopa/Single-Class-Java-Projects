import java.util.Scanner;

public class FindFutureDates_03_05 {
  public static void main(String[] args) {
    Util u = new Util();
    Integer today,elapsedDays;
    

    // Prompt the user to enter an integer for today
     today = u.getIntegerResponse("Enter today's day: ");//today = (int) u.getDoubleResponse("Enter today's day:"); //Blind cast sorry I'm lazy
   
  
     elapsedDays = u.getIntegerResponse("Enter the number of days elapsed since today");//elapsedDays = (int) u.getDoubleResponse("Enter the number of days elapsed since today:"); // Also blind cast oops :)
     
    
    String nameForToday = "";        //The number given isn't the date, the number given is the number corresponding to the day. It won't match up with the current date
    if (today == 0)
      nameForToday = "Sunday";
    else if (today == 1)
      nameForToday = "Monday";
    else if (today == 2)
      nameForToday = "Tuesday";
    else if (today == 3)
      nameForToday = "Wednesday";
    else if (today == 4)
      nameForToday = "Thursday";
    else if (today == 5)
      nameForToday = "Friday";
    else if (today == 6)
      nameForToday = "Saturday";

    int futureDay = ((today + elapsedDays) % 7);
    String nameForFutureDay = "";
    if (futureDay == 0)
      nameForFutureDay = "Sunday";
    else if (futureDay == 1)
      nameForFutureDay = "Monday";
    else if (futureDay == 2)
      nameForFutureDay = "Tuesday";
    else if (futureDay == 3)
      nameForFutureDay = "Wednesday";
    else if (futureDay == 4)
      nameForFutureDay = "Thursday";
    else if (futureDay == 5)
      nameForFutureDay = "Friday";
    else if (futureDay == 6)
      nameForFutureDay = "Saturday";
    
    System.out.println("Today is " + nameForToday 
        + " and the future day is " + nameForFutureDay);
  }
  
}