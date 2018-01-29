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
public class MergeSort {
    static void merge(int[] arr, int start, int mid, int end){
        int n1 = mid - start +1; 
        int n2 = end - mid;
        
        // Create 1 temp arrays; 
        int L[] = new int[n1]; 
        int R[] = new int[n2]; 
        
        for (int i=0; i< n1; i++){
            L[i] = arr[start+i]; 
        }
        
        for(int j=0; j<n2; j++){
            R[j] = arr[mid+1+j];
        }
        
        // Merge the temp arrays; 
        int i=0; 
        int j=0;
        
        int k = start; 
        while(i < n1 && j < n2){
            if (L[i] <= R[j]){
                arr[k] = L[i]; 
                i++; 
                 
            }else{
                arr[k] = R[j];
                j++; 
            }
            k++; 
        }
        // copy remaining elements of L[] 
        while (i < n1){
            arr[k] = L[i];
            i++; 
            k++; 
        }
        // copy remaining elements of R[]
        while (j < n2){
            arr[k] = R[j];
            j++; 
            k++; 
        }
        
        
        
        // 
        
    }
    
    static void sort(int[] arr, int start, int end){
        if(start < end){
            int m = (start + end)/2; 
            sort(arr, start, m);
            sort(arr, m+1, end); 
            merge(arr, start, m, end); 
        }
        
    }
    public static void main(String[] args){
        int[] arr = {-4, 3, 232, -42, 30, 42, 4, 0, 3, 22, 15};
        sort(arr, 0, arr.length-1);
        
        for(int i: arr){
            System.out.print(i + " "); 
        }
    }
    
}
