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
public class HeapSort {
    static void sort(int[] arr){
        int n = arr.length; 
        // Build heap (rearrange)
        for(int i=n/2-1; i >= 0; i--){
            heapify(arr, n, i);
        }
        // one by one extract an element from heap
        for(int i=n-1; i>=0; i--){
            // move current root to end
            swap(i, 0, arr); 
            
            // call max heapify on the reduced heap
            heapify(arr, i, 0); 
        }
    }
    static int left(int i){
        return 2*i+1; 
    }
    static int right(int i){
        return 2*i+2; 
    }
    static void swap(int parent, int b, int[] arr){
        int tmp = arr[parent]; 
        arr[parent] = arr[b]; 
        arr[b] = tmp; 
        
    }
    static void heapify(int[] arr, int n,  int i){
        int lc = left(i);
        int rc = right(i);
        int biggest = Integer.MIN_VALUE; 
        if(lc < n && arr[lc] > arr[i]){
            biggest = lc; 
        }else{
            biggest = i; 
        }
        if(rc < n && arr[rc] > arr[biggest]){
            biggest = rc; 
        }
        if(biggest != i){
            swap(i, biggest, arr); 
            heapify(arr, n, biggest); 
        }
    } 
    static void printArray(int[] arr){
        for(int i: arr){
            System.out.print(i + " ");
        }
        System.out.println(); 
    }
    /*
    public static void main(String[] args){
        int[] arr = {12, 11, 13, 5, 6, 7}; 
        int n = arr.length; 
        sort(arr); 
        System.out.println("Sorted array is");
        printArray(arr); 
    }
    */
}
