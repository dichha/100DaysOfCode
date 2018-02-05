/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author dichha
 */

// Sort all even numbers in ascending order and  then 
// sort all odd numbers in descending order

public class SortOddEven {
    static void twoWaySort(Integer[] arr, int n){ 
        // Current indexes from left and right
        int l = 0, r = n-1; 
        // Count of odd numbers
        int k = 0; 
        while(l < r){
            // Find first even number from left side 
            while (arr[l] % 2 != 0){ 
                l++; 
                k++; 
            }
            // find first odd number from right side
            while(arr[r] %2 == 0 && l<r){
                r--; 
            }
            // swap odd number present on left and 
            // even number right
            if (l < r){
                int temp = arr[l]; 
                arr[l] = arr[r]; 
                arr[r] = temp;
            }
        }
        Arrays.sort(arr, 0, k, Collections.reverseOrder());
        Arrays.sort(arr, k, n);
    }
    public static void main(String[] args){
        Integer[] arr = {1, 3, 2, 7, 5, 4}; 
        twoWaySort(arr, arr.length); 
        for(int i: arr){
            System.out.print(i + " ");
        }
    }
}
