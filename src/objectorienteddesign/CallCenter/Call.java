package objectorienteddesign.CallCenter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dichha
 */
public class Call {
    // Minimal rank of employee who can handle this call 
    private Rank rank; 
    // Person whoo is calling
    private Caller caller; 
    // Employee who is handling call
    private Employee handler; 
    
    public Call(Caller c){ 
        rank = Rank.Responder; 
        caller = c; 
    }
    // Set employee who os handling call
    public void setHandler(Employee e){
        handler = e; 
    }
    public void reply(String message){
        
    }
    public Rank getRank(){
        return rank; 
    }
    public void setRank(Rank r){
        rank = r; 
    }
    public Rank incrementRank(){
        
    }
    public void disconnect(){
        
    }
    
}
