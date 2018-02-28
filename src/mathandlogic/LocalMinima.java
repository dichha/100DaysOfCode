/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathandlogic;

/**
 *
 * @author dichha
 */
public class LocalMinima {
    // O(n): Naive approach. 
    /*
    static int findLocalMinima(int[] arr){
        int min = Integer.MAX_VALUE;
        int left = 0; 
        int right = 0; 
        if (arr.length == 1)
            return arr[0];
        for(int i=0; i < arr.length; i++){
            if(i-1 > 0){
                left = arr[i-1]; 
                if (left < min)
                    min = left; 
            }
            if(i+1 < arr.length){
                right = arr[i+1];
                if(right < min)
                    min = right;
            }
            
        }
        return min;
    }
    */
    static int findLocalMinima(int[] arr, int start, int end){
        int mid = start + (end-start)/2; 
        int size = arr.length; 
        
        // check the local minima (element is smaller than its left
        // and right neighbours)
        
        if((mid == 0 || arr[mid-1] > arr[mid]) && 
                (mid == size-1 || arr[mid+1] > arr[mid])){
            return arr[mid];
        }
        if(arr[mid-1] < arr[mid]){
            findLocalMinima(arr, start, mid-1);
        }else{
            findLocalMinima(arr, mid+1, end);
        }
              
        return arr[mid]; 
    }
    public static void main(String[] args){
        int[] arr = {11, 4, 2, 5, 11, 13, 5}; 
        //int lm = findLocalMinima(arr);
        int lm = findLocalMinima(arr, 0, arr.length-1);
        System.out.println(lm);
    }
    
}
