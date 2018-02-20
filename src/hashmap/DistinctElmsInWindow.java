/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author dichha
 */
public class DistinctElmsInWindow {
    
    static void countDistinctElms(int[] arr, int k){
        for(int i=0; i < arr.length; i++){
            if((i+k) <= arr.length){
                int count = 0; 
                List<Integer> presence = new ArrayList<Integer>();  
                for(int j=i; j < i+k; j++){
                    if(!presence.contains(arr[j]))
                        count++; 
                        presence.add(arr[j]);
                    
                }
                System.out.print(count + " ");
            }
        }
        System.out.println();
    }

    /*
    static int countWindowDistinct(int[] arr, int k){
        int count = 0; 
        for(int i=0; i < k; i++){
            int j;
            for(j=0; j < i; j++){
               if(arr[i] == arr[j])
                   break;
            }
            if(i == j)
                count++;
        }
        return count; 
    }
    static void countDistinctElms(int[] arr, int k){
        for (int i=0; i<=arr.length-k; i++){
            System.out.println(countWindowDistinct(Arrays.copyOfRange(arr, i,arr.length), k));
        }
    }
    */
    /*
    // Counts distinct elements in window of size k
    static int countWindowDistinct(int win[], int k)
    {
        int dist_count = 0;
      
        // Traverse the window
        for (int i = 0; i < k; i++)
        {
            // Check if element arr[i] exists in arr[0..i-1]
            int j;
            for (j = 0; j < i; j++)
               if (win[i] == win[j])
                  break;
            if (j == i)
                dist_count++;
        }
        return dist_count;
    }
      
    // Counts distinct elements in all windows of size k
    static void countDistinctElms(int arr[],int k)
    {
        // Traverse through every window
        for (int i = 0; i <= arr.length - k; i++)
           System.out.println(countWindowDistinct
                              (Arrays.copyOfRange(arr, i, arr.length), k));
    }
    */
    public static void main(String[] args){
        int[] arr = {1, 2, 1, 3, 4, 2, 3};
        int k = 4; 
        countDistinctElms(arr, k); 
    }
}
