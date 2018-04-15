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
abstract class RevAnimal{
      private int order; 
      protected String name; 
      public RevAnimal(String n){
          name = n; 
      }
      public void setOrder(int ord){
          this.order = ord;  
      }
      public int getOrder(){
          return order; 
      }
      // compare orders of animals to return the older item
      public boolean isOlderThan(Animal a){
          return this.order < a.getOrder();
      }
      
  }
class RevDog extends RevAnimal{
    public RevDog(String n){
        super(n);
    }
}
class RevCat extends RevAnimal{
    public RevCat(String n){
        super(n);
    }
}
public class ReviseAnimalQueue {
    LinkedList<Dog> dogs = new LinkedList<Dog>();
    LinkedList<Cat> cats = new LinkedList<Cat>(); 
    private int order = 0; // acts as a timestamp
    
    public void enqueue(RevAnimal a){
        // order is used as a sort of timestamp, so that we can compare the insertion
        // order of a dog to a cat;
        a.setOrder(order);
        order++;
        
        if(a instanceOf RevDog){
            dogs.addLast((RevDog)a);
        }else if(a instanceOf RevCat){
            cats.addLast((RevCata);
        } 
            
                    
    }
    public RevAnimal dequeAnima(){
        if(dogs.size() == 0){
            return dequeueCats(); 
        }else if (cats.size() == 0){
            return dequeuDogs();
        }
        RevDog dog = dogs.peek();
        RevCat cat = cats.peek(); 
        
        if(dog.isOlderThan(cat))
            return dequeueDogs();
        else
            return dequeueCats();
        
                   
    }
    public RevCat dequeueCats(){
        return cats.poll();
    }
    public RevDog dequeueDogs(){
        return dogs.poll(); 
    }
    
}

