/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.bitmanipulation;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author dichha
 */
public class ElementThatAppearsOnce {
    static final int INT_SIZE = 32; 
    static int getSingle(int[] arr, int n){ 
        int result = 0; 
        int x, sum; 
        // Iterate through every bit
        for(int i=0; i<INT_SIZE; i++){ 
            // Find sum of set bit at ith position in all
            sum = 0; 
            x = (1<<i); 
            for (int j=0; j < n; j++){ 
                if((arr[j] & x) == 0)
                    sum++; 
            }
            // The bits with sum not multiple of 3
            // are the bits of elements with single occurence
            if((sum % 3) == 0)
                result |= x;
        }
        return result; 
    }
    static int altGetSingle(int[] arr){
        Set<Integer> unique = new HashSet<Integer>(); 
        int sum = 0; 
                
        for(int i=0; i < arr.length; i++){
            unique.add(arr[i]); 
            sum += arr[i];  
        }
        int uniqueSum = 0;
        Iterator<Integer> it = unique.iterator();
        while(it.hasNext()){
            uniqueSum += it.next(); 

        }
                
        
        int result = (3*uniqueSum - sum)/2; 
        return result; 
    }
    public static void main(String[] args){
        int[] arr = {12, 1, 12, 3,12, 1, 1, 2, 3, 2, 2, 3, 7}; 
        //int[] arr = {3, 5, 5, 5};
        //int res = getSingle(arr, arr.length);
        int rest = altGetSingle(arr); 
        System.out.println("The element with single occurence is: " + rest);
    }
    
    
}
