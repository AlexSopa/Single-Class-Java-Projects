public class SortThreeNumbers_03_08 {
  public static void main(String[] args) {
    java.util.Scanner input = new java.util.Scanner(System.in);
    Util u = new Util();
    // Enter three numbers
    Integer one = (int) u.getIntegerResponse("Enter 3 integers seperately");
    Integer two = (int) u.getIntegerResponse("Next integer");
    Integer three = (int) u.getIntegerResponse("Next integer");
    
    
    if ( one >  two) {
      int temp =  one;
       one =  two;
       two = temp;
    }

    if ( two > three) {
      int temp =  two;
       two = three;
      three = temp;
    }

    if ( one >  two) {
      int temp =  one;
       one =  two;
       two = temp;
    }

    //The sorted numbers are...
    
    u.p("The sorted numbers are", "" + one, "" + two, "" + three);
  }
}