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
public interface InterfaceWithDefinitions {
    /*
    - The principle differences of interfaces in respect to classes is that 
    interfaces outline what the contract is (declare method), but do not provide
    their implementations. 
    - Interfaces in Java can be more complicated than that: they can include 
    nested interfaces, classes, enumerations, annotations.
    */
    
    
    String CONSTANT = "CONSTANT";
    enum InnerEnum{
        E1, E2; 
    }
    class InnerClass{
        
    }
    interface InnerInterface{
        void performInnerAction();
    }
    void performAction();
    /*
     - RULES FOR INTERFACE
    i) every declaration in the interface is public.
    As such, the following method declarations are equivalent: 
    public void performAction();
    void performAction(); 
    
    ii) Every single method in the interface is implicitly declared as abstract
    and even these method declarations are equivalent:
    public abstract void performAction(); 
    public void performAction(); 
    void performAction();
    */
    
    /*
    RULES FOR CONSTANT FIELD DECLARATIONS
    String CONSTANT = "CONSTANT"; 
    public static final String CONSTANT = "CONSTANT";
    
    */
    
    /*
    Finally, the nested classes, interfaces or enumerations, additionally to 
    being public, are implicitly declared as static.
    The class declaration are equivalent.
    
    class InnerClass{
    }
    static class InnerClass{
    }
    
    
    */
}
