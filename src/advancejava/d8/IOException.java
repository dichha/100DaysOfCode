/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advancejava.d8;

import java.io.InputStream; 
import java.io.FileInputStream; 
import java.io.IOException; 
import java.io.File; 

/**
 *
 * @author dichha
 */
/*
Consequentlu, a checked exception represent invalid conditions
in the area which are outside of the immediate control of the 
program (like memory, network, file system, ...). Any 
checked exception is a subclass of Exception. In contraast 
to the unchecked expetions, checked exceptions must be 
either caught by caller or be listed as part of the 
method signature (using throws keyword). The IOException is, probably, the 
most known one among the checked exceptions:
*/
public class IOException extends Exception{
    public IOException(){
        super();
    }
    public IOException(String message){
        super(message); 
    }
    public IOException(String message, Throwable cause){
        super(message, cause);
    }
    public IOException(Throwable cause){
        super(cause);
    }
    /*
    The separation to checked and unchecked exceptions sounded like a good 
    idea at the time, however over the year it turned out that it has 
    introduced more boilerplace and not so pretty code patterns than solved
    the real problems. The typical (and unfortunately quite cumbersome) 
    pattern which emerged within Java ecosystem is to hide (or wrap) the 
    checked exception within unchecjed one, for eg.
    */
    public IOException tryException(){
        try{
            // Some I/O operation here
        }catch(final IOException ex){
            throw new RuntimeException("I/O operation failed", ex);
        }
    }
    /*
    Any exception thrown causes some, so called, stack unwinding and 
    changes in the program execution flow. The results of that are 
    possible resource leaks related to unclosed native resources (like 
    file handles and network sockets). The typical well-behaved I/O 
    operations in Java(up util version 7) required to use a mandatory 
    finally block to perform the cleanup and usually was looking like this: 
    */
    public void readFile(final File file){
        InputStream in = null; 
        try{
            in = new FileInputStream(file); 
            // Some implementation here 
        }catch(IOException ex){
            // Some implementation here
        }finally{
            if(in != null){
                try{
                    in.close();
                }catch(final IOException ex){
                    // so nothing 
                }
            }
        }
    }
    /*
    In the section "Exceptions and when to use them" we emphasized on the 
    fact that exception should be never ignored, however the one thrown by
    close methods are arguably the single exclusion from this rule. 
    Luckily, since Java 7 there is a new construct introduced into the
    language called try-with-resources which significantly simplified overall
    resource management. Here is the code above rewritten using 
    try-with-resources.
    
    */
    public void readFile(final File file){
        try(InputStream in = new FileInputStream(file)){
            // Some implementation here
        }catch{
            // Some implementation here
        }
    }
    /*
    The only thing which the resource is required to have in order to be
    used in the try-with-resources blocks is implementation of the 
    interface AutoCloseable. Behind the scene Java compiler expands this
    construct to something more complex but for developers the code
    looks very reable and concise. 
    */
    
    /*
    Exceptions and lambdas
    The following code snippet will not compile with a compilation error
    *" Unhandled exception type IOException"* (which could be thrown at
    line 03): 
    
    */
    public void readFile(){
        run(()-> {
           File.readAllBytes(new File("some.txt").toPath()); 
        });
    }
    public void run(final Runnable runnable){
        runnable.run();
    }
    
    /*
    The only solution right now is to catch the IOException exception
    inside lambda function body and re-throw the appropriate
    RuntiveException exception (not forgettign to pass the original 
    exception as a cause), for eg. 
    public void readFile(){
        run() -> {
            try{
                File.readAllBytes(new File("some.txt").toPath());
            } catch (final IOException ex){
                throw new RuntimeException("Error reading file", ex);
            }
        )};
     */
}   

