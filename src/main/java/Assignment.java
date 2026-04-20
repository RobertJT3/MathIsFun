import java.util.ArrayList;

/**
 * Creates a list of all the assignments
 * @author Sumirah Hunter
 */
public class Assignment {

    private final ArrayList<Assignment> allAssignments = new ArrayList<>();

    private String title;
    private String description;

    /**
     * Default Constructor
     */
    public Assignment() {

    }

    /**
     * Constructs an Assignment with values such as title and description
     *
     * @param title the title of the Assignment(s)
     * @param description the description of the Assignment(s)
     */
    public Assignment(String title, String description) {
        this.title = title;
        this.description = description;
    }

    /**
     * Creates a new assignment, adds it to the array, and prints it
     *
     * @param title the title of the assignment
     * @param description the description of the assignment
     */
    public void addAssignments(String title, String description) {
        Assignment a = new Assignment(title, description);
        allAssignments.add(a);
        System.out.print(a);
    }

    /**
     * Prints every assignment in allAssignments, allows for the assignments to
     * be viewed
     */
    public void viewAssignments() {
        for (Assignment a : allAssignments) {
            System.out.println(a);
        }
    }

    /**
     * Gets the list of all the assignments
     *
     * @return returns all assignments
     */
    public ArrayList<Assignment> getAllAssignments() {
        return allAssignments;
    }

    /**
     * String representation of the assignment object
     *
     * @return returns the title and description formatted
     */
    @Override
    public String toString() {
        return title + "\n • " + description;
    }
}