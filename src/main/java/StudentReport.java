import java.util.ArrayList;

/**
 * The StudentReport class stores and calculates a student's game and quiz scores.
 * It also keeps track of class-wide averages using static variables.
 */
public class StudentReport {

    private String name;
    private String lastName;
    private ArrayList<Integer> gameScores;
    private ArrayList<Integer> quizScores;

    private static int totalGamePoints = 0;
    private static int totalQuizPoints = 0;
    private static int totalGameCount = 0;
    private static int totalQuizCount = 0;

    /**
     * Constructor to create a StudentReport object.
     * 
     * @param name The student's first name
     * @param lastName The student's last name
     */
    public StudentReport(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
        gameScores = new ArrayList<Integer>();
        quizScores = new ArrayList<Integer>();
    }

    /**
     * Gets the student's first name.
     * 
     * @return The first name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the student's last name.
     * 
     * @return The last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Adds a game score and updates class totals.
     * 
     * @param score The game score to add
     */
    public void addGameScore(int score) {
        gameScores.add(score);
        totalGamePoints += score;
        totalGameCount++;
    }

    /**
     * Adds a quiz score and updates class totals.
     * 
     * @param score The quiz score to add
     */
    public void addQuizScore(int score) {
        quizScores.add(score);
        totalQuizPoints += score;
        totalQuizCount++;
    }

    /**
     * Calculates the student's average game score.
     * 
     * @return The game average (0 if no scores)
     */
    public int getGameAverage() {
        if (gameScores.size() == 0) {
            return 0;
        }

        int sum = 0;
        for (int i = 0; i < gameScores.size(); i++) {
            sum += gameScores.get(i);
        }

        return sum / gameScores.size();
    }

    /**
     * Calculates the student's average quiz score.
     * 
     * @return The quiz average (0 if no scores)
     */
    public int getQuizAverage() {
        if (quizScores.size() == 0) {
            return 0;
        }

        int sum = 0;
        for (int i = 0; i < quizScores.size(); i++) {
            sum += quizScores.get(i);
        }

        return sum / quizScores.size();
    }

    /**
     * Calculates the student's final average.
     * 
     * @return The final average based on game and quiz averages
     */
    public int getFinalAverage() {
        return (getGameAverage() + getQuizAverage()) / 2;
    }

    /**
     * Displays the student's report including averages.
     */
    public void display() {
        System.out.println("Student Name: " + name + " " + lastName);
        System.out.println("Game Avg: " + getGameAverage());
        System.out.println("Quiz Avg: " + getQuizAverage());
        System.out.println("Final Avg: " + getFinalAverage());
    }

    /**
     * Displays the class averages for games, quizzes, and final average.
     */
    public static void displayClassAverage() {
        System.out.println("\n--- Class Averages ---");

        int gameAvg;
        int quizAvg;
        int finalAvg;

        if (totalGameCount == 0) {
            gameAvg = 0;
        } else {
            gameAvg = totalGamePoints / totalGameCount;
        }

        if (totalQuizCount == 0) {
            quizAvg = 0;
        } else {
            quizAvg = totalQuizPoints / totalQuizCount;
        }

        finalAvg = (gameAvg + quizAvg) / 2;

        System.out.println("Game Avg: " + gameAvg);
        System.out.println("Quiz Avg: " + quizAvg);
        System.out.println("Final Avg: " + finalAvg);
    }
}