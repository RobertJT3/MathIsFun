package com.mycompany.mathisfun;

import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Sumirah Hunter
 */
public class MathIsFun {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        StudentInfo information = new StudentInfo();
        Assignment assign = new Assignment();

        /**
         * This is the code for the parent. Parents can only view their own
         * students and their assignments, and can also add another child.
         */
        while (true) {
            String parent;
            while (true) {
                System.out.println("\nAre you a Parent? (yes/no)");
                parent = in.nextLine();
                if (parent.equalsIgnoreCase("yes") || parent.equalsIgnoreCase("no")) {
                    break;
                }

                System.out.println("Please enter yes or no");
            }

            if (parent.equals("yes")) {
                String backChoice = "";
                System.out.println("What's your username? ");
                String usernames = in.nextLine();
                System.out.println("Enter your first name: ");
                String name = in.nextLine();

                System.out.println("Enter your last name: ");
                String lastName = in.nextLine();

                System.out.println("Enter your email: ");
                String emailAd = in.nextLine();

                Parent parents = new Parent(usernames, name, lastName, emailAd);

                System.out.println("Your username is: " + parents.getUsername());
                do {

                    System.out.println("\n1. View your child");
                    System.out.println("2. View Assignments");
                    System.out.println("3. Add your child");

                    System.out.println("---------------------------------");
                    int decision = Integer.parseInt(in.nextLine());
                    System.out.println("---------------------------------");

                    switch (decision) {
                        case 1 -> {
                            System.out.println("Enter your child's username: ");
                            String username = in.nextLine();
                            System.out.println("Enter your child's first name: ");
                            String names = in.nextLine();
                            System.out.println("Enter your child's last name: ");
                            String lastNames = in.nextLine();
                            System.out.println("Enter your child's email:");
                            String emailAds = in.nextLine();

                            Student found = null;
                            for (Student s : information.getStudents()) {
                                if (s.getUsername().equals(username) && s.getName().equals(names) && s.getLastNames().equals(lastNames) && s.getEmails().equals(emailAds)) {
                                    found = s;
                                    break;
                                }
                            }
                            if (found == null) {
                                System.out.println("\nIncorrect username, name, last name, or email");
                                continue;
                            }

                            System.out.println("Student username" + found.getUsername() + "\nStudent name: " + found.getName() + " " + "| Student last name: " + found.getLastNames() + " | Student email: " + found.getEmails() + " | Grade: " + found.getGrades());
                            System.out.println("\nYour child's assignments:");
                            found.viewAssignments();
                        }

                        case 2 -> {
                            assign.viewAssignments();
                            System.out.println("\nAmount of Assigments: " + assign.getAllAssignments().size());
                        }
                        case 3 -> {
                            String choice;
                            do {

                                System.out.println("Enter student username:");
                                String username = in.nextLine();
                                System.out.println("Enter student first name:");
                                String names = in.nextLine();
                                System.out.println("Enter student last name:");
                                String lastNames = in.nextLine();
                                System.out.println("Enter student email:");
                                String emailAds = in.nextLine();
                                System.out.println("Enter grade:");
                                String grades = in.nextLine();
                                information.addStudent(username, names, lastNames, emailAds, grades);
                                System.out.println("\nChild added.");
                                System.out.println("\nAdd another child?");
                                choice = in.nextLine();

                            } while (choice.equalsIgnoreCase("yes"));
                        }
                        default -> {
                        }
                    }

                    System.out.println("\n\nBack to menu? (yes/no)");
                    backChoice = in.nextLine();

                    if (backChoice.equals("back")) {
                        System.out.println("\nReturning to questions...\n");

                    }

                } while (backChoice.equalsIgnoreCase("yes"));

            }

            /**
             * This is the code for the teacher. When the teacher creates a new
             * student, that student is **only** added to the teacher who added
             * them. However, the teacher can still assign assignments to all
             * students, get a students username, or view all students.
             */
            String teacher;

            while (true) {
                System.out.println("\nAre you a Teacher? (yes/no)");
                teacher = in.nextLine();
                if (teacher.equalsIgnoreCase("yes") || teacher.equalsIgnoreCase("no")) {
                    break;
                }
                System.out.println("Please enter yes or no");

            }

            if (teacher.equals("yes")) {
                String backChoice = "";
                System.out.println("What's your username? ");
                String usernames = in.nextLine();
                System.out.println("Enter your first name: ");
                String name = in.nextLine();

                System.out.println("Enter your last name: ");
                String lastName = in.nextLine();

                System.out.println("Enter your email: ");
                String emailAd = in.nextLine();

                Teacher currentTeachers = new Teacher(usernames, name, lastName, emailAd);

                System.out.println("Your username is: " + currentTeachers.getUsername());
                do {
                    System.out.print("\n1. Add Student");
                    System.out.print("\n2. Add Assignment");
                    System.out.println("\n3. View Students");
                    System.out.println("4. View Assignments");
                    System.out.println("\n5. Look for specific student?");

                    System.out.println("---------------------------------");
                    int decision = Integer.parseInt(in.nextLine());
                    System.out.println("---------------------------------");

                    switch (decision) {
                        case 1 -> {
                            String choice;
                            do {
                                System.out.println("Enter student username:");
                                String username = in.nextLine();
                                System.out.println("Enter student first name:");
                                String names = in.nextLine();

                                System.out.println("Enter student last name:");
                                String lastNames = in.nextLine();

                                System.out.println("Enter student email:");
                                String emailAds = in.nextLine();

                                System.out.println("Enter grade:");
                                String grades = in.nextLine();

                                information.addStudent(username, names, lastNames, emailAds, grades);

                                Student s = information.findStudentByUsername(username);
                                s.setTeacher(currentTeachers);
                                currentTeachers.addStudent(s);

                                System.out.println("\nStudent added to class.");

                                System.out.println("\nAdd another student?");
                                choice = in.nextLine();

                            } while (choice.equalsIgnoreCase("yes"));
                        }
                        case 2 -> {
                            System.out.print("\nEnter title of assignment: ");
                            String title = in.nextLine();
                            System.out.print("\nEnter description of assignment: ");
                            String description = in.nextLine();
                            Assignment a = new Assignment(title, description);
                            assign.addAssignments(title, description);
                            System.out.println("\nGive assignment(s) to a specific student? ");
                            String choice = in.nextLine();
                            if (choice.equalsIgnoreCase("yes")) {
                                information.viewStudents();
                                System.out.println("Choose student number: ");
                                int num = Integer.parseInt(in.nextLine());

                                Student chosen = information.getStudents().get(num);
                                chosen.addAssignment(a);
                            }
                        }
                        case 3 -> {
                            System.out.println();
                            information.viewStudents();
                            System.out.println("Amount of students: " + information.getStudents().size());
                            currentTeachers.getStudents().sort(Comparator.comparing(Student::getName));
                            System.out.println("\nYour students sorted: ");
                            for (Student s : currentTeachers.getStudents()) {
                                System.out.println(s.getName() + " " + s.getLastNames());
                            }
                        }
                        case 4 -> {
                            assign.viewAssignments();
                            System.out.println("\nAmount of Assigments: " + assign.getAllAssignments().size());
                        }
                        case 5 -> {
                            System.out.println("Enter students username: ");
                            String username = in.nextLine();
                            Student found = null;
                            for (Student s : information.getStudents()) {
                                if (s.getUsername().equals(username)) {
                                    found = s;
                                    break;
                                }
                            }
                            if (found == null) {
                                System.out.println("\nStudent not found");
                                continue;
                            }
                            System.out.println("\n| Student username: " + found.getUsername() + "|" + " Student name: " + found.getName() + " " + "| Student last name: "
                                    + found.getLastNames() + " | Student email: " + found.getEmails() + " | Grade: " + found.getGrades());
                        }
                        default -> {
                        }
                    }

                    System.out.println("\n\nBack to menu? (yes/no)");
                    backChoice = in.nextLine();

                    if (backChoice.equalsIgnoreCase("no")) {
                        System.out.println("\nReturning to questions...\n");

                    }

                } while (backChoice.equalsIgnoreCase("yes"));

            }

            //This is the code for the students. If the user answers no to this, then it repeats initial questions.
            String student;
            while (true) {
                System.out.println("Student? (yes/no)");
                student = in.nextLine();

                if (student.equalsIgnoreCase("yes") || student.equalsIgnoreCase("no")) {
                    break;
                }
                System.out.println("Please enter yes or no");

            }

            if (student.equalsIgnoreCase("no")) {
                continue;
            }

            //This is the code for the new students. 
            System.out.println("Are you a new Student? (yes/no)");
            String newStudent = in.nextLine();
            if (newStudent.equalsIgnoreCase("yes")) {
                System.out.println("Enter your username: ");
                in.nextLine();

                System.out.println("\nEnter your first name: ");
                String names = in.nextLine();

                System.out.println("\nEnter your last name: ");
                String lastName = in.nextLine();

                System.out.println("\nEnter your email:");
                String emailAd = in.nextLine();

                System.out.println("Enter your grade (Note: make sure to add 'th' after the number):");
                String grades = in.nextLine();
                String username = "";

                information.addStudent(username, names, lastName, emailAd, grades);

            }

            //Code for returning student if the user answers no to new student
            if (newStudent.equalsIgnoreCase("no")) {
                System.out.println("Are you a returning Student? (yes/no)");
                String returning = in.nextLine();
                if (returning.equalsIgnoreCase("no")) {
                    continue;
                }

                System.out.println("What's your username? ");
                String username = in.nextLine();
                System.out.println("Enter your first name:");
                String names = in.nextLine();

                System.out.println("Enter your last name:");
                String lastName = in.nextLine();

                System.out.println("Enter your email:");
                String emailAd = in.nextLine();

                Student found = null;

                for (Student s : information.getStudents()) {
                    String usernames = null;

                    if (s.getUsername().equals(usernames) && s.getName().equals(names) && s.getLastNames().equals(lastName) && s.getEmails().equals(emailAd)) {
                        found = s;
                        break;
                    }
                }

                if (found == null) {
                    System.out.println("\nIncorrect username, name, last name, or email");
                    continue;
                }

                System.out.println("\n| Hello, " + found.getName() + " " + found.getLastNames() + "! |");
                System.out.println("\nYour assignments:");
                found.viewAssignments();
            }

        }

    }

}
