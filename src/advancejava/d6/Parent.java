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
public class Parent {
    /*
    In this section, when we already know about method overloading, we are 
    going to show off why using @Override annotation is so importatnt. 
    Our example will demonstarate the subtle difference between method overriding
    and overloading in the simple class hierarchy. 
    */
    public Object toObject(Number number){
        return number.toString();
    }
    /*
    The class Parent has just one method toObject. Let us subclass this class
    and try to come up with the method version to convert numbers to strings
    (instead of raw objects).
    */
    
    
}
