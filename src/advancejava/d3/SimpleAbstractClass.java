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
By contrast to regular classes, abstract classes cannot be instantiated but 
could be subclassed. More importantly, abstract classes may contain abstract methods. 

*/
public abstract class SimpleAbstractClass {
    public void perfromAction(){
        // Implementation here
    }
    public abstract void performAnotherAction();
}

/* 
- Abstract classes are very useful when most or even some part of implementation 
details could be shared by many subclass. However, they still leave the door
open and allow customizing the intrinsic behavior of each subclass by means of
abstract methods. 
-In contrast to interfaces with can contain only public declaration, abstract 
classes may use the full power of accessibility rules to control abstract methods
visibility. 
*/
