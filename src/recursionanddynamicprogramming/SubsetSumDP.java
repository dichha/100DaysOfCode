/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursionanddynamicprogramming;

/**
 *
 * @author dichha
 */
// A Dynamic Programming solution for subset sum problem
public class SubsetSumDP {
    // Returns true if there is a subset of arr[] w/ sum equal to a given sum
    static boolean isSubsetSum(int[] arr, int n, int sum){
        
        // The value of subset[i][j] will be true if there is a subset of 
        // set[0..j-1] w/ the sum equal to i
        boolean subset[][] = new boolean[sum+1][n+1];
        
        // If sum is 0, then answer is true
        for(int i=0; i <= n; i++)
            subset[0][i] = true; 
        
        // If sum is not 0 and set is empty, then answer is false
        for(int i=1; i <= sum; i++){
            subset[i][0] = false; 
        } 
        
        // Fill the subset table in bottom up manner
        for(int i=1; i <= sum; i++){
            for(int j=1; j <= n; j++){
                subset[i][j] = subset[i][j-1];
                if( i >= arr[j-1])
                    subset[i][j] = (subset[i][j] || subset[i-arr[j-1]][j-1]);
            }
        }
        
        for(int i=0; i <= sum; i++){
            for(int j=0; j <= n; j++){
                System.out.println(subset[i][j]);
            }
        }
        return subset[sum][n];
        
        
        
    }
    public static void main(String[] args){
        int[] arr = {3, 34, 4, 12, 5, 2};
        int sum = 9; 
        int n = arr.length; 
        
        if(isSubsetSum(arr, n, sum) == true)
            System.out.println("Found a subset w/ given sum");
        else
            System.out.println("No subset w/ given sum");
        
        
        
    }
}
