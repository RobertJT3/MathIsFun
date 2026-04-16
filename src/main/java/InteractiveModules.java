
import java.util.Scanner;

/**
 *
 * @author treyt
 */



public class InteractiveModules {
    private Scanner input = new Scanner(System.in);
    
   //instance variables
    private int playerHealth = 5;
    private int bossHealth = 10;
    private int totalCorrect = 0;
    private int totalIncorrect = 0;
    private int correctStreak = 0;
    private int currentDifficulty = 1;
    
    
    public void playGame() {
         int userGuess;
        
        while (playerHealth > 0 && totalCorrect < 10) {
           MathProblem TheQuestion = new MathProblem(currentDifficulty);
           System.out.println("--------------------------------");
           System.out.println("Progress: [Room " + (totalCorrect + 1) + " of 10]");
           System.out.println("Player Health: " + playerHealth);
           System.out.println("--------------------------------");
           System.out.println("Question: " + TheQuestion.getQuestionText());
           System.out.print("Enter your answer: ");
           
           //Input Validation
           while (!input.hasNextInt()) {
               System.out.println("Adventurer, only whole numbers will defeat the monsters!");
               input.next(); // Clears input buffer
               System.out.print("Enter your answer: ");
           }
           userGuess = input.nextInt();
           
           //If statement for increasing the games dfficulty on concecutive correct answers
           if (TheQuestion.getAnswer() == userGuess) {
               totalCorrect++;
               correctStreak++;
               if (correctStreak == 3) {
                   if (currentDifficulty < 3) {
                        currentDifficulty++;
                   }
                        correctStreak = 0;
               }
               System.out.println("Correct! Proceed to the next room.");
               // Else section to lower the difficulty on incorrect answers.
            } else {
               playerHealth--;
               totalIncorrect++;
               correctStreak = 0;
               //If to prevent lowering the difficulty level below 1
               if (currentDifficulty > 1){
               currentDifficulty--;
               }
               System.out.println("Incorrect. Difficulty modified, ready yourself!");
           }
        
        }
        System.out.println("===================================================");
        if (playerHealth > 0) {
            System.out.println("VICTORY! You cleared the mathmagical dungeon!");
        } else {
            System.out.println("DEFEAT... Try again to sharpen your witt!");
        }
        System.out.println("Final Stats - Correct: " + totalCorrect + " | Incorrect: " + totalIncorrect);
    }
    
    //Getter for total correct answers during game or quiz
    public int getTotalCorrect() {
        return this.totalCorrect;
    }
    
    //Getter for total incorrect answers during game or quiz
    public int getTotalIncorrect() {
        return this.totalIncorrect;
    }
}
