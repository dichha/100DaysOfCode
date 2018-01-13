/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.stacksandqueues;

/**
 *
 * @author dichha
 */
public class MyQueue {
    private static class QueueNode{
        private QueueNode<T> next; 
        private T data; 
        private static QueueNode<T>(T data){
            this.data = data; 
        }  
    }
    private QueueNode<T> first; 
    private QueueNode<T> last; 
    
    public void add(T item){
        QueueNode<T> t = new QueueNode<T>(item);
        if (last != null){
            last.next = t; 
        }
        last = t; 
        if(first == null){
            first = last; 
        }
        
    }
    public T remove(){
        if(first == null) throw new NoSuchElementException(); 
        T data = first.data; 
        first = first.next; 
        if(first == null){
            last = null ;
        }
        return data; 
    }
    public T peek(){
        if (first == null) throw new EmptyStackException(); 
        return first.data; 
    }
    public boolean isEmpty(){
        return first == null; 
    }
}
