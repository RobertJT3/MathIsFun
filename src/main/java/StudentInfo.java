package com.mycompany.mathisfun;

import java.util.ArrayList;

/**
 * Creates a list of all the students
 *
 * @author Sumirah Hunter
 */
public class StudentInfo {

    private ArrayList<Student> listOfStudents = new ArrayList<>();

    /**
     * Default constructor
     */
    public StudentInfo() {

    }

    /**
     * Creates a new student, adds it to the array, and prints it
     *
     * @param username username of the student
     * @param names the students names
     * @param lastNames the students last names
     * @param emailAd the students email address
     * @param grades the students grade level
     */
    public void addStudent(String username, String names, String lastNames, String emailAd, String grades) {
        Student s = new Student(username, names, lastNames, emailAd, grades);
        listOfStudents.add(s);
        System.out.println(s);

    }

    /**
     * Gets the list of all the students
     *
     * @return returns the list of students
     */
    public ArrayList<Student> getStudents() {
        return listOfStudents;
    }

    /**
     * Iterates through the list of students and displays their names, last
     * names, and assignments. If there are no assigned assignments, then it
     * prints "- None"
     */
    public void viewStudents() {
        for (int i = 0; i < listOfStudents.size(); i++) {
            Student s = listOfStudents.get(i);

            System.out.println("Student " + i + ": " + s.getName() + " " + s.getLastNames());
            System.out.println("Assignments");

            if (s.getAssignments().isEmpty()) {
                System.out.println("- None");
            } else {
                for (Assignment a : s.getAssignments()) {
                    System.out.println(" - " + a);
                }
            }
        }

        /**
         * String representation of each student object
         */
        for (Student s : listOfStudents) {
            System.out.println(s);
        }
    }

    /**
     * Searches for student based on username
     *
     * @param username the username to search for
     * @return returns s if its found and returns null if not
     */
    public Student findStudentByUsername(String username) {
        for (Student s : listOfStudents) {
            if (s.getUsername().equals(username)) {
                return s;
            }
        }
        return null;
    }

}
