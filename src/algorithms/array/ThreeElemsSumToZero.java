/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.array;

import java.util.Arrays;
import java.util.HashSet;

/**
 *
 * @author dichha
 */
public class ThreeElemsSumToZero {
    /*
    static void find(int[] a){
        for(int i=0; i< a.length; i++){
            for(int j=i+1; j< a.length; j++){
                for(int k=j+1; k < a.length; k++){
                    if(a[i]+a[j]+a[k] == 0){
                        System.out.println("Elements are " + a[i] + " " + a[j] + " " + a[k]);
                        return;
                    }
                }
            }
        }
    }*/
    /*
    static void find(int[] a){
        Arrays.sort(a); 
        
        for(int i=0; i<a.length; i++){
            int one = a[i]; 
            // now problem is to find two numbers in an array whose sum = -a 
            int sum = -one;
            int start = i+1; 
            int end = a.length - 1;
            while(start < end){
                int tempSum = a[start] + a[end]; 
                if (tempSum == sum){
                    System.out.println("Found 3 elements whose sum is = 0");
                    System.out.println("Elements are " + one + " " + a[start] + " " + a[end]);
                    return; 
                }else if(tempSum  < sum)
                    start++;
                else
                    end--; 
            }
            
        }
    }
    */
    static void find(int[] arr){
        for(int i=0; i<arr.length; i++){
            int a = arr[i]; 
            HashSet<Integer> set = new HashSet<Integer>(); 
            for(int j=i+1; j< arr.length; j++){
                int b = arr[j]; 
                int c = -(a+b); 
                if(set.contains(c)){
                    System.out.println("Found 3 elements whose sum is 0");
                    System.out.println("Elements are " + a + " " + b + "  " + c); 
                    return; 
                }else{
                    set.add(b); 
                }
            }
        }
    }
    public static void main(String[] args){
        int[] a = {3, -1, -7, -4, -5, 9, 10}; 
        find(a); 
    }
    
}
