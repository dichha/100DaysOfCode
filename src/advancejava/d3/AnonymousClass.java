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
In the pre-Java 8 era, anonymous classes were the only way to provide in-place 
class definitions and immediate instantiations. The purpose of the anonymous 
classes was to reduce boilerplate and provide a concise and easy way to 
represent classes as expressions. 

*/
public class AnonymousClass {
    
    /*
    A look on th etypical old-fashioned way to spawn new thread in Java:
    */
    public static void main(String[] args){
        new Thread(
            // Example of creating anonymous class which implements 
            // Runnable interface
                new Runnable(){
                    @Override
                    public void run(){
                        // Implementation here
                    }
                }
        ).start();
    }
    /*
    In this example, the implementation of the Runnable interface is provided in
    place as anonymous class. Although there are some limitations associated with 
    anonymous classes, the fundamental disadvantages of their usage are quite
    verbose syntax constructs which Java imposes as a language. Even tthe simplest
    anonymous class which does nothing requires atleast 5 lines of code to be 
    written every time. 
    
    new Runnable(){
        @Override
        public void run(){
        }
    }
    */
    /*
    With java 8, lambdas and functional interfaces all this boilerplate is about 
    to go away, finally making th eJava code to look truly concise.
    public class AnonymousClass{
        public static void main(String[] args){
            new Thread(() -> {// Implementation here } ).start();
        }
    }

    */

}   
    