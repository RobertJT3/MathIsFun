package com.mycompany.mathisfun;

import java.util.ArrayList;

/**
 * Creates a student with a name, last name, username, email address, grades,
 * and assignments
 *
 * @author Sumirah Hunter
 */
public class Student {

    private String username;
    private String name;
    private String lastName;
    private String emailAd;
    private String grade;
    private Teacher teacher;
    private ArrayList<Assignment> assignments = new ArrayList<>();

    /**
     * default constructor
     */
    public Student() {

    }

    /**
     * constructs a student with initial values
     *
     * @param username of the student
     * @param name the students name
     * @param lastName the students last name
     * @param emailAd the students email address
     * @param grade the students grade level
     */
    public Student(String username, String name, String lastName, String emailAd, String grade) {
        this.username = username;
        this.name = name;
        this.lastName = lastName;
        this.emailAd = emailAd;
        this.grade = grade;

    }

    /**
     * Adds new assignment to the list of assignments
     *
     * @param a the assignment that's going to be added
     */
    public void addAssignment(Assignment a) {
        assignments.add(a);
    }

    /**
     * Gets the list of assignments
     *
     * @return returns assignments
     */
    public ArrayList<Assignment> getAssignments() {
        return assignments;
    }

    /**
     * Prints every assignment in assignments, allows for the assignments to be
     * viewed and if it's empty it prints out that there are no assignments for
     * that student
     */
    public void viewAssignments() {
        if (assignments.isEmpty()) {
            System.out.println("There are no assignments for " + getName());
            return;
        }
        System.out.println("Your assignments: ");
        for (Assignment a : assignments) {
            System.out.println(a);
        }
    }

    /**
     * String representation of the student object
     *
     * @return returns the name, last name, email, and grade formatted
     */
    @Override
    public String toString() {
        return "Student username: " + username + "\nStudent name: " + name + " " + "| Student last name: " + lastName + " | Student email: " + emailAd + " | Grade: " + grade;
    }

    /**
     * sets the teacher
     *
     * @param teacher the teacher
     */
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    /**
     * gets the teacher
     *
     * @return returns the teacher
     */
    public Teacher getTeacher() {
        return teacher;
    }

    /**
     * gets the username
     *
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * gets the name
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * gets the last name
     *
     * @return the last name
     */
    public String getLastNames() {
        return lastName;
    }

    /**
     * gets the email
     *
     * @return the email
     */
    public String getEmails() {
        return emailAd;
    }

    /**
     * gets the grade level
     *
     * @return the grade level
     */
    public String getGrades() {
        return grade;
    }

}
