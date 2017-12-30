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
public class LazySingleton {
    /*
    - if you do not want to waste your resources and would like your 
        singletons to be lazily created when they are really needed, 
        the explicit synchronization is required, potentially leading
        to lower concurrency in a multithreaded environments. 
    - 
        
    */
    private static LazySingleton instance; 
    private LazySingleton(){
        
    }
    public static synchronized LazySingleton getInstance(){
        if(instance == null){
            instance = new LazySingleton(); 
        }
        return instance; 
    }
    
}

/*
- Nowdays, singletons are not considered to be a good choice in most 
    cases, primarily because they are making a code very hard to test. 
- The domination of dependency injection pattern also makes the singletons
    unnecessary. 
*/

