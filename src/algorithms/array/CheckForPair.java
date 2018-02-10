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
public class CheckForPair {
    static boolean checkPairPresence(int[] arr, int n){
        /*
        for (int i=0; i<arr.length; i++){ 
            int p1 = arr[i];
            for(int j=0; j<arr.length; j++){
                if(i != j){
                    int num = arr[j];
                    if ((num + p1) == n)
                        return true; 
                }
            }
        }
        return false; 
        */
        Arrays.sort(arr); 
        int l = 0; 
        int r = arr.length-1; 
        while(l <= r){
            if((arr[l] + arr[r]) == n){
                return true; 
            }else if((arr[l]+ arr[r]) > n){
                r++; 
            }else
                l++; 
        }
        return false;
    }
    
    public static void main(String[] args){
        int[] arr = {2, -3, 2, 7, 9, 3, 2, -3};
        boolean ans = checkPairPresence(arr, 12);
        System.out.print(ans); 
    }
    
    
    
    
}
