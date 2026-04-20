/**
 *GameLog class for creating log objects of the InteractiveModules math game to report the user's results
 * @author Trey Trey
 */
public class GameLogs {
    
    /**
     * Instance variable of the question asked during the game stored as a String
     */
    private String questionAsked;
    
    /**
     * Instance variable of the user's answer to the question stored as an Integer
     */
    private int userAnswer;
    
    /**
     * Instance variable of the correct answer to the generated question, to be used for reporting
     */
    private int correctAnswer;
    /**
     * Instance variable of the result (true/false) if the user guessed correctly.
     */
    private boolean result;
    
    /**
     * Overloaded constructor for creating a log of the math game's results.
     * @param questionAsked The question asked to the user during the game
     * @param userAnswer The user's answer to the question asked during the game
     * @param correctAnswer The correct answer to the question asked during the game
     * @param result The result of the user's input, reported in true/false. 
     */
    public GameLogs( String questionAsked, int userAnswer, int correctAnswer, boolean result) {
        this.questionAsked = questionAsked;
        this.userAnswer = userAnswer;
        this.correctAnswer = correctAnswer;
        this.result = result;
    }
    
    @Override
    /**
     * toString method for creating a log of questions asked, user answers, correct answer, and the result for the user
     */
    public String toString() {
        return "Question: " + questionAsked.replace("= ?", "") + "| User Answer: " + userAnswer + " | Correct Answer: " + correctAnswer + " | Result: " + result;
    }
}
