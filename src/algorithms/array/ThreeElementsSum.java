/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.array;
import java.util.Arrays; 

/**
 *
 * @author dichha
 */
public class ThreeElementsSum {
    static void find(int[] arr, int k){
        Arrays.sort(arr);
        
        for(int i=0; i<arr.length; i++){
            int x = arr[i]; 
            // the problem is now reduced to 2 numbers in an array whose sum = M 
            // M = k -x and aeeay index 1 to end
            int M = k - x; 
            int start = i+1; 
            int end = arr.length-1; 
            while(start < end){
                int sum = arr[start] + arr[end]; 
                if(sum == M){
                    System.out.println("Found 3 elements whose sume is " + k);
                    System.out.println("Elements are " + arr[i] + " " + arr[start] + " " + arr[end]);
                    return; 
                }else if(sum > M){
                    end --; 
                }else{
                    start ++; 
                }
            }
        }
    }
    /*
    public static void main(String[] args){
        int[] arr = {3, 1, 7, 7, 5, 9, 10}; 
        int k = 22; 
        find(arr, k); 
    }
    */
}
