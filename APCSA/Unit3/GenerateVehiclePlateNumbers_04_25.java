public class GenerateVehiclePlateNumbers_04_25 {
  public static void main(String[] argds) {
  /* Create variables that will assign a 3 letter and a 3 number using the Math.random method. The letters should be assigned 
  from A to Z. The numbers should be from 0 to 1o.*/
   
      Util u = new Util(); //Initializing Utility Class
      char ch1,ch2,ch3,ch4,ch5,ch6,ch7; //Creating variables
      ch1 = (char)(u.generateRandom(91,65));  //91-65 All uppercase letters
      ch2 = (char)(u.generateRandom(91,65));
      ch3 = (char)(u.generateRandom(91,65));
      ch4 = '-';  //It says 3 of each ind directions...?
      ch5 = (char)(u.generateRandom(57,48)); //48-57 is 0-10
      ch6 = (char)(u.generateRandom(57,48));
      ch7 = (char)(u.generateRandom(57,48));
    
    System.out.println("A random vehicle plate number: "
      + ch1 + ch2 + ch3 + ch4 + ch5 + ch6 + ch7);
      
    /*  for(int i = 0; i < 100;i++)
      {
      
         u.p(((char)i) + ":" + i);
      
      }*/
  }
}