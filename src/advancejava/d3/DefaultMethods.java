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
The recent Java 8 release somewhat addressed the problem with the introduction 
of default methods. Because of default methods, interfaces actually have started
to provide not only contract but also implementation. Consequently, the classes
which implement those interfaces are automatically inheriting thse implemented 
methods as well.
*/
public interface DefaultMethods extends Runnable, AutoCloseable{
    @Override
    default void run(){
        // Some implementation here
    }
    @Override
    default void close() throws Exception{
        // Some implementation here
    }
    
}
/*
- Class C inherits the implementation of run(0 and close() methods from the 
DefaultMethods interface.

public class C implements DefaultMethods, Readable{
    // some implementation here
}
*/
