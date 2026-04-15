
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
        
        System.out.println("Are you a Student? (yes/no)");
        String student = in.nextLine();

        if ("yes".equals(student)) {
            System.out.println("Enter student first name:");
            String names = in.nextLine();

            System.out.println("Enter student last name:");
            String lastName = in.nextLine();

            System.out.println("Enter student email:");
            String emailAd = in.nextLine();

            System.out.println("Enter grade:");
            int grades = Integer.parseInt(in.nextLine());

            information.addStudent( names, lastName, emailAd, grades);
            
            
            
        }

        Teachers students = new Teachers();

        System.out.println("\nAre you a Teacher? (yes/no)");
        String teacher = in.nextLine();

        if ("yes".equals(teacher)) {

            String backChoice;
            do {
                System.out.print("\n1. Add Student");
                System.out.print("\n2. Add Assignment");
                System.out.println("\n3. View Students");

                int decision = Integer.parseInt(in.nextLine());

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
                    System.out.println("Assignment feature here");
                } else if (decision == 3) {
                    information.viewStudents();
                    System.out.println("Amount of students: " + information.getStudents().size());
                }

                System.out.println("Back to menu? (yes/no)");
                backChoice = in.nextLine();

            } while (backChoice.equalsIgnoreCase("yes"));

        }

    }
}
