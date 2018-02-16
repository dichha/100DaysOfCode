/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JukeBox;

/**
 *
 * @author dichha
 */
public class User {
    private String name; 
    private long ID; 
    public String getName(){
        return name; 
    }
    public void setName(String name){
        this.name = name; 
    }
    public long getID(){
        return ID; 
    }
    public void setID(long id){
        ID = id; 
    }
    public User(String name, long id){
        
    }
    public User getUser(){
        return this; 
    }
    public static User addUser(String name, long iD){
        
    }
    
}
