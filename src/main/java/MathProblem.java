/**
 *
 * @author treyt
 */


public class MathProblem {
    
    //Instance variables
    private int num1;
    private int num2;
    private int answer;
    private char op;
    
    

    // The Constructor: It just takes the level and calls a setup method
    public MathProblem(int level) {
        generateNumbers(level);
    }

    //Number generation for level 1, 2, 3 (Easy, Medium, Hard)
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
                //prevents divison by zero and questions that would generate fraction answer
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
    //Getter for the answer
    public int getAnswer() {
        return this.answer;
    }
    //Getter for the question
    public String getQuestionText() {
        return num1 + " " + op + " " + num2 + " = ?";
    }
}
