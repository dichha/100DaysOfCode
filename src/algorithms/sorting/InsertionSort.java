/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.sorting;

/**
 *
 * @author dichha
 */
public class InsertionSort{
    static int[] insertionSort(int[] arr){
        int idx = 0; 
        for(int j = 0; j<arr.length-1; j++){
            for(int i=j+1; i<arr.length; i++){
                if (arr[i] < arr[i-1]){
                    idx = i; 
                     while(idx >0){
                        int temp = arr[idx-1];
                        arr[idx-1] = arr[idx]; 
                        arr[idx] = temp; 
                        idx--; 
                     }
                }
                
            }
        }
        return arr; 
    }
    public static void main(String[] args){
        int[] arr = {39, 47, 38, -3, 4, 2}; 
        int[] sorted = insertionSort(arr); 
        for(int i: sorted){
            System.out.print(i + " "); 
        }
    }
}
