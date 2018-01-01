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
The fucntional interfaces are a different story and they are proven to be very 
helpful add-on to the language. Basically, the functional interface is the 
interface with just a single abstract method declared in it. The Runnable 
interface from Java standard library is a good example of the concept.
*/
@FunctionalInterface
public interface Runnable {
    void run();
    
}
/*
The Java  compiler treats functional interfaces differently and is able to 
convert the lambda function into the functional interface implementation where it 
makes sense. Let use take a look on following fucntion definition: 

public void runMe (final Runnable r){
    r.run();
}
*/