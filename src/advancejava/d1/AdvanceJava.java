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
public class AdvanceJava {
    /* 1.2 Initialization blocks: provide intialization logic using
        initialization blocks
        - This features is rarely used 
        - Initialization blocks do not replace the constructors and 
        may be used along with them. It is very important that 
        initialization blocks are always called before any constructor
    
    */
   
    {
     // initialization code here   
    }
    {
        // initialization code here
    }
    //Constructors with arguments
    public AdvanceJava(final String arg1, final String arg2){
        // Constructor body here
    }
    /* 1.1 constructors can call each other using 'this' special keyword. It 
       is considered a good practice to chain constructors in such a way
       as it reduces code duplication and basically leads to have a 
       single initialization entry point. 
       As an example, let us add another constructor
    */
    
    public AdvanceJava(final String arg1){
        this(arg1, null); 
    }
    /*
    public static void main(String[] args) {
        final AdvanceJava aj = new AdvanceJava("arg1", "arg2"); 
  
    }
    */
    
}
