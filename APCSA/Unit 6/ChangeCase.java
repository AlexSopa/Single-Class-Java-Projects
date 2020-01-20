import java.util.*;

/*
Driver : Kristi
Nav : Alex


*/

public class ChangeCase
{
    // instance variables
    private String[] words = new String[50];  // array's physical size
    private int size = 0;                     // array's logical size
    private Scanner keyboard = new Scanner(System.in);

    /* Reads strings input from the keyboard and stores them in the array words.
     * Input continues until the user types "stop".
     * The logical size of the array is. incremented each time a new string
     *    is added to the array.
     */
    public void readWords()
    {
      String temporaryStore = "";
      while(size < 50)
      {
         temporaryStore = keyboard.nextLine(); //Gets string from user
         if(temporaryStore.equalsIgnoreCase("stop")) return; //We know it isn't "stop"
         
         words[size] = temporaryStore; //Saves it in list
         size++; //Increments list
         
         
      
      }
    
    }

    /* Prints each word in the array three times. Once in its original form,
     * once in all capital letters, and once in all lowercase letters.
     */
    public void printWords()
    {
      /*
      * Loop through all words & print them
      */
      
      for/*each*/(String/*word*/word :/*in*/words)
      {
         /*Original*/System.out.println(word);
         /*All Caps*/System.out.println(word.toUpperCase());
         /*All lower*/System.out.println(word.toLowerCase());
         
      
      }
      

    }

    public static void main(String[] args)
    {
        ChangeCase app = new ChangeCase();
        app.readWords();
        app.printWords();
    }
}