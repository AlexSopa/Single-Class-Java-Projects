import java.util.Scanner;

class ConvertCelsiusToFahrenheit_02_01 {
  // Main method
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Enter a temperature in Celsius
   System.out.println("Please provide a temp in celsius");
    double celsius = input.nextDouble();

    // Convert it to Fahrenheit
    double fahrenheit = (9.0 / 5) * celsius + 32;

    // Display the result
    System.out.println(celsius + " Celsius is " +
      fahrenheit + " farenheit.");
  }
}