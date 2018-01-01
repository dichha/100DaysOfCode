/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advancejava.d3;

/**
 *
 * @author dichha
 */
/*
Inheritance is one of the key concept of OOP, serving as a basis of building 
class relationships. Combines together with visibility and accessibility rules, 
inheritance rules, inheritance allows designing extensible and maintainable class
hierarchies.
*/
public class Parent {
    // Everyone can see it
    public static final String CONSTANT = "Constant";
    
    // No once can access it
    private String privateField; 
    
    // Only subclass can access it
    protected String protectedField; 
    
    // No one can see it
    private class PrivateClass{
        
    }
    // Only visible to subclasses
    protected interface ProtectedInterface{
        
    }
    // Everyone can call it
    public void publicAction(){
        
    }
    // Only subclass can call it
    protected void protectedAction(){
        
    }
    // No one can call it
    private void privateAction(){
        
    }
    // Only subclasses in the same package can call it
    void packageAction(){
        
    }
    
}
