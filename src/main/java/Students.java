
package com.mycompany.mathisfun;



/**
 *
 * @author Sumirah Hunter
 */
public class Students {
    private String names;
    private String lastNames;
    private String emailAd;
    private int grades;
    
    
    public Students(String names, String lastNames, String emailAd, int grades){
        this.names = names;
        this.lastNames = lastNames;
        this.emailAd = emailAd;
        this.grades = grades;
        
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
