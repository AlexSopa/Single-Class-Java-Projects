public class Computing_Body_Mass_Index 
{

   public static void main(String[] args)
   {
   
         java.util.Scanner input = new java.util.Scanner(System.in); 
         System.out.println("Please input your weight in pounds.");
         double pounds = input.nextDouble();
         System.out.println("Please input your height in inches");
         double height = input.nextDouble();
         
         double kg = pounds * 0.45359237;
         double meters = height * 0.0254;
         
         double ans = kg / (meters * meters);
         
         System.out.println("BMI : " + ans);
      
   }

}