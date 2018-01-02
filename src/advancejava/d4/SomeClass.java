/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advancejava.d4;

import java.io.Serializable
/**
 *
 * @author dichha
 */
/*
When to use generics

*/
public class SomeClass implements Serializable{
    public Serializable performAction(final Serializable instance){
        // Do something here
        return instance; 
    }
    final SomeClass instance = new SomeClass(); 
    
    // Note a necessary type cast required
    final SomeClass modifiedInstance = (SomeClass) performAction(instance); 
    
    /*
    public<T extends Serializable> T performAction(final T instance){
        // Do something here
        return instance; 
    }
    final SomeClass instance = new SomeClass(); 
    final SomeClass modifiedInstance = performAction(instance); 
    // The type casing has gone away. 
    */
}

