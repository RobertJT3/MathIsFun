/**
 *MathProblem class for generating math question objects for the InteractiveModules class
 * @author treyt
 */
public class MathProblem {
    
    /**
     * Instance variable to store the first number generated needed to assemble to math problem
     */
    private int num1;
    /**
     * Instance variable to store the second number generated needed to assemble to math problem
     */
    private int num2;
    /**
     * Instance variable to store the answer for the generated math problem
     */
    private int answer;
    /**
     * Instance variable to store the operator used in the generated math problem
     */
    private char op;
    
    
    /**
     * Default constructor for the MathProblem, constructs a math problem based on the level dictated by the game state in InteractiveModules
     * @param level Integer 1-3 for the level of question to be generated, default 1 and adjusts based on correct/incorrect answers. 
     */
    public MathProblem(int level) {
        generateNumbers(level);
    }

    /**
     * Number generation for math questions and operator selection for level 1, 2, 3 (Easy, Medium, Hard)
     * @param level Integer 1-3 for the level of question to be generated, default 1 and adjusts based on correct/incorrect answers.
     */
    public void generateNumbers(int level) {
        
        //Array for mathmatical operators and limiter variable
        char[] operator = {'+', '-', '*', '/'};
        int limit = level +1;
        int randomIndex = (int)(Math.random() * limit);
        this.op = operator[randomIndex];
        
        //if & else if for determining question difficulty
        if (level == 1) {
            // Easy: 1-10 operators: +, -
            num1 = (int)(Math.random() * 10) + 1;
            num2 = (int)(Math.random() * 10) + 1;
            this.op = operator[randomIndex];
            answer = num1 + num2;
        } 
        else if (level == 2) {
            // Medium: 10-20 operators: +, -, *
            num1 = (int)(Math.random() * 11) + 10;
            num2 = (int)(Math.random() * 11) + 10;
            this.op = operator[randomIndex];
            answer = num1 * num2;
        }
        else if(level == 3) {
        // Hard: 10-20 for +, -, *, and 10-20 with 2-10 for /
        this.op = operator[randomIndex];
        if (this.op == '/') {
            do {
                num1 = (int)(Math.random() * 11) + 10;
                num2 = (int)(Math.random() * 10) + 2;
                //prevents divison by zero and questions that would generate fraction answer. (Simplified to avoid confusing the user by asking questions with double type answers)
            } while (num1 % num2 != 0 || num1 == num2);
        } else {
            num1 = (int)(Math.random() * 11) + 10;
            num2 = (int)(Math.random() * 11) + 10;
        }
        
        }
        //Switch to apply the generated operator to the generated numbers
        switch (this.op) {
            case '+': this.answer = num1 + num2;
            break;
            case '-': this.answer = num1 - num2;
            break;
            case '*': this.answer = num1 * num2;
            break;
            case '/': this.answer = num1 / num2;
            break;
        }
    }
    /**
     * Getter for the answer
     * @return returns the answer of the currently generated question
     */
    public int getAnswer() {
        return this.answer;
    }
    /**
     * Getter for the question generated
     * @return returns full assembled math question as a string
     */
    public String getQuestionText() {
        return num1 + " " + op + " " + num2 + " = ?";
    }
}
