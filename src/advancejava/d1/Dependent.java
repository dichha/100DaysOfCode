/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advancejava.d1;

import java.text.DateFormat; 
import java.util.Date; 
/**
 *
 * @author dichha
 */
public class Dependent {
    /* 
    - Dependency injection (also known as inversion of control) is
        considered as a good practice for class designers: if 
        some class instance depends on the other class instances, 
        those dependencies should be provided (injected) to it by 
        means of constructors (or setters, strategies, etc.) but 
        not created by the instance itself. 
    */
    private final DateFormat format = DateFormat.getDateInstace();
    public String format(final Date date){
        return format.format(date); 
    }
    /*
         - The class Dependant needs an instance of DateFormat
            and it just creates one by called 
            DateFormat.getDateInstance() at construction time. 
         - The better design would be to use constructor argument to
            do the same thing.
    */
    
    private final DateFormat format2; 
    public Dependent(final DateFormat format2){
        this.format2 = format2; 
    }
    public String format2(final Date date){
        return format2.format(date); 
    } 
    
    /*
     - In this case the class has all its dependencies provided 
        from outside and it would be very easy to change date format
        and write test cases for it. 
    */
}
