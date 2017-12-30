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
public class NaiveSingleton {
    /*
    - Singleton is one of the oldest and controversial patterns in software
    developer's community
    - The main idea of it is to ensure that only one single instance of the
    class could be created at any given time. 
    - Being so simple raised a lot of the discussion about how to make it
    right and thread-safe. 
    */
    // Naive version of singleton class
    private static NaiveSingleton instance; 
    private NaiveSingleton(){
        
    }
    public static NaiveSingleton getInstance(){
        if(instance == null){
            instance = new NaiveSingleton(); 
        }
        return instance; 
    }
    /* 
    - One problem with this code is that it may create many instance of
      the class if called concurrently by multiple threads. 
    - One of the ways to design singleton property (but in non-lazy fashion)
     is using the static final property of the class. 
    */
    
}
