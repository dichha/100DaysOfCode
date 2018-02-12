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
    }
    public static void main(String[] args){
        int[] arr = {7, 10, 4, 3, 20, 15}; 
        int n = kthSmallest(arr, 3);
        System.out.print(n);
    }
    
}
