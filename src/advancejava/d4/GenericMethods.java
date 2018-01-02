/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advancejava.d4;

import java.io.InputStream; 
import java.io.Serializable;
import java.util.Collection; 
import java.util.Map; 
import java.util.HashMap; 
/**
 *
 * @author dichha
 */
// If methods are declared (or defined) as part of generic interface
// or class, they may (or may not) use the generic types of their
// owner. They may define own generic type or mix them with the ones
// from their class or interface declaration.

public class GenericMethods<T> {
    public<R> R performAction(final T action){
        final R result = ...;
        // Implementation here
        return result;
        
    }
    public<U, R> R performAnotherAction(final U action){
        final R result = ...; 
        // Implementation here
        return result; 
    }
    /*
    Class constructors are also considered to be kind of initialization
    method, and as such, may use the generic type declared by their
    class, declare own generic types or just mix both(however they
    cannot return values so the return type parameterization is 
    not applicable to constructors.
    */
    public GenericMethods(final T initialAction){
        // Implementation here
    }
    public<J> GenericMethods(final T initialAction, final J nextAction){
        // Implementation here
    }
    /* 
    Limitatin of generics
    i) primitive types (like int, long, byte, ...) are not allowed
    to be used in generics. 
    ii) It means whenever you need to parameterize your generic 
    type with a primitive one, the respective class wrapper
    (Integer, Long, Byte, ...) has to be used instead. 
    final List<Long> longs = new ArrayList<>(); 
    final Set<Integer> integers = new HashSet<>(); 
    
    Not only that, because of necessity to use class wrappers in 
    generics, it causes implicit boxing and unboxing of primitive values
    
    final List<Long> longs = new ArrayList<>(); 
    longs.add(0L); // 'long' is boxed to 'Long'
    
    long value = longs.get(0); // 'Long' is unboxed to 'long'
    // Do something with value; 
    
    But primitive types are just one of generics pitfalls. 
    Another one, more obscure is type erasure. It is important to 
    know that generics exist only at compile time: 
    the Java compiler uses a complicated set of rules to enfore
    type safety with respect to generics and their type parameter
    usage, however the produced JVM bytecode has all concrete types
    erased (and replaced with the Object class). It could come as 
    a surprise first that the following code does not compile: 
    
    void sort(Collection<String> strings){
        // Some implementation over strings here
    }
    void sort(Collection<Number> numbers){
        // Some implementation over numbers here
    }
    
    From the developer's standpoint, it is a perfectly valid code, 
    however because of type erasure, those two methods are narrowed
    down to the same signature and it leads to compilation error
    (with a weird message like "Erasure of mehtod sort(Collection<String>
    is the same as nother method ...")
    void sort(Collection strings)
    void sort(Collection numbers)
    
    Another distadvantage caused by type erasure from the fact that 
    that it is not possible to use generics' type parameters in any
    meaningful way, for eg. to create new instances of the type, or
    get the concrete class of the type parameter or use it in the 
    instanceof operator. The examples shown below do no pass compilation 
    phase:
    
    public<T> void action(final T action){
        if (action instanceOf T){
            // Do something here
        }
    }
    
    public<T> void action(final T action){
        if(T.class.isAssignableFrom(Number.class)){
            // Do something here
        }
    }
    
    And lastly, it is also not possible to create the array instances 
    using generics' type parameters. 
    For example, the following code does not compile (this time with 
    a clean error message "Cannot create a generic array of T"); 
    public<T> void performAction(final T action){
        T[] actions = new T[0]; 
    }
    
    Despite all these limitations, generics are still extremely useful 
    
    */
    /*
    The extremely powerful ability of generics is imposing the 
    constrains (or bounds) on the type they are parameterized with
    using the extends and super keywords. 
    the extends keyword restricts the type parameter to be subclass
    of some other class or implement one or more interface. 
    
    For eg: 
    
    */
    public<U extends InputStream> void read(final U stream){
        // Some implementation here
    }
    /*
    The type parameter T in the read method declaration is 
    required to be a subclass of the InputStream class. The 
    keyword is used to restrict interface implementations. 
    For eg. 
    */
    public< T extends Serializable> void store(final T object){
        // Some implementation here
    }
    /*
    Method store requires its type parameter T to implement the
    Serializable interface in order for the method to perform 
    the desired action. It is also possible to use toher type 
    parameter as a bound for extends keyword, for eg. 
    */
    public<T, J extends T> void action(final T initial, final J next){
        // Some implementation here 
    }
    
    /*
    The bounds are not limited to single constraints and could be
    combined using the &amp; operator. 
    There could be multiple interfaces specified but only single 
    class is allowed. 
    The combination of class and interfaces is also possible, with 
    a couple of examples shown below: 
    
    */
    public<T extends InputStream &amp; Serializable> void storeToRead(
        final T stream){
        // Some implementation here 
        
    }
    public<T extends Serializable &amp; Externalizable &amp; Cloneable> void persist(
        final T object){
        // Some implementation here
    }
    // If the type parameter is not of the interest of the generic
    // class, interface or method, it could be replaced by ? wildcard.
    
    public void store(final Collection<?> objects){
        // Some implementation here
    }
    /*
    In contrast to extends, the super keyword restrcts the type parameter
    to be a superclass of some other class. 
    For eg. 
    */
    public void interest(final Collection<? super Integer> objects){
        // Some implementation here
    }
    
    /*
    Generics and type inference
    - When generics found their way into Java language, they blew
    up the amount of the code developers had to write in order to 
    satisfy the language syntax rules. For eg: 
    */
    final Map<String, Collection<String>> map = new HashMap<String, Collection<String>>(); 
    
    for (final Map.Entry<String, Collection<String>> entry: map.entrySet()){
        // Some implementation here
   
    }
    
}   



