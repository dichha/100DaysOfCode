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
public class MyStack {
    private static class StackNode<T>{
        private StackNode next; 
        private T data; 
        public StackNode(T data){
            this.data = data; 
        }
    }
    private StackNode<T> top; 
    public T top(){
        if (top == null) throw new EmptyStackException();
        T item == top.data; 
        top = top.next; 
        return item; 
    }
    public void push(T item){
        StackNode<T> t = new StackNode(T);
        t.next = top; 
        top = t; 
    }
    public T peek(){
        if(top == null) throw new EmptyStackException();
        return top.data; 
    }
    public boolean isEmpty(){
        return top == null; 
    }
}
