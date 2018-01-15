/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.stacksandqueues;

import java.util.Stack;
/**
 *
 * @author dichha
 */
public class MyQueueII<T> {
   Stack<T> stackNewest, stackOldest; 
   
   public MyQueueII(){
        stackNewest = new Stack<T>();
        stackOldest = new Stack<T>(); 
   }
   
   public int size(){
       return stackNewest.size() + stackOldest.size();
   }
   
   public void add(T value){
       // Push onto stackNewest, which always has the newest elements on top
       stackNewest.add(value);
   }
    
   // Move elements from stackNewest into stackOldest. This is usually done 
   // so that we can do operation on stackOldest
   
   private void shiftStacks(){
       if(stackOldest.isEmpty()){
           while(!stackNewest.isEmpty()){
               stackOldest.push(stackNewest.pop());
           }
       }
   }
   
   public T peek(){
       shiftStacks(); // Ensures stackOldest has the current elements 
       return stackOldest.peek(); // retrieve the oldest item. 
   }
   
   public T remove(){
       shiftStacks(); // Ensures stackOldest has the current elements
       return stackOldest.pop(); 
       
   }
    
}
