
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
    
    public Teachers(){
        
    }
    
    public Teachers( String names, String lastNames, String emailAd){
        this.names = names;
        this.lastNames = lastNames;
        this.emailAd = emailAd;
        
        
    }
    
   public void viewAssignments(Assignments info) {
        info.viewAssignments();
    }
    
    
    
}
