/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advancejava.d2;

/**
 *
 * @author dichha
 */
public class Person {
    private final String firstName; 
    private final String lastName; 
    private final String email; 
    public Person(final String firstName, final String lastName, final String email){
        this.firstName = firstName; 
        this.lastName = lastName; 
        this.email = email; 
    }
    public String getEmail(){
        return email; 
    }
    public String getFirstName(){
        return firstName; 
    }
    public String getLastName(){
        return lastName; 
    }
    // Step 0: Please add the @Override annotation, it will ensure 
    // that your intention is to change default implementation
    @Override
    public boolean equals(Object obj){
        // Step 1: Check if the 'obj' is null
        if(obj == null){
            return false; 
        }
        // Step 2: Check if the 'obj' is pointing to this instance
        if (this == obj){
            return true; 
        }
        // Step 3: Check classes equality. Note of caution here: please
        // do not use the 'instanceof' operator unless class is declared
        // final. It may cause an issue within class hierarchies. 
        
        if(getClass() != obj.getClass()){
            return false; 
        }
        // Step 4: Check individual fields equality
        final Person other = (Person) obj; 
        if (email == null){
            if(other.email != null){
                return false; 
            }
        }else if(!email.equals(other.email)){
            return false;
        }
        if (firstName == null){
            if(other.firstName != null){
                return false;
            }
        }else if(!firstName.equals(other.firstName)){
            return false; 
        }
        if (lastName == null){
            if(other.firstName != null){
                return false; 
            }
        }
        return true;    
    }
    @Override 
    public int hashCode(){
        final int prime = 31; 
        int result = 1; 
        result = prime * result + (( email == null) ? 0 : email.hashCode());
        result = prime * result + (( firstName == null) ? 0 : firstName.hashCode());
        result = prime * result + (( lastName == null) ? 0 : lastName.hashCode()); 
        
        return result; 
    }
    /*
    - toString() is arguably the most interesting method among the other
    and is being override more frequently. 
    - Its purpose is to provide the string representation of the the object
    (class instance). 
    - The properly written toString() method can greatly simplify debugging
    and troubleshooting of the issues in real-live systems. 
    - The default toString() implementation is not very useful in most cases
    and just returns the full class name and object hash code, separated by @
    , i.e 
    com.javacodegeeks.advanced.objects.Person@6104e2ee
    
    - Let us try to improce the implementation and override the toString()
    method for our Person class example. 
    Here is one of the way to make toString() more useful.
    */
    
    @Override 
    public String toString(){
        return String.format("%s[emails=%s, first name=%s, last name=%s]", 
                            getClass().getSimpleName(), email ,firstName, lastName);
             
    }
    
    /*public static void main(String[] args){
        final Person person = new Person("John", "Smith", "john.smith@domain.com");
        System.out.println(person.toString());
    }
    */
}
