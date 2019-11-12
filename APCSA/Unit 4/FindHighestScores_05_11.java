public class FindHighestScores_05_11 {
  public static void main(String[] args) {
    int count = 1;
    
    int i = 0;
    while (i <= 100) {
      if (i % 5 == 0 || i % 6 == 0) {
        System.out.print((count % 10 != 0) ? i + " " : i + "\n");
        count++;
      }
     
      i++;
    }
   }
}