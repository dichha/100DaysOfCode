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
In contrast to C++ and some other languages, Jaca does not support multiple 
inheritance: in Java every class has exactly one direct parent (with Object 
class being on top of the hierarchy. However, the class may implement multiple 
interfaces and as such, stacking interfaces is the only way to achieve (or mimic)
multiple inheritace in Java.
*/
public class MultipleInterfaces implements Runnable, AutoCloseable{
    @Override
    public void run(){
        // some implementation here
    }
    @Override 
    public void close() throws Exception{
        // some implementation here
    }
    /*
    Implementation of multiple interfaces is in fact quite powerful, but often the 
    need to reuse an implementation leads to deep class hierarchies as a way to
    overcome the absence of multiple inheritance support in Java. 
    */
    /*
    public class A implements Runnable{
        @Override 
        public void run(){
            // some implementation here
        }
    }
    public class B extends A implements AutoCloseable{
        @Override 
        public void close() throws Exception{
            // some implementation here
        }
    }
    
    public class C extends B implements Readable{
        @Override
        public int read(java.nio.CharBuffer cb) throws IOException{
            // Some implementation here
        }
    }
    
    */
    
}
