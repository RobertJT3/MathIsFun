package com.mycompany.mathisfun;

import java.util.Scanner;

/**
 *
 * @author Sumirah Hunter
 */
public class MathIsFun {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        StudentInfo information = new StudentInfo();
        Assignments assign = new Assignments();

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
                do {

                    System.out.println("\n1. View your child");
                    System.out.println("2. View Assignments");

                    System.out.println("---------------------------------");
                    int decision = Integer.parseInt(in.nextLine());
                    System.out.println("---------------------------------");

                    if (decision == 1) {

                        System.out.println("Enter your child's first name:");
                        String names = in.nextLine();

                        System.out.println("Enter your child's last name:");
                        String lastName = in.nextLine();

                        System.out.println("Enter your child's email:");
                        String emailAd = in.nextLine();

                        Students found = null;

                        for (Students s : information.getStudents()) {
                            if (s.getName().equals(names) && s.getLastNames().equals(lastName) && s.getEmails().equals(emailAd)) {
                                found = s;
                                break;
                            }
                        }
                        if (found == null) {
                            System.out.println("\nIncorrect name, last name, or email");
                            continue;
                        }

                        System.out.println("\nStudent name: " + names + " " + "| Student last name: " + lastName + " | Student email: " + emailAd + " | Grade: " + found.getGrades());
                        System.out.println("\nYour child's assignments:");
                        found.viewAssignments();

                    } else if (decision == 2) {
                        assign.viewAssignments();
                        System.out.println("\nAmount of Assigments: " + assign.getAllAssignments().size());
                    }

                    System.out.println("\n\nBack to menu? (yes/no)");
                    backChoice = in.nextLine();

                    if (backChoice.equals("back")) {
                        System.out.println("\nReturning to questions...\n");

                    }

                } while (backChoice.equalsIgnoreCase("yes"));

            }

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
                String backChoice;
                do {
                    System.out.print("\n1. Add Student");
                    System.out.print("\n2. Add Assignment");
                    System.out.println("\n3. View Students");
                    System.out.println("4. View Assignments");

                    System.out.println("---------------------------------");
                    int decision = Integer.parseInt(in.nextLine());
                    System.out.println("---------------------------------");

                    switch (decision) {
                        case 1 -> {
                            String choice;
                            do {
                                System.out.println("Enter student first name:");
                                String names = in.nextLine();

                                System.out.println("Enter student last name:");
                                String lastName = in.nextLine();

                                System.out.println("Enter student email:");
                                String emailAd = in.nextLine();

                                System.out.println("Enter grade:");
                                String grades = in.nextLine();

                                information.addStudent(names, lastName, emailAd, grades);

                                System.out.println("\nStudent added.");

                                System.out.println("\nAdd another student?");
                                choice = in.nextLine();

                            } while (choice.equalsIgnoreCase("yes"));
                        }
                        case 2 -> {
                            System.out.print("\nEnter title of assignment: ");
                            String title = in.nextLine();
                            System.out.print("\nEnter description of assignment: ");
                            String description = in.nextLine();
                            Assignments a = new Assignments(title, description);
                            assign.addAssignments(title, description);
                            System.out.println("\nGive assignment(s) to a specific student? ");
                            String choice = in.nextLine();
                            if (choice.equalsIgnoreCase("yes")) {
                                information.viewStudents();
                                System.out.println("Choose student number: ");
                                int num = Integer.parseInt(in.nextLine());

                                Students chosen = information.getStudents().get(num);
                                chosen.addAssignment(a);
                            }
                        }
                        case 3 -> {
                            System.out.println();
                            information.viewStudents();
                            System.out.println("Amount of students: " + information.getStudents().size());
                        }
                        case 4 -> {
                            assign.viewAssignments();
                            System.out.println("\nAmount of Assigments: " + assign.getAllAssignments().size());
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

            System.out.println("Are you a new Student? (yes/no)");
            String newStudent = in.nextLine();
            if (newStudent.equalsIgnoreCase("yes")) {

                System.out.println("\nEnter your first name:");
                String names = in.nextLine();

                System.out.println("\nEnter your last name:");
                String lastName = in.nextLine();

                System.out.println("\nEnter your email:");
                String emailAd = in.nextLine();

                System.out.println("Enter your grade (Note: make sure to add 'th' after the number:");
                String grades = in.nextLine();

                information.addStudent(names, lastName, emailAd, grades);

            }

            if (newStudent.equalsIgnoreCase("no")) {
                System.out.println("Are you a returning Student? (yes/no)");
                String returning = in.nextLine();
                if (returning.equalsIgnoreCase("no")) {
                    continue;
                }
                System.out.println("Enter your first name:");
                String names = in.nextLine();

                System.out.println("Enter your last name:");
                String lastName = in.nextLine();

                System.out.println("Enter your email:");
                String emailAd = in.nextLine();

                Students found = null;

                for (Students s : information.getStudents()) {
                    if (s.getName().equals(names) && s.getLastNames().equals(lastName) && s.getEmails().equals(emailAd)) {
                        found = s;
                        break;
                    }
                }

                if (found == null) {
                    System.out.println("\nIncorrect name, last name, or email");
                    continue;
                }

                System.out.println("\n| Hello, " + found.getName() + " " + found.getLastNames() + "! |");
                System.out.println("\nYour assignments:");
                found.viewAssignments();
            }

        }

    }

}
