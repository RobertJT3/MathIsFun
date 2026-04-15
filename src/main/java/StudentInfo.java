/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
        for (Students s : ListOfStudents){
            System.out.println(s);
        }
    }
    
}
