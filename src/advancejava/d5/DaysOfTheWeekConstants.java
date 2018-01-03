/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advancejava.d5;

/**
 *
 * @author dichha
 */

/*
- Enums could be treated as special type of classes and annotation as a special 
type of interfaces.
- The idea of enums is simple, but quite handy: it represents a fixed, constant
set of values. What it means in practice is that enums are often used to design
the concepts which have a constant set of possible states. For eg. the days of 
week are a great eg. of the enums: they are limited to Monday, Tuesday, Wednesday, 
Thursday, Friday, Saturday and Sunday.

From the other side, annotations are special kind of metadata which could be 
associated w/ different elements and constructs of the Java language. Interestingly, 
annotations have contributed to a lot into the elimination of boilerplate XML 
descriptors used in Java ecosystem mostly everywhere. They introduced the new, 
type-safe and robust way of configuration and customization techniques. 

*/

// Before enums had been introduced into the Java language, the regular way to 
// model the set of fixed values in Java was just by declaring a number of 
// constants. 

public class DaysOfTheWeekConstants {
    public static final int MONDAY = 0; 
    public static final int TUESDAY = 1; 
    public static final int WEDNESDAY = 2; 
    public static final int THURSDAY = 3; 
    public static final int FRIDAY = 4;
    public static final int SATURDAY = 5; 
    public static final int SUNDAY = 6; 
    
    // Although this approach kind of works, it is far from being ideal solution. 
    // Primarily, v/c the constants themselves are just values of tpe int and 
    // every place in the code where those constants are expected (instead of 
    // arbitrary int values) should ve explicilty documented and asserted all 
    // the time. Semantically, it is not a type-safe representation of the 
    // concept as the following mehtod demonstrated. 
    
    public boolean isWeekend(int day){
        return (day == SATURDAY || day == SUNDAY);
        
    }
    
    /* 
    From logical point of view, the day argument should have one of the values
    declared in the DaysOfTheWeekConstants class. However, it is not possible to 
    guess that without additional documentation being written ( and red afterwards
    by someone). For the Java compiler the call liks isWeekend * (100) * looks 
    absolutely correct and raises not concerns. 
    
    Here the enums come to the rescue. Enums allows to replaces constants with 
    the types values and to use those types everywhere. 
    Let us rewrite the solution aboce using enums. 
    
    */
    public enum DayOfTheWeek{
        MONDAY, 
        TUESDAY, 
        WEDNESDAY, 
        THURSDAY,
        FRIDAY, 
        SATURDAY, 
        SUNDAY;
   
        /*
        What changed is that the class becomes enum and the possible values are listed
        in the enum definition. The distinguishing part
        however is that every single value is the instance of the enum class it is 
        being declared at (in our eg., DaysOfTheWeek). 
        As such, whenever enum are being usedm the Java compiler is able to do type
        checking. For eg.
        */
        public boolean isWeekend(DayOfTheWeek day){
            return (day == SATURDAY || day == SUNDAY);
        }
    }
    
    
}
