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
public class StackWithMin2 extends Stack<Integer> {
    Stack<Integer> s2; 
    public StackWithMin2(){
        s2 = new Stack<Integer>(); 
    }
    public void push(int value){
        if(value <= min())
            s2.push(value); 
        super.push(value); 
    }
    public Integer pop(){
        int value = super.pop(); 
        if (value == min())
            s2.pop();
        return value; 
             
    }
    public int min(){
        if (this.isEmpty())
            return Integer.MAX_VALUE; 
        else 
            return s2.peek(); 
                
    }
}
