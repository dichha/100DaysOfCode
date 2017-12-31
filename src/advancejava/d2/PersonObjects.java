/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advancejava.d2;

import java.util.Objects; 

/**
 *
 * @author dichha
 */
public class PersonObjects {
    /*
    Useful helper classes: 
    i) static  boolean equals(Object a, Object b) ==> Returns true
    if the arguments are equal to each other and false otherwise. 
    ii) static int hash(Object ... values) ==> Generates a hash code 
    for a sequece of input values. 
    iii) static int hashCode(Object o) ==> Returns the hash code of a
    non-null argument and 0 for a null argument. 
    */
    private final String firstName; 
    private final String lastName; 
    private final String email; 
    
    public PersonObjects(final String firstName, final String lastName, final String email){
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
    @Override
    public boolean equals(Object obj){
        if (obj == null){
            return false;
        }
        if (this == obj){
            return true; 
        }
        if (getClass() != obj.getClass()){
            return false; 
        }
        final PersonObjects other = (PersonObjects) obj; 
        if(!Objects.equals(email, other.email)){
            return false;
        }else if(!Objects.equals(firstName, other.firstName)){
            return false;
        }else if (!Objects.equals(lastName, other.lastName)){
            return false;
        }
        
        return true; 
        
    }
    @Override
    public int hashCode(){
        return Objects.hash(email, firstName, lastName);
    }
    @Override 
    public String toString(){
        return String.format("%s[emails=%s, first name=%s, last name=%s]", 
                            getClass().getSimpleName(), email ,firstName, lastName);
             
    }
    public static void main(String[] args){
        final PersonObjects po = new PersonObjects("John", "Smith", "john.smith@domain.com");
        System.out.println(po.toString());
    }
    
}
