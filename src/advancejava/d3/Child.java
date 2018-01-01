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
// Resides in the same package as parent class
public class Child extends Parent implements Parent.ProtectedInterface{
    @Override
    protected void protectedAction(){
        // Calls parent's mehtod implementation
        super.protectedAction();
    }
    
    @Override 
    void packageAction(){
        // Do nothing, no call to parent's method implementation
    }
    public void childAction(){
        this.protectedField = "value";
    }
    /*
    - RULES OF INHERITANCE
    i) Every subclass may override any inherited method of its parent unless
    it was declared as final. 
    ii) @Override annotation is written whenever the intention is to override 
    the inherited method.
    iii) It is stronlgy advised to prefer interfaces to classes or abstract 
    classes whenever possible. Interfaces are mucj more lighweigh, easier to 
    test (using mocks) and maintain, plus they minimize side effects of 
    implementation changes. 
    */
}
