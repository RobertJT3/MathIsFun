import java.util.ArrayList;

public class StudentReport {

    private String name;
    private String lastName;
    private ArrayList<Integer> gameScores;
    private ArrayList<Integer> quizScores;

    private static int totalGamePoints = 0;
    private static int totalQuizPoints = 0;
    private static int totalGameCount = 0;
    private static int totalQuizCount = 0;

    public StudentReport(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
        gameScores = new ArrayList<Integer>();
        quizScores = new ArrayList<Integer>();
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public void addGameScore(int score) {
        gameScores.add(score);
        totalGamePoints += score;
        totalGameCount++;
    }

    public void addQuizScore(int score) {
        quizScores.add(score);
        totalQuizPoints += score;
        totalQuizCount++;
    }

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

    public int getFinalAverage() {
        return (getGameAverage() + getQuizAverage()) / 2;
    }

    public void display() {
        System.out.println("Student Name: " + name + " " + lastName);
        System.out.println("Game Avg: " + getGameAverage());
        System.out.println("Quiz Avg: " + getQuizAverage());
        System.out.println("Final Avg: " + getFinalAverage());
    }

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