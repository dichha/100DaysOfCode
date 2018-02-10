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
public class SubsetSum {
    static boolean isSubsetSum(int[] arr, int n, int sum){
        if(sum == 0)
            return true; 
        else if(sum != 0 && n == 0)
            return false; 
        if(arr[n-1] > sum)
            return isSubsetSum(arr, n-1, sum); 
        return isSubsetSum(arr, n-1, sum) || isSubsetSum(arr, n-1, sum - arr[n-1]);
        
    }
    public static void main(String[] args){ 
        int[] arr = {-2, 4, 3, 23, 4, 0, 5, -12, 3}; 
        boolean ans = isSubsetSum(arr, arr.length, 15); 
        System.out.print(ans); 
    }
}
