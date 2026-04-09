
/**
 *
 * @author Tanner Arnold
 */
public class MathIsFun {
public class TrackingReports {
private String studentName;
private int score;
private int exercisesCompleted;
private String teacherComments;
private String parent;

public TrackingReports(String studentName, int score, int exercisesCompleted, String teacherComments, String parent){
this.studentName = studentName;
this.score = score;
this.exercisesCompleted = exercisesCompleted;
this.teacherComments = teacherComments;
this.parent = parent;
}

public String getStudentName(){
return studentName;
}
public int getScore() {
return score;
}

public int getExercisesCompleted() {
return exercisesCompleted;
}

public String getTeacherComments() {
return teacherComments;
}
boolean isExercisesCompleted = true;
if(isExercisesCompleted){
System.out.println("All exercises are complete for: " + studentName);
}else{
System.out.println("The student still has: " + score);

}

}
}
