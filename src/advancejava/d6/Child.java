/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advancejava.d6;

/**
 *
 * @author dichha
 */
public class Child extends Parent{
    
    /*
    The class Parent has just one method toObject. Let us subclass this class
    and try to come up with the method version to convert numbers to strings
    (instead of raw objects).
    */
    @Override
    public String toObject(Number number){
        return number.toString();
    }
    // Let us add another method to the Child class. 
    public String toObject(Double number){
        return number.toString();
    }
     // This is an overloading of a method
    
}
