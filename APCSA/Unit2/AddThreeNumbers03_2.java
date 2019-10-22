public class AddThreeNumbers03_2 {       

      public static void main(String[] strings)
      {
               Util u = new Util();
              int response = u.getIntegerResponse("Add the numbers 6 , 5, 2 :");
              if(response == 13)
              {
              
                  u.p(response +  " Is correct!");
              
              } else
              {
              
                  u.p(response + " is not correct!");
                  System.exit(1);
              
              
              }
       }
}