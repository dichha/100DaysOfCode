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
public class Book {
    /* 
    - Factory pattern is proven to be extremely useful technique
        in the hands of software developers. 
    - It has several flavors in Java, ranging from factory method
        to abastract factory. 
    - The simplest example of factory pattern is a static method
        which returns new instance of a particular class (factory
        method). 
    */
    private Book(final String title){
        
    }
    public static Book newBook(final String title){
        return new Book(title); 
    }
    /*
    - One may argue that it does not make a lot of sense to
        introduce the newBook factory method but using such a 
        pattern often makes the code more readable. 
    - Another variance of factory pattern involves interfaces or
        abstract classes (abstract factory). 
    */
}
