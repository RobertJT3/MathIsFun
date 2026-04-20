import java.util.Scanner;

/**
 * The ParentDashboard class allows parents to view student grades
 * by searching for a student's last name.
 */
public class ParentDashboard {

    /**
     * Prompts the user to enter a last name and displays all matching students' grades.
     *
     * @param students An array of StudentReport objects
     */
    public static void showGradesByLastName(StudentReport[] students) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter student's last name: ");
        String lastName = input.nextLine();

        boolean found = false;

        for (int i = 0; i < students.length; i++) {
            if (students[i].getLastName().equalsIgnoreCase(lastName)) {
                students[i].display();
                found = true;
                System.out.println();
            }
        }

        if (!found) {
            System.out.println("No student found with that last name.");
        }
    }
}