/**
 *Tracking Reports class for creating log objects to track student scores, completed exercises, assigned exercises, and teacher comments
 * @author Tanner Arnold
 */
public class TrackingReports {
    /**
     * Instance variable for the students score stored as an Integer
     */
    private int score;
    /**
     * Instance variable for the exercises completed by the student stored as an Integer
     */
    private int exercisesCompleted;
    /**
     * Instance variable for the exercises assigned to the student stored as an Integer
     */
    private int totalExercises;
    /**
     * Instance variable for teacher's comments stored as a String
     */
    private String teacherComments;

    /**
     * Overloaded constructor for creating TrackingReport objects
     * @param score Student's score stored as an Integer
     * @param exercisesCompleted Exercises completed by the student stored as an Integer
     * @param totalExercises Number of exercises assigned to the student stored as an Integer
     * @param teacherComments Teacher's comments for the student stored as a String
     */
    public TrackingReports(int score, int exercisesCompleted, int totalExercises, String teacherComments) {
        this.score = score;
        this.exercisesCompleted = exercisesCompleted;
        this.totalExercises = totalExercises;
        this.teacherComments = teacherComments;
    }
    
    /**
     * Getter for the score
     * @return returns students score
     */
    public int getScore() {
        return score;
    }
    /**
     * Getter for completed exercises
     * @return returns number of completed exercises
     */
    public int getExercisesCompleted() {
        return exercisesCompleted;
    }
    /**
     * Getter for total exercises assigned to the student
     * @return returns total assigned exercises
     */
    public int getTotalExercises() {
        return totalExercises;
    }
    /**
     * Getter for the teacher's comments
     * @return returns the teachers comments
     */
    public String getTeacherComments() {
        return teacherComments;
    }
    /**
     * Setter for the students score
     * @param score sets score as Integer
     */
    public void setScore(int score) {
        this.score = score;
    }
    /**
     * Setter for completed exercises
     * @param exercisesCompleted sets the number of exercises completed as an Integer
     */
    public void setExercisesCompleted(int exercisesCompleted) {
        this.exercisesCompleted = exercisesCompleted;
    }
    /**
     * Setter for total assigned exercises
     * @param totalExercises sets number of assigned exercises as an Integer
     */
    public void setTotalExercises(int totalExercises) {
        this.totalExercises = totalExercises;
    }
    /**
     * Setter for Teacher's comments to the student(s)
     * @param teacherComments sets Teacher's comments as a String
     */
    public void setTeacherComments(String teacherComments) {
        this.teacherComments = teacherComments;
    }
    /**
     * Getter for the percent of completed exercises
     * @return returns the percent of exercises completed as a double
     */
    public double getProgressPercent() {
        return (double) exercisesCompleted / totalExercises * 100;
    }
    /**
     * Getter for Feedback from the teacher
     * @return returns  grade based feedback from the teacher as a String
     */
    public String getFeedback() {
        if (score >= 90) {
            return "Excellent work! Keep it up.";
        } else if (score >= 75) {
            return "Good job. Keep practicing to improve.";
        } else {
            return "Needs more practice and support.";
        }
    }
    /**
     * Method for displaying a student's detailed report
     * @param studentName Uses student name to match the detailed report
     */
    public void displayReport(String studentName) {
        System.out.println("Progress Report for: " + studentName);
        System.out.println("Score: " + score);
        System.out.println("Exercises Completed: " + exercisesCompleted + "/" + totalExercises);
        System.out.println("Progress: " + getProgressPercent() + "%");
        System.out.println("Teacher Comments: " + teacherComments);
        System.out.println("Feedback: " + getFeedback());
    }
}