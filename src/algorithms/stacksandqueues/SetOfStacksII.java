/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.stacksandqueues;

import java.util.ArrayList; 
/**
 *
 * @author dichha
 */
public class SetOfStacksII {
    ArrayList<Stack> stacks = new ArrayList<Stack>(); 
    public int capacity; 
    public SetOfStacksII(int capacity){
        this.capacity = capacity; 
    }
    public Stack getLastStack(){
        if(stacks.size() == 0) throw new EmptyStackException(); 
        return stacks.get(stacks.size()-1); 
    }
    public void push(int value){
        Stack last = getLastStack(); 
        if( last != null && !last.isFull())
            last.push(value); 
        else{
             Stack stack = new Stack(capacity); 
             stack.push(value);
             stacks.add(stack); 
        }
            
    }
    public int pop(){
        Stack last = getLastStack(); 
        int value = last.pop(); 
        if(last.isEmpty())
            stacks.remove(stacks.size()-1); 
        return value; 
    }
    public boolean isEmpty(){
        Stack last = getLastStack(); 
        return last == null || last.isEmpty();
    }
    public int popAt(int index){
        return leftShift(index, true);
    } 
    public int leftShift(int index, boolean removeTop){
        Stack stack = stacks.get(index); 
        int removed_item; 
        
        if(removeTop)
            removed_item = stack.pop(); 
        else
            removed_item = stack.removeBottom();
        
        if (stack.isEmpty())
            stacks.remove(stacks.size()-1); 
        else if(stacks.size() >= index+1){
            int v = leftShift(index+1, false);
            stack.push(v);
        }
        return removed_item; 
    }
    
}
