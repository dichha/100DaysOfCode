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
public class KthSmallesElement {
    /*
    static int kthSmallest(int[] arr, int k){
        for(int i=0; i < arr.length; i++){ 
            for(int j=1; j < arr.length-i; j++){
                if(arr[j-1] > arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j]; 
                    arr[j] = temp;
                }
            }
        }
        return arr[k-1]; 
    }*/
    static void swap(int[] arr, int a, int b){
        int temp = arr[a]; 
        arr[a] = arr[b]; 
        arr[b] = temp; 
    }
    static int partition(int[] arr, int l, int r){
        int x = arr[r]; 
        int i = l; 
        for(int j = l; j <= r-1; j++){
            if (arr[j] <= x){
                swap(arr, i, j);
                i++; 
            }
        }
        swap(arr, i, r); 
        return i; 
    }
    
    static int kthSmallest(int[] arr, int l, int r, int k){
        // if k is smaller than number of elements in array
        if(k > 0 && k <= r-l+1){
            // partiion the array around last 
            // element and get position of pivot
            // element in sorted array
            int pos = partition(arr, l, r);
            if(pos-1 == k-1)
                return arr[pos]; 
            
            // if position is more , recur for left subarray
            if ((pos -1) > (k-1))
                return kthSmallest(arr, l, pos-1, k); 
            
            // Else recur for right subarray
            return kthSmallest(arr, pos+1, r, k-pos+l-1);
            
            
        }
        return Integer.MAX_VALUE;
    }
    
    public static void main(String[] args){
        int[] arr = {7, 10, 4, 3, 20, 15}; 
        int n = kthSmallest(arr, 0, arr.length-1, 3);
        System.out.print(n);
    }
    
}
