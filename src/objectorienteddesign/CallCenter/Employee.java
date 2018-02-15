/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectorienteddesign.CallCenter;

/**
 *
 * @author dichha
 */
public abstract class Employee {
    private Call currentCall = null; 
    protected Rank rank; 
    
    public Employee(CallHandler handler){
        
    }
    // Start the conversation 
    public void receiveCall(Call call){}
    
    // the issue is resolved, finish the call 
    public void callCompleted(){}
    
    // the issue has not been resolved. Escalate the call, and assign a new call to the employee
    public void escalateAndReassign(){}
    
    // Assign a new call to an employee, if the empoyee is free
    public boolean assignNewCall(){
        
    }
    //Returns whether or not the employee is free
    public boolean isFree(){
        return currentCall == null; 
    }
    public Rank getRank(){
        return rank; 
    }
    
    
}
