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
// Similar to interfaces, the difference between the regular
// and generic classes is only the type parameters in the 
// class definitions

public class GenericClassOneType<T>{
    public void performAction(final T action){
        // Implementation here
    }
    /*
    - Any class (concrete, abstract or final) could be parameterized
    using generics. 
    - One interesting detail is that the class may pass (or may not)
    its generic type (or types) down to the interfaces and parent
    classes, without providing the exact type of instance. 
    */
    
}
