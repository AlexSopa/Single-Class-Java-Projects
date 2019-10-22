public class Print_A_Table_02_18
{

   public static void main(String[] args)
   {

   String format = "|%1$-10s|%2$-10s|%3$-20s|\n";
   System.out.format(format, "a", "b", "pow(a,b)");
   System.out.format(format, "1", "2", "1");
   System.out.format(format, "2", "3", "8");
      System.out.format(format, "3", "4", "81");
         System.out.format(format, "4", "5", "1024");

   String ex[] = {"5", "6", "15625"};

   System.out.format(String.format(format, (Object[]) ex));
   
   }

}

