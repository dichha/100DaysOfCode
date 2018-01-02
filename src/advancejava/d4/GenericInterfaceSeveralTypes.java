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
// The interface may be parameterized with more than one type
public interface GenericInterfaceSeveralTypes<T, R>{
    R performAction(final T action);
    
}
