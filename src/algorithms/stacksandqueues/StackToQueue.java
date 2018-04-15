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
public class StackToQueue {
  
    Stack<Integer> newestStack; 
    Stack<Integer> oldestStack; 
    public StackToQueue(){
        newestStack = new Stack<Integer>(); 
        oldestStack = new Stack<Integer>(); 
    }
    public void add(int n){
        newestStack.push(n);
    }
    public void shiftStack(){
        if(oldestStack.empty()){
            while(!newestStack.isEmpty()){
                oldestStack.push(newestStack.pop());
            }
        }
    }
    public int peek(){
        shiftStack(); 
        return oldestStack.peek(); 
    }
    public int remove(){
        shiftStack();
        return oldestStack.pop();
    }
    public int size(){
        return newestStack.size() + oldestStack.size(); 
    }
    /*
    public static void main(String[] args){
        StackToQueue st = new StackToQueue(); 
        st.add(12); 
        st.add(14); 
        st.add(0);
        st.add(-12); 
        st.add(0); 
        st.add(23);
        
        System.out.println("Peek: " + st.peek());
        System.out.println("Remove: " + st.remove());
        st.add(16); 
        System.out.println("size: " + st.size());
        
    }
    */
    
}
