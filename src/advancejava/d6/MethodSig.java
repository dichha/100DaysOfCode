package advancejava.d6;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dichha
 */
public class MethodSig {
    // Since Java 5 release, the methods can have variable list of arguments
    // of the same type called (varargs) using a special syntax, for eg. 
    
    public void find(String ... elements){
        // some implementation here
    }
    /*
    Internally, the Java compiler converts varargs into an array of the 
    respective type and that is how varargs can be accessed by the 
    method implementation. 
    */
    /*
    Interestingly,Java also allowes to declare the varargs argument using
    generic type parameter. However, because the type of the argument
    is not known, the Java compiler wants to be sure that the varargs are 
    used responsibly and advice the methods to be final and annotated with
    the @SafeVargs annotation
    */
    @SafeVarargs
    final public<T> void find(T ... elements){
        // Some implementation here
    }
    /*
    The other way around is by using the @SuppressWarnings annotation, for eg.
    
    */
    @SuppressWarnings("unchecked")
    public<T> void findSuppressed(T ... elements){
        
    }
    /*
    The next eg. demonstrates the usage of the checked exceptions as part 
    of the mehtod signature. In recent years the checked exception has proved 
    not to be as useful as they intended to be, causing more boilerplace code
    to to written than problems solved. 
    */
    public void write(File file) throws IOException{
        // Some implementation here
    }
    /*
    Method overloading is somewhat close to generics, however it is used 
    in cases where the generic approach does not work well and each (or most)
    generic type arguments require their own specialized implementation. 
    
    */
    public<T extends Number> String numberOfString(T number){
        return number.toString();
    }
    public String numberToString(BigDecimal number){
        return number.toString(); 
    }
}
