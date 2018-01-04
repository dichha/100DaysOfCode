/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advancejava.d7;

import java.util.Locale; 
import java.io.InputStream; 
import java.io.FileInputStream;
import java.util.Arrays;
/**
 *
 * @author dichha
 */

 /*
    - The variable becomes visible from place it is declared to the end of the
    method (or code block) it is declared in. 
    - One single rule to follow: declare the local variable as close to
    the place where it is used as possible. 
    - An example
 */

public class VariableScopes {
    
   static void varScopes(){
    for (final Locale locale: Locale.getAvailableLocales()){
        // Some implementation here
    }
    try(final InputStream in = new  FileInputStream("file.txt")){
        // Some implementation here
    }
    /*
    In both code snippets the scope of the local variables is limited 
    to the execution blocks they are declared in.
    Once the block ends, the local variable goes out of scope and is 
    not visible anymore. It looks clean and consise however with the
    realease of Java 8 and introduction of lamdas, many well-known 
    idioms of using local variables are becoming obselete. Let us
    rewrite for the  for-each loop from the previous eg. to use lambdas
    instead: 
    */
    Arrays.stream(Locale.getAvailableLocales()).forEach((locale) ->{
        // Some implementation here
    }
    );
   }
    
}
