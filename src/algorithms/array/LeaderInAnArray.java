/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.array;

import java.util.ArrayList;

/**
 *
 * @author dichha
 */
public class LeaderInAnArray {
    static ArrayList<Integer> leader(int[] arr, int size){
        ArrayList<Integer> leader = new ArrayList<Integer>(); 
        
        for (int i=0; i < size-1; i++){ 
            boolean lead = true; 
            int num = arr[i];
            for(int j=i+1; j<size; j++){
                if(num <= arr[j]){
                    lead = false; 
                    break;
                }
                
            }
            if(lead)
                leader.add(num); 
        }
        leader.add(arr[size-1]);
        return leader; 
    }  
    
    // sol #2: scan from right and keep track of max till now
     
    static ArrayList<Integer> leaderII(int[] arr, int size){ 
        ArrayList<Integer> leader = new ArrayList<Integer>(); 
        leader.add(arr[size-1]); 
        int maxSoFar = arr[size-1]; 
        for(int i = size-2; i >= 0; i--){ 
            if(arr[i] > maxSoFar ){
                maxSoFar = arr[i]; 
                leader.add(arr[i]);
            }
        }
        return leader; 
    }
   
    public static void main(String[] args){
        int[] arr = {16, 17, 4, 3, 5, 2}; 
        ArrayList<Integer> leader = leaderII(arr, arr.length); 
        for(int i: leader)
            System.out.print(i + " ");
    }
}
