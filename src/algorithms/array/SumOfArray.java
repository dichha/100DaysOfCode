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
public class SumOfArray {
    public int isSumOfArray(int[] list, int sum){
        int n = list.length; 
        for(int i=0; i<n; i++){
            int curSum = list[i];
            for(int j= i+1; j <= n; j++){
                if(curSum == sum){
                    System.out.println("Start: " + i + "End: " + (j-1));
                    return 1; 
                }
                if(curSum > sum || j == n){
                    break; 
                }
                curSum +=  list[j]; 
                       
            }
        }
        return 0; 
    }
}
