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
public class Fibbonaci {
    //Top-down approach
    /*
    static int fibonacci(int n){
        return fibonacci(n, new int[n+1]);
    }
    static int fibonacci(int i, int[] memo){
        if(i == 0 || i == 1)
            return i; 
        if(memo[i] == 0){
            memo[i] = fibonacci(i-1, memo) + fibonacci(i-2, memo);
        }
        return memo[i];
    }
    */
    //Bottom up approach
    static int fibonacci(int n){
        if (n == 0 || n == 1)
            return 1; 
        
        int[] memo = new int[n];
        memo[0] = 1; 
        memo[2] = 1; 
        for(int i=2; i<n; i++){
            memo[i] = memo[i-1] + memo[i-2]; 
        }
        return memo[n-1] + memo[n-2]; 
    }
    
    public static void main(String[] args){
        int n = fibonacci(6);
        System.out.println(n); 
    }
}
