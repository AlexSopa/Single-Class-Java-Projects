import java.util.*;  
  
  public class ScissorRockPaper_03_17 {
  public static void main(String[] args) {
    Util u = new Util();
    // Generate scissor, rock, paper
    int computerNumber = u.generateRandom(2,0);

    // Prompt the user to enter scissor, rock, or paper
    int userNumber = u.getIntegerResponse("scissor (0), rock (1), paper (2): ");

    // Check the guess. See page 92 for more information on the switch statements.
    switch (computerNumber) {
      case 0:
        if (userNumber == 0)
          System.out.print("The computer is scissor. You are scissor too. It is a draw");
        else if (userNumber == 1)
          System.out.print("The computer is scissor. You are rock. You won");
        else if (userNumber == 2)
          System.out.print("The computer is scissor. You are paper. You lost");
        break;
      case 1:
        if (userNumber == 0)
          System.out.print("The computer is rock. You are scissor. You lost");
        else if (userNumber == 1)
          System.out.print("The computer is rock. You are rock too. It is a draw");
        else if (userNumber == 2)
          System.out.print("The computer is rock. You are paper. You won");
        break;
      case 2:
        if (userNumber == 0)
          System.out.print("The computer is paper. You are scissor. You won");
        else if (userNumber == 1)
          System.out.print("The computer is paper. You are rock. You lost");
        else if (userNumber == 2)
          System.out.print("The computer is paper. You are paper too. It is a draw");
        break;
      }
  }
}