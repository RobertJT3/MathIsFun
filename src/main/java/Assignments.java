package com.mycompany.mathisfun;

import java.util.ArrayList;

/**
 *
 * @author Sumirah Hunter
 */
public class Assignments {
    private final ArrayList<Assignments> allAssignments = new ArrayList<>();
    
    private String title;
    private String description;
    
    public Assignments(){
        
    }
    
    public Assignments(String title, String description){
        this.title = title;
        this.description = description;
    }
    
    public void addAssignments(String title, String description){
        Assignments a = new Assignments(title, description);
        allAssignments.add(a);
        System.out.print(a);
    }
    
    public void viewAssignments(){
        for(Assignments a : allAssignments){
            System.out.println(a);
        }
    }
    
      public ArrayList<Assignments>getAllAssignments(){
        return allAssignments;
    }
      
    @Override
    public String toString() {
        return title + "\n • " + description;
    }
}
