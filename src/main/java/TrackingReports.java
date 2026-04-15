

/**
 *
 * @author Tanner Arnold
 */
public class TrackingReports {
    private int score;
    private int exercisesCompleted;
    private int totalExercises;
    private String teacherComments;

    public TrackingReports(int score, int exercisesCompleted, int totalExercises, String teacherComments) {
        this.score = score;
        this.exercisesCompleted = exercisesCompleted;
        this.totalExercises = totalExercises;
        this.teacherComments = teacherComments;
    }

    public int getScore() {
        return score;
    }

    public int getExercisesCompleted() {
        return exercisesCompleted;
    }

    public int getTotalExercises() {
        return totalExercises;
    }

    public String getTeacherComments() {
        return teacherComments;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setExercisesCompleted(int exercisesCompleted) {
        this.exercisesCompleted = exercisesCompleted;
    }

    public void setTotalExercises(int totalExercises) {
        this.totalExercises = totalExercises;
    }

    public void setTeacherComments(String teacherComments) {
        this.teacherComments = teacherComments;
    }

    public double getProgressPercent() {
        return (double) exercisesCompleted / totalExercises * 100;
    }

    public String getFeedback() {
        if (score >= 90) {
            return "Excellent work! Keep it up.";
        } else if (score >= 75) {
            return "Good job. Keep practicing to improve.";
        } else {
            return "Needs more practice and support.";
        }
    }

    public void displayReport(String studentName) {
        System.out.println("Progress Report for: " + studentName);
        System.out.println("Score: " + score);
        System.out.println("Exercises Completed: " + exercisesCompleted + "/" + totalExercises);
        System.out.println("Progress: " + getProgressPercent() + "%");
        System.out.println("Teacher Comments: " + teacherComments);
        System.out.println("Feedback: " + getFeedback());
    }
}