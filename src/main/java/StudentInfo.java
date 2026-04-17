package com.mycompany.mathisfun;

import java.util.ArrayList;

/**
 *
 * @author Sumirah Hunter
 */
public class StudentInfo {
    private ArrayList<Students> ListOfStudents = new ArrayList<>();
    
    
    public StudentInfo(){
        
    }
    
    
    public void addStudent(String names, String lastNames, String emailAd, int grades){
        Students s = new Students(names, lastNames, emailAd, grades);
        ListOfStudents.add(s);
        System.out.println(s);
       
    }
    
    public ArrayList<Students> getStudents(){
        return ListOfStudents;
    }
    
    public void viewStudents(){
        for(int i = 0; i < ListOfStudents.size(); i++){
            
        }
        
        for (Students s : ListOfStudents){
            System.out.println(s);
        }
    }
    
}
