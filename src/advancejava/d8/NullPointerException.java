/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advancejava.d8;

/**
 *
 * @author dichha
 */

/*
    Any unchecked exception is a subclass of RuntimeException 
    and that is how Java compiler understands that a particular 
    exception belongs to the class of unchecked one. 
    
*/
public class NullPointerException extends RuntimeException{
    public NullPointerException(){
        super();
    }
    public NullPointerException(String s){
        super(s);
    }
    
}
