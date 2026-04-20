import java.util.ArrayList;

/**
 * Creates a teacher with a name, last name, and email address
 * @author Sumirah Hunter
 */
public class Teacher {

    private String username;
    private String name;
    private String lastName;
    private String emailAd;
    private ArrayList<Student> students = new ArrayList<>();

    /**
     * default constructor
     */
    public Teacher() {

    }

    /**
     * Constructs a teacher with initial values
     *
     * @param username username of the teacher
     * @param name the teachers name
     * @param lastName the teachers last name
     * @param emailAd the teachers email address
     */
    public Teacher(String username, String name, String lastName, String emailAd) {
        this.username = username;
        this.name = name;
        this.lastName = lastName;
        this.emailAd = emailAd;

    }

    /**
     * Adds student to students list
     *
     * @param s the student that's going to be added
     */
    public void addStudent(Student s) {
        students.add(s);
    }

    /**
     * gets the list of students
     *
     * @return returns the students
     */
    public ArrayList<Student> getStudents() {
        return students;
    }

    /**
     * gets username
     *
     * @return returns username
     */
    public String getUsername() {
        return username;
    }

    /**
     * gets the name
     *
     * @return returns the name
     */
    public String getName() {
        return name;
    }

    /**
     * gets last name
     *
     * @return returns the last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * gets the email
     *
     * @return returns the email
     */
    public String getEmail() {
        return emailAd;
    }

}