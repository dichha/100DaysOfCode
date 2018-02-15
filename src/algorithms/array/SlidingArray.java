/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.array;

import java.util.Deque;
import java.util.LinkedList;

/**
 *
 * @author dichha
 */
public class SlidingArray {
    
    static  void slidingWindow(int[] arr, int k){
        /*
        for(int i=0; i<=arr.length-k; i++){
            int max = arr[i]; 
            for(int j=1; j<k; j++){
                max = arr[i+j] > max ? arr[i+j]: max;
            }
            System.out.print( max + " ");
        }
        System.out.println(); 
    }
    */
    Deque<Integer> deque = new LinkedList<>(); 
    
    // Step 1: handle first k elements in sliding window
    for(int i=0; i<k; i++){
        while(deque.isEmpty()==false && arr[deque.peekLast()] <= arr[i]){
            deque.removeLast();
        }
        // add new element at the end
        deque.addLast(i); 
    }
    
    // Step 2: handle rest of the element, one at a time nums[k] to nums[n-1]
    for(int i=k; i <arr.length; i++){
        // Before we do anything, print the first element in deque
        // since its a maximum among previous k; 
        System.out.print(arr[deque.peekFirst()] + " "); 
        
        // Now remove the elements which are out for newxt window (next k elements)
        while(deque.isEmpty() == false && deque.peekFirst()<=i-k)
            deque.removeFirst(); 
        
    // Add the next element in the window = index i 
    // remove all the elements which are smaller than the next elements = index i

    while(deque.isEmpty() == false && arr[deque.peekLast()] <= arr[i])
        deque.removeLast(); 
    
    // add new element at the end
    deque.addLast(i); 
    }

        
}
    public static void main(String[] args){
        // int[] arr = {1, 2, 3, 2, 4, 1, 5, 6, 1}; 
        int[] arr = {11, 12, 13, 12, 14, 11, 10, 9}; 
        int k = 3; 
        slidingWindow(arr, k); 
    }
    
}
