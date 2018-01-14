/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.stacksandqueues;

import java.util.Stack; 
import java.util.ArrayList; 
/**
 *
 * @author dichha
 */
public class SetOfStacks {
    ArrayList<Stack> stacks = new ArrayList<Stack>(); 
    public int capacity; 
    public SetOfStacks(int capacity){
        this.capacity = capacity; 
    }
    
    public void push(int v){
        Stack last = getLastStack();
        if (last != null && last.size() != capacity){
            last.push(v); 
        }else{
            Stack stack = new Stack(capacity); 
            stack.push(v);
        }
        
    }
    public Stack getLastStack(){
        if (stacks.size() == 0) 
            return null;
        return stacks.get(stacks.size()-1); 
    }
    public Integer pop(){
        Stack last = getLastStack(); 
        if (last == null)
            throw new EmptyStackException(); 
        int v = (int)last.pop(); 
        if(last.isEmpty())
            stacks.remove(stacks.size() - 1); 
        return v;  
    }
    

}
