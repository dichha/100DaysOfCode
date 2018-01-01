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
Immutability is becoming more and more important in the software development 
nowdays. The rise of multi-core systems has raised a lot of concerns related to 
data sharing and concurrency. But the one thing definitely emerged: less (or 
even absence of) mutable state leads to better scalibility and simple reasoning
about the systems. 

- Java does not provide a strong support for class immutability. However using a
combination of techniques it is possible to design classes which are immutable. 
- First and foremost, all fields of the class should be final. It is a good 
start but does not guarantee immutability alone. 
*/
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ImmutableClass {
    private final long id; 
    private final String[] arrayOfStrings; 
    private final Collection<String> collectionOfString; 
    
    /*
    Secondly, follow the proper initialization: if the field is the reference to 
    a collection or an array, do not assign those fields directly from constructor
    arguments, make the copies instead. It will guarantee that state of the 
    collection or array will not be changed from outside. 
    */
    public ImmutableClass( final long id, final String[] arrayOfStrings, final 
            Collection<String> collectionOfString){
        this.id = id; 
        this.arrayOfStrings = Arrays.copyOf(arrayOfStrings, arrayOfStrings.length); 
        this.collectionOfString = new ArrayList<>(collectionOfString);
    }
    /*
    And lastly, provide the proper accessors (getters). For the collection, the 
    immutable view should be exposed using Collections.unmodifiableXxxx wrappers.
   
    */
   public Collection<String> getCollectionOfString(){
       return Collections.unmodifiableCollection(collectionOfString);
   } 
   
   /*
   With arrays, the only way to ensure true immutability is to provide a copy 
   instead of returning referece to the array. 
   That might not be acceptable from a practical standpoint as it hugely depends
   on array sie and may put a lot of pressure on garbase collector. 
   */
   
   public String[] getArrayOfString(){
       return Arrays.copyOf(arrayOfStrings, arrayOfStrings.length);
       
   }
   /*
   Even this small example gives a good idea that immutabilty is not a first 
   class citizen in Java yet. Things can get really complicated if an immutable 
   class has fields referencing another class instances. Those classes should
   also be immutable however there is no simple way to enforce that.
   */
}
