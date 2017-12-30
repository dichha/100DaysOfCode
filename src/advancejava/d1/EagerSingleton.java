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
public class EagerSingleton {
     /* 
    - One problem with NaiveSingleton code is that it may create many 
      instance of the class if called concurrently by multiple threads. 
    - One of the ways to design singleton property (but in non-lazy fashion)
     is using the static final property of the class. 
    */
    private static final EagerSingleton instance = new EagerSingleton();
    
    private EagerSingleton(){
        
    }
    public static EagerSingleton getInstance(){
        return instance; 
    }
    
    
}
