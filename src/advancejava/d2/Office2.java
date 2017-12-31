/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advancejava.d2;

import java.util.Arrays;

/**
 *
 * @author dichha
 */
public class Office2 implements Cloneable {
    private Person[] persons; 
    public Office2(Person ... persons){
        this.persons = Arrays.copyOf(persons, persons.length); 
    }
    /*
    @Override
    public Office2 clone() throws CloneNotSupportedException{
        return (Office2) super.clone();
    }
    */
    public Person[] getPersons(){
        return persons; 
    }
    /*
    - In this implementation, all of the Office class instance will share
    the same persons array, which is unlikely the desired behavior.
    - 
    */
    @Override 
    public Office2 clone() throws CloneNotSupportedException{
        final Office2 clone = (Office2) super.clone(); 
        clone.persons = persons.clone(); 
        return clone; 
    }
    /*
    It looks better now but even this implementation is very fragile 
    making the persons field to be final will lead to the same data 
    sharing issues (as final cannot be reassigned). 
    
    By and large, if you would like to make exact copies of your classes, 
    probably it is better to avoid clone() and Cloneable and use much simpler
    alternatives (for eg., copying constructor, quite familiar concept to 
    developers with C++ background, or factory method, a useful construction 
    pattern we have discussed in part 1 of the tutorial, How to create and 
    destroy objects). 
    */
    
    
    
}
