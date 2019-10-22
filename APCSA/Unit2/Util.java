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
         java.util.Random rand = java.util.concurrent.ThreadLocalRandom.current();
         return rand.ints(bottom,top).findFirst().getAsInt();
         
      
      
      } 


}
