/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mathisfun;

import java.util.ArrayList;

/**
 *
 * @author super
 */
public class Assignments {
    private static ArrayList<Assignments> allAssignments = new ArrayList<>();
    
    private String title;
    private String description;
    
    
    public Assignments(String title, String description){
        this.title = title;
        this.description = description;
    }
    
    public static void addAssignments(Assignments a){
        allAssignments.add(a);
    }

    public void viewAssignments(){
        for(Assignments a : allAssignments){
            System.out.println(a);
        }
    }
    
      public static ArrayList<Assignments>getAllAssignments(){
        return allAssignments;
    }
      
    @Override
    public String toString() {
        return title + " - " + description;
    }
}
