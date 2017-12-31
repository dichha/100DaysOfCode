/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advancejava.d2;

/**
 *
 * @author dichha
 */
public class Person2 implements Cloneable{
    /*
    - Method clone has a bad reputation in Java. 
    - It's purpose is very clear - return the exact copy of the class
    instance it is being called on, however there are copuple of reasons
    why is is not as easy as it sounds. 
    i) If you decided to implement your clone() method, there are a
    a lot of conventions to follow as stated in javadoc. 
    ii) the method is declared protected in Object class so in order to
    make it visible, it should be overriden as public with return type of 
    overriding class itself. 
    iii) The overriding class should implement the Cloneable interface 
    (which is just a marker of mixin interface with no methods defined)
    o/w CloneNotSupportedException exception will be raised. 
    iv) The implementation should all super.clone() first and then perform 
    additional actions if needed. 
    */
    
    /*
    Please add the @Override annotation, it will ensure that your
    intention is to change the default implementation.
    */
    
    @Override 
    public Person2 clone() throws CloneNotSupportedException{
        return (Person2) super.clone();
    }
    /* 
    - The implementation looks quite simple and straightforward, so what 
    could go wrong here? 
    - Couple of things, actually. While the cloning of the class instance 
    is being performed, no class constructor is being called. 
    - The consequence of such a behaviour is that unintentional data 
    sharing may come out. 
    eg: Office class
    */
}
