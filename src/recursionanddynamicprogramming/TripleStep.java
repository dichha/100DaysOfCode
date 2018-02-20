/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursionanddynamicprogramming;

import java.util.Arrays;

/**
 *
 * @author dichha
 */
public class TripleStep {
    /*
    static int countWays(int i){
        if(i < 0)
            return 0; 
        else if (i == 0)
            return 1; 
        else 
            return countWays(i-1) + countWays(i-2) + countWays(i-3);
    }
*/
    static int countWays(int n, int[] memo){
         if (n < 0)
            return 0; 
        else if(n == 0)
            return 1; 
        else if (memo[n] > -1){
            return memo[n];
            
        }else{
            memo[n] = countWays(n-1, memo) + countWays(n-2, memo) + countWays(n-3, memo);
            return memo[n];
        }
         
        
    }
    static int countWays(int n){
        int[] memo = new int[n+1]; 
        Arrays.fill(memo, -1);
        return countWays(n, memo);
       
    }
    public static void main(String[] args){
        int n=4; 
        int total = countWays(n);
        System.out.println(total);
        
    }
    
}
