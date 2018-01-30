/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.bitmanipulation;

/**
 *
 * @author dichha
 */
public class SumXOR {
    // Solution 1: Brute Force
    static int pairORSum(int[] arr, int n){
        int ans = 0; 
        for(int i=0; i < arr.length-1; i++){
            for(int j=i+1; j < arr.length; j++){
                ans +=  arr[i] ^ arr[j];
            }
        }
        return ans; 
        
        
    }
    
    // Optimal: bit manupulation
    static long sumXOR(int[] arr, int n){ 
        long sum = 0; 
        for (int i=0; i < 32; i++){
            int zc = 0; 
            int oc = 0; 
            long idsum = 0; 
            for (int j = 1; j < n; j++){
                if (arr[j] % 2 == 0)
                    zc++; 
                else 
                    oc++; 
                arr[j] /= 2; 
            }
            // calculating individual sum count
            idsum = oc*zc*(1<<i); 
            sum += idsum; 
        }
        return sum; 
    }
    
    public static void main(String[] args){
        int[] arr = {5, 9, 7, 6}; 
        int n = arr.length; 
        System.out.println(pairORSum(arr, n)); 
        
                
    }
    
}
