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
public class SwappingPairsMakeSumEqual {
    static void  isSwapPairEqual(int[] arr1, int[] arr2){
        int sum1 = 0; 
        int sum2 = 0;
        for(int i=0; i<arr1.length; i++){
            sum1 += arr1[i];
        }
        for(int j=0; j<arr2.length; j++){
            sum2 += arr2[j];
        }
        int newSum1, newSum2 = 0;
        int val1=0, val2 = 0;
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2.length; j++){
                newSum1 = sum1 - arr1[i] + arr2[j]; 
                newSum2 = sum2 - arr2[j] + arr1[i]; 
                if(newSum1 == newSum2){
                    val1 = arr1[i];
                    val2 = arr2[j];
                }
                    
            }
        }
        System.out.print(val1+ " " + val2);
                
        
    }
    public static void main(String[] args){
        int[] arr1 = {4, 1, 2, 1, 1, 2}; 
        int[] arr2 = {3, 6, 3, 3}; 
        
        isSwapPairEqual(arr1, arr2); 
    }
    
}
