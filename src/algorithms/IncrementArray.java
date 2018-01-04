/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

import java.util.Arrays;

/**
 *
 * @author dichha
 */
public class IncrementArray {
    static int[] incrementArray(int[] array){
        int carry = 1; 
        int[] increArr = new int[array.length];
        for (int i=array.length -1; i>=0; i--){
            int sum = array[i] + carry; 
            if(sum == 10)
                carry = 1; 
            else 
                carry = 0; 
            increArr[i] = sum %10; 
        }
        if (carry == 1){
            increArr = new int[array.length + 1]; 
            increArr[0] = 1;
        }
        return increArr;
    }
    public static void main(String[] args){
        int[] arr = {1, 3, 4, 5};
        int[] arr2 = {1, 9, 9}; 
        int[] arr3 = {9, 9, 9};
        System.out.println(Arrays.toString(arr) + " incremented by 1 " + 
                Arrays.toString(incrementArray(arr)));
        
        System.out.println(Arrays.toString(arr2) + " incremented by 1 " + 
                Arrays.toString(incrementArray(arr2)));
        System.out.println(Arrays.toString(arr3) + " incremented by 1 " + 
                Arrays.toString(incrementArray(arr3)));
        
    }
    
}
