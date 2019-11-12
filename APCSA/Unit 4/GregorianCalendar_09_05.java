import java.util.GregorianCalendar;

/**

Use the GregorianCalendarclass) Java API has the GregorianCalendar 
class in the java.util package, which you can use to obtain the year,
 month, and day of a date. The no-arg constructor constructs an instance
  for the current date, and the meth-odsget(GregorianCalendar.YEAR),
  get(GregorianCalendar.MONTH),andget(GregorianCalendar.DAY_OF_MONTH) 
  return the year, month, and day. Write a program to perform two tasks: 
        1. Display the current year, month, and day.    
        2.  TheGregorianCalendar  class  has  the  setTimeInMillis(long), 
              which  can be used to set a specified elapsed time since January
              1, 1970. Set the value to1234567898765L and display the year, 
              month, and day. 
          
 */
 
 //Describe in comments what is occuring in each block. 

public class GregorianCalendar_09_05 {
  public static void main(String[] args) {
    GregorianCalendar calendar = new GregorianCalendar(); //The gregorian calender object is being created / initialized as 'calender'
    System.out.println("Year is " + calendar.get(GregorianCalendar.YEAR)); // Using enumerations provided by the gregorian calender API, you're able to fetch 'YEAR'
    System.out.println("Month is " + calendar.get(GregorianCalendar.MONTH)); // & 'MONTH'
    System.out.println("Date is " + calendar.get(GregorianCalendar.DATE));// & 'DATE'

    calendar.setTimeInMillis(1234567898765L); //Using a setter provieded in the calender class, the time is set to '123456798765L'
    System.out.println("Year is " + calendar.get(GregorianCalendar.YEAR)); //The same getters are being used to get the newly calculated date & time using the provided time in Miliseconds
    System.out.println("Month is " + calendar.get(GregorianCalendar.MONTH));
    System.out.println("Date is " + calendar.get(GregorianCalendar.DATE));
  }
}