/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.array;

import java.util.HashMap;

/**
 *
 * @author dichha
 */
public class MaxSubArrayWithZeroSum {
    /*
    static int maxLen(int[] arr){
        int maxLen=0; 
        for(int i=0; i<arr.length; i++){
            int sum = 0;
            for(int j=i; j<arr.length; j++){
                sum += arr[j];
                
                // If currSum becomes 0, then update maxLen
                // If required 
                if(sum == 0)
                    maxLen = Math.max(maxLen, j-i+1); 
            }
        }
        
        return maxLen; 
    }
    */
    static int maxLen(int[] arr){
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>(); 
        int sum = 0; // initialize sum of elements; 
        int maxLen = 0; // initialize result
        
        //Traverse through the given array
        for(int i=0; i<arr.length; i++){
            // Add current element to run
            sum += arr[i]; 
            if(arr[i] == 0 && maxLen == 0)
                maxLen = 1; 
            
            if(sum == 0){
                maxLen = i + 1;
            }
            
            // Look this sum in hash table
            Integer prev = hm.get(sum); 
            
            // if this sum is seen before, then update maxLen
            // if required
            if(prev != null)
                maxLen = Math.max(maxLen, i-prev);
            else
                hm.put(sum, i); 
            
            
        }
        return maxLen; 
    }
    /*
    public static void main(String[] args){
        int[] arr = {15, -2, 2, -8, 1, 7, 10, 23}; 
        int count = maxLen(arr);
        System.out.println(count);
    }
    */
    
}
