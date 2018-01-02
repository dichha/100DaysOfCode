/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advancejava.d4;

/**
 *
 * @author dichha
 */
public class GenericClassImplementingGenericInterface<T>
    implements GenericInterfaceOneType<T>{
    @Override
    public void performAction(final T action){
        // Implementation here
    }
    // Methods could use generic types as part of argument 
    // declaratin or return type declaration
    public<T, R> R performAction2(final T action){
        final R result = ...; 
        // Implementation here
        return result; 
    }
    
    
    
}
