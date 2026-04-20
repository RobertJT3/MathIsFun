
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author treyt
 */



public class InteractiveModules {
    private Scanner input = new Scanner(System.in);
    
   /**
    * Instance variable to track player health, ngl basically an extra totalIncorrect to control game loop and give gamified vibes.
    */
    private int playerHealth = 5;
    /**
     * Instance variable to track the total number of questions answered correctly as an integer
     */
    private int totalCorrect = 0;
    /**
     * Instance variable to track the total number of questions answered incorrectly as an integer
     */
    private int totalIncorrect = 0;
    /**
     * Instance variable to track consecutive correct answers, used to increment difficulty
     */
    private int correctStreak = 0;
    /**
     * Instance variable to determine the difficulty of questions generated for the game, default of 1 and max of 3
     */
    private int currentDifficulty = 1;
    /**
     * Instance variable for tracking the number of questions asked, used to stop the game loop
     */
    private int questionsAsked = 0;
    
    private ArrayList<GameLogs> questionLog = new ArrayList<>();
    
    /**
     * Method for playing a math question game. The game adjusts the difficulty of questions asked based on the amount of questions
     * answered correctly and incorrectly
     */
    public void playGame() {
         int userGuess;
        
        while (playerHealth > 0 && questionsAsked < 10) {
           MathProblem TheQuestion = new MathProblem(currentDifficulty);
           System.out.println("=======================================================");
           System.out.println("Progress: [Room " + (totalCorrect + 1) + " of 10]");
           System.out.println("Player Health: " + playerHealth);
           System.out.println("=======================================================");
           System.out.println("Question: " + TheQuestion.getQuestionText());
           System.out.print("Enter your answer: ");
           
           //Input Validation
           while (!input.hasNextInt()) {
               System.out.println("Adventurer, only whole numbers will defeat the monsters!");
               input.next(); // Clears input buffer
               System.out.print("Enter your answer: ");
           }
           userGuess = input.nextInt();
           boolean isCorrect;
           
           //If statement for increasing the games dfficulty on concecutive correct answers
           if (TheQuestion.getAnswer() == userGuess) {
               totalCorrect++;
               correctStreak++;
               isCorrect = true;
               System.out.println("=======================================================");
               System.out.println("                                     [ MONSTER ]");
               System.out.println("             /O/  ~~~* (BOOM!)     !! \\O/ ");
               System.out.println("              |                        |  ");
               System.out.println("             / \\                      / \\ ");
               System.out.println(" [ HERO ]");
               System.out.println("\n      CORRECT! Your logic strikes true!");
               System.out.println("=======================================================");
               if (correctStreak == 3) {
                   if (currentDifficulty < 3) {
                        currentDifficulty++;
                   }
                        correctStreak = 0;
               }
               System.out.println("Proceed to the next room.");
               // Else section to lower the difficulty on incorrect answers.
            } else {
               playerHealth--;
               totalIncorrect++;
               correctStreak = 0;
               isCorrect = false;
               System.out.println("=======================================================");
               System.out.println("                                     [ MONSTER ]");
               System.out.println("        !!  \\O/    *~~~ (OUCH!)       \\O\\ ");
               System.out.println("             |                         |  ");
               System.out.println("            / \\                       / \\ ");
               System.out.println(" [ HERO ]");
               System.out.println("\n      INCORRECT! The monster finds an opening!");
               System.out.println("=======================================================");
               
               //If to prevent lowering the difficulty level below 1
               if (currentDifficulty > 1){
               currentDifficulty--;
               }
               System.out.println("Difficulty modified, ready yourself!");
           }
           questionLog.add(new GameLogs(TheQuestion.getQuestionText(), userGuess,
                   TheQuestion.getAnswer(), isCorrect));
            questionsAsked++;
        }
        System.out.println("=======================================================");
        if (playerHealth > 0) {
            System.out.println(" __      _______ _____ _______ ______ _______     __ ");
            System.out.println(" \\ \\    / /_   _/ ____|__   __| __ \\ |  __ \\ \\   / / ");
            System.out.println("  \\ \\  / /  | || |       | |  | |  | | |__) \\ \\_/ /  ");
            System.out.println("   \\ \\/ /   | || |       | |  | |  | |  _  / \\   /   ");
            System.out.println("    \\  /   _| || |____   | |  | |__| | | \\ \\  | |    ");
            System.out.println("     \\/   |_____\\_____|  |_|  |_____/|_|  \\_\\ |_|    ");
            System.out.println("\n       YOU CLEARED THE MATHMAGICAL DUNGEON!  ");
            System.out.println("=======================================================");
        } else {
            System.out.println("=======================================================");
            System.out.println(" __     ______  _    _   _____ _____ ______ _____  ");
            System.out.println(" \\ \\   / / __ \\| |  | | |  __ \\_   _|  ____|  __ \\ ");
            System.out.println("  \\ \\_/ / |  | | |  | | | |  | || | | |__  | |  | |");
            System.out.println("   \\   /| |  | | |  | | | |  | || | |  __| | |  | |");
            System.out.println("    | | | |__| | |__| | | |__| || |_| |____| |__| |");
            System.out.println("    |_|  \\____/ \\____/  |_____/_____|______|_____/ ");
            System.out.println("\n      DEFEAT... TRY AGAIN TO SHARPEN YOUR WIT!     ");
            System.out.println("=======================================================");
        }
        System.out.println("Final Stats - Correct: " + totalCorrect + " | Incorrect: " + totalIncorrect);
    }
    
    /**
     * Getter for total correct answers during game or quiz
     * @return Returns amount of questions answered correctly
     */
    public int getTotalCorrect() {
        return this.totalCorrect;
    }
    
    /**
     * Getter for total incorrect answers during game or quiz
     * @return Returns amount of questions answered incorrectly
     */
    public int getTotalIncorrect() {
        return this.totalIncorrect;
    }
    /**
     * Getter for ArrayList of generated math questions
     * @return Returns a log of the math questions generated during the game or quiz
     */
    public ArrayList<GameLogs> getQuestionLog() {
        return this.questionLog;
    }
}
