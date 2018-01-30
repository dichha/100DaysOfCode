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
public class CheckIfContiguousOrNot {
    static boolean isContiguous(int[] array){
        Arrays.sort(array);
        for(int i=1; i < array.length; i++){
            if((array[i] - array[i-1]) > 1)
                return false; 
        }
        return true; 
    }
    public static void main(String[] args){ 
        int[] array = { 12, 19, 13,15,13,14,17,18,16,20}; 
        boolean isContig = isContiguous(array); 
        System.out.print(isContig);
    }
    
}
