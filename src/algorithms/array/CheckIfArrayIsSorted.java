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
public class CheckIfArrayIsSorted {
    public static boolean isSorted(int[] a, int n){
       
       if(a.length-1==0 || n == 1 ){
           
           return true;
       }
       
       if(a[n-1] < a[n-2])
           return false;
       
       return isSorted(a, n-1); 
     
       
        
       
       
    }
    public static void main(String[] args){
        int[] a = {11, 12, 14, 15, 117, 99}; 
        boolean sorted = isSorted(a, a.length); 
        System.out.println(sorted); 
    }
}
