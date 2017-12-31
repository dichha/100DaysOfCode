/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advancejava.d2;

import java.util.Arrays;

/**
 *
 * @author dichha
 */
public class Office {
    private Person[] persons; 
    public Office(Person ... persons){
        this.persons = Arrays.copyOf(persons, persons.length);
    }
    @Override 
    public String toString(){
        return String.format("%s{persons=%s}", getClass().getSimpleName(),
        Arrays.toString(persons));
        
    }
    public Person[] getPerson(){
        return persons; 
    }
    
    /*public static void main(String[] args){
        final Person person = new Person("John", "Smith", "john.smith@domain.com");
        final Office office = new Office(person);
        System.out.println(office.toString());
    }*/
    
    
}

