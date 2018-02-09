/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.array;

/**
 *
 * @author dichha
 */
public class LongestSubstringContainingOne {
    static int longestOne(int[] arr){
        int count = 0; 
        int max = Integer.MIN_VALUE; 
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 1)
                count += 1; 
            if(count > max){
                max = Math.max(count, max);
            }
            if(arr[i] != 1)
                count = 0; 
        }
                
        return max; 
    } 
    public static void main(String[] args){
        int[] arr = {1, 0, 1, 1, 2, 1, 1, 1,4, 1, 1, 1, 1, 0};
        int longestSub = longestOne(arr);
        System.out.print(longestSub + " ");
    }
    
}
