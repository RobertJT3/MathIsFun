
package com.mycompany.mathisfun;

import java.util.ArrayList;

/**
 *
 * @author Sumirah Hunter
 */
public class Teachers {
    private String names;
    private String lastNames;
    private String emailAd;
    
    private ArrayList<Assignments> allAssignments = new ArrayList<>();
    
    public Teachers(){
        
    }
    
    public Teachers( String names, String lastNames, String emailAd){
        this.names = names;
        this.lastNames = lastNames;
        this.emailAd = emailAd;
        
        
    }
    
    public void viewAssignments(){
        for(Assignments a : allAssignments){
            System.out.println(a);
        }
    }
    
    
    
}
