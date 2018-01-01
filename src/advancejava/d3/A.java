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
interface A {
    default void performAction(){
        
    }
    
}
interface B extends A{
    @Override
    default void performAction(){
        
    }
}
interface C extends A{
    @Override
    default void performAction(){
        
    }
}
// "Diamond of Death"
// E is not compliable unless it overrides performAction() as well. 
/*
interface E extends B, C{
    
}
*/
