
package com.mycompany.mathisfun;

import java.util.ArrayList;



/**
 *
 * @author Sumirah Hunter
 */
public class Students {
    private String names;
    private String lastNames;
    private String emailAd;
    private int grades;
    private ArrayList<Assignments> assignments = new ArrayList<>();
    
    
    public Students(String names, String lastNames, String emailAd, int grades){
        this.names = names;
        this.lastNames = lastNames;
        this.emailAd = emailAd;
        this.grades = grades;
    }
    
    
    public void addAssignment(Assignments a){
        assignments.add(a);
    }
    
    public ArrayList<Assignments> getAssignments(){
        return assignments;
    }

    @Override
    public String toString() {
        return "\nStudent name: " + names + " " + "| Student last name: " + lastNames + " | Student email: " + emailAd + " | Grade: " + grades;
    }
    
    public String getName(){
        return names;
    }
    
    
    public String getLastNames(){
        return lastNames;
    }
    
    public String getEmails(){
        return emailAd;
    }
    
    public int getGrades(){
        return grades;
    }
    
   
    
}
