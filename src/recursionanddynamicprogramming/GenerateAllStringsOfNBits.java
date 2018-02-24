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
public class GenerateAllStringsOfNBits {
    int[] arrA; 
    public GenerateAllStringsOfNBits(int n){
        arrA = new int[n];
    }
    
    public void nBits(int n){
        if(n <= 0)
            System.out.println(Arrays.toString(arrA));
        else{
            arrA[n-1] = 0; 
            nBits(n-1); 
            arrA[n-1] = 1; 
            nBits(n-1);
        }
        
    }
    public static void main(String[] args){
        int n= 3; 
        GenerateAllStringsOfNBits i = new GenerateAllStringsOfNBits(n); 
        i.nBits(n);
    }
    
}
