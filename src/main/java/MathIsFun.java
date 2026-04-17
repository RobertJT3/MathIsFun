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
        Parents parents = new Parents();
        Teachers students = new Teachers();
        
        while(true){
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

            String backChoice;
            do {

                System.out.println("\n1. View Students");
                System.out.println("2. View Assignments");

                System.out.println("---------------------------------");
                int decision = Integer.parseInt(in.nextLine());
                System.out.println("---------------------------------");

                if (decision == 1) {
                    System.out.println();
                    information.viewStudents();
                    System.out.println("Amount of students: " + information.getStudents().size());

                } else if (decision == 2) {
                    assign.viewAssignments();
                    System.out.println("\nAmount of Assigments: " + assign.getAllAssignments().size());
                }
                System.out.println("\n\nBack to menu? (yes/no/back)");
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

                if (decision == 1) {
                    String choice;

                    do {
                        System.out.println("Enter student first name:");
                        String names = in.nextLine();

                        System.out.println("Enter student last name:");
                        String lastName = in.nextLine();

                        System.out.println("Enter student email:");
                        String emailAd = in.nextLine();

                        System.out.println("Enter grade:");
                        int grades = Integer.parseInt(in.nextLine());

                        information.addStudent(names, lastName, emailAd, grades);

                        System.out.println("\nStudent added.");

                        System.out.println("\nAdd another student?");
                        choice = in.nextLine();

                    } while (choice.equalsIgnoreCase("yes"));

                } else if (decision == 2) {
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

                } else if (decision == 3) {
                    System.out.println();
                    information.viewStudents();
                    System.out.println("Amount of students: " + information.getStudents().size());

                } else if (decision == 4) {
                    assign.viewAssignments();
                    System.out.println("\nAmount of Assigments: " + assign.getAllAssignments().size());
                }

                System.out.println("\n\nBack to menu? (yes/no/back)");
                backChoice = in.nextLine();

                if (backChoice.equalsIgnoreCase("back")) {
                    System.out.println("\nReturning to questions...\n");
                    
                }

            } while (backChoice.equalsIgnoreCase("yes"));

        }
        
        

           
        String student;
        while (true) {
            System.out.println("Are you a Student? (yes/no)");
            student = in.nextLine();
            if (student.equalsIgnoreCase("yes") || student.equalsIgnoreCase("no")) {
                break;
            }
            System.out.println("Please enter yes or no");

        }

        if (student.equals("yes")) {

            System.out.println("Enter student first name:");
            String names = in.nextLine();

            System.out.println("Enter student last name:");
            String lastName = in.nextLine();

            System.out.println("Enter student email:");
            String emailAd = in.nextLine();

            System.out.println("Enter grade:");
            int grades = Integer.parseInt(in.nextLine());

            System.out.println("Your assignments: ");
            assign.viewAssignments();

            information.addStudent(names, lastName, emailAd, grades);
            
            
        }
       
    }
        
}
    
}
