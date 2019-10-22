import java.util.ArrayList;
import java.util.*;
public class RandomMonth_03_04 
{ 
  final static String[] months = {"January" , "Febuary","March","April" , "May" , "June" , "July" , "August" , "September" , "October" , "November" , "December"};
  public static void main(String[] args)
  {
      Util u = new Util();
      Random rand = java.util.concurrent.ThreadLocalRandom.current();
      Integer monthInt = rand.ints(0,12).findFirst().getAsInt();
  }
}
