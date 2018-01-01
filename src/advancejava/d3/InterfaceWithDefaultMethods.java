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
With default methods, interfaces can provide their implementation.
*/
public interface InterfaceWithDefaultMethods {
    void performAction();
    default void performDefaultAction(){
        // Implementatin here
    }
    /*
    Being an instance level, defaults methods could be override be each interface
    implementer, but from now, interfaces may also include static methods. 
    */
    static void createAction(){
        // Implementation here
    }
    
    
}
