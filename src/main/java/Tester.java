public class Tester {
    public static void main(String[] args) {

        StudentReport s1 = new StudentReport("Leo", "Smith");
        StudentReport s2 = new StudentReport("Jake", "Smith");
        StudentReport s3 = new StudentReport("Anna", "Brown");

        s1.addGameScore(90);
        s1.addGameScore(80);
        s1.addQuizScore(70);
        s1.addQuizScore(85);

        s2.addGameScore(100);
        s2.addQuizScore(90);

        s3.addGameScore(75);
        s3.addQuizScore(95);

        s1.display();
        s2.display();
        s3.display();

        StudentReport.displayClassAverage();

        StudentReport[] students = {s1, s2, s3};

        ParentDashboard.showGradesByLastName(students);
    }
}