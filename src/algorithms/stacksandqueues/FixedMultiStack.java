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
public class FixedMultiStack {
    private int numberOfStacks = 3; 
    private int stackCapacity; 
    private int[] values; 
    private int[] sizes; 
    
    public FixedMultiStack(int stackSize){
        stackCapacity = stackSize; 
        values = new int[stackCapacity * numberOfStacks]; 
        sizes = new int[numberOfStacks];
    }
    // Push value onto stack 
    public void push(int stackNum, int num) throws FullStackException{
        // Check that we have space for the next element 
        if(isFull(stackNum))
            throw new FullStackException(); 
        // Increment stack pointer and then update the top value
        sizes[stackNum] ++; 
        values[indexOfTop(stackNum)] = num; 
        
    }
    // Pop item from the top stack 
    public int pop(int stackNum){
        if(isEmpty(stackNum)) 
                throw new EmptyStackException(); 
        
        int topIndex = indexOfTop(stackNum); 
        int value = values[topIndex]; 
        values[topIndex] = 0; 
        sizes[stackNum]--; 
        return value; 
    }
    // Return top element 
    public int peek(int stackNum){
        if(isEmpty(stackNum))
            throw new EmptyStackException(); 
        return values[indexOfTop(stackNum)]; 
    }
    public boolean isEmpty(int stackNum){
        return sizes[stackNum] == 0; 
    }
    public int indexOfTop(int stackNum){
        // Returns index of the top of the stack 
        int offset = stackNum * stackCapacity; 
        int size = sizes[stackNum]; 
        return offset+size-1; 
    }
    
    public boolean isFull(int stackNum){
        return sizes[stackNum] == stackCapacity; 
    }
}
