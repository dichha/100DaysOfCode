/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

 */
package algorithms.stacksandqueues;

import java.util.LinkedList;
/**
 *
 * @author dichha
 */

class Dog extends Animal{
    public Dog(String n){
        super(n);
    }
}
class Cat extends Animal{
    public Cat(String n){
        super(n);
    }
}
public class AnimalQueue {
    LinkedList<Dog> dogs = new LinkedList<Dog>();
    LinkedList<Cat> cats = new LinkedList<Cat>();
    private int order = 0; // acts as a timestamp
    
    public void enqueue(Animal a){
        // Order is used as a sort of timestamp, so that we can compare
        // the insertion order of a dog to a cat
        
        a.setOrder(order); 
        order ++; 
        
        if(a instanceof Dog)
            dogs.addLast((Dog) a);
        if(a instanceof Cat)
            cats.addLast((Cat) a);
    }
    public Animal dequeueAny(){
        // Look at tops of dog and cat queues, and pop the stack with the oldest
        // value
        
        if(dogs.size() == 0){
            return dequeueCats();
        }
        if(cats.size() == 0){
            return dequeueDogs();
        }
        
        Dog dog = dogs.peek();
        Cat cat = cats.peek();
        
        if(dog.isOlderThan(cat)){
            return dequeueDogs();
        }else{
            return dequeueCats();
        }
    }
    
    public Animal dequeueDogs(){
        return dogs.poll();
    }
    public Animal dequeueCats(){
        return cats.poll();
    }
    
}
