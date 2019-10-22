public class RandomCharacter_04_16 {
  public static void main(String[] args) {
    Util u = new Util();
    char ch = (char)(u.generateRandom(91,65));
    u.p("A random uppercase letter is " + ch);
}