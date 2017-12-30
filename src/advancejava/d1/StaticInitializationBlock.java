/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advancejava.d1;

/**
 *
 * @author dichha
 */
public class StaticInitializationBlock {
    /*
    - class-level initialization constructs called static initializer
    - similar to initialization blocks except for the additional 
    static keyword.
    - because static initialization block can be triggered from multiple
    parallel threads (when the loading of the class happens in the first
    time), Java runtime guarantee that it will be executed only once  
    and in thread-safe manner. 
    */
    static {
        // static initialization code here
    }
    static {
        // static initialization code here
    }
    
    
}
