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
Inheritance is not the only way to design your classes. Another alternative, 
which many developers consider being better than inheritance, is composition. 
The idea is very simple: instead of building class hierarchies, the classes 
should be composed of other classes. 
*/
public class Vehicle {
    private Engine engine; 
    private  Wheels[] wheels;
    //...
    
}
/*
The Vehicle class is composed of engine and wheels (plus some other parts
which are left aside for simplicity). 
However, one may say that Vehicle class is also an engine and sould vould be 
designed using the inheritance.
public class Vehicle extends Engine{
    private Wheels[] wheels; 
    // ...
}
Which design decision is right? The general guidelines are known as IS-A and
HAS-A principles. IS-A is the inheritace relationship: the subclass also 
satisfies the parent class specification and a such IS-A variation of parent 
class. Consequently, HAS-A is the composition relationship: the class owns (or 
HAS-A_ the objects which belongs to it. 
In most cases, the HAS-A principle works better then IS-A for a couple of 
reasons: 
i) The design is more flexible in a way it could be changed. 
ii) The models is more stables as changes are not propagatin through class
hierarchies. 
iii) The class and its composites are loosely coupled compared to inheritance
which tightly couples parents and its subclasses. 
iv) The reasoning about class is simpler as all its dependencies are included in
it, in one place. 


However, the inheritance has its own place, solves real design issues in 
different way and should not be neglected. Please keep those two alternatives
in mind while designing your object-oriented models. 

*/
