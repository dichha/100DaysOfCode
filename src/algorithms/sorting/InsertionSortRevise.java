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
public class InsertionSortRevise {
    static void insertionSort(int[] arr){
        for(int i=1; i<arr.length; i++){
            int key = arr[i]; 
            int j=i-1; 
            while((j >=0) && (arr[j] > key)){
                arr[j+1] = arr[j];
                j -= 1; 
            }
            arr[j+1] = key; 
        }
    
    }
    /*
    public static void main(String[] args){
        
        int[] arr = {-1, 2, 3, -14, 6, 8, 10, -12}; 
        insertionSort(arr);
        for(int i: arr){
            System.out.print(i + " ");
        }
    }
    */
}
