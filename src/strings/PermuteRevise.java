/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

import java.util.Arrays;

/**
 *
 * @author dichha
 */
public class PermuteRevise {
    static void permute(char[] arr, int left, int size){
        if(left == arr.length){
            System.out.println(Arrays.toString(arr));
        }else{
            for(int i=left; i<size; i++){
               swap(left, i, arr); 
               permute(arr, i+1, size); 
               swap(i, left, arr); // revert
            }
        }
        
    }
    static void swap(int a, int b, char[] arr){
        char temp = arr[a];
        arr[a] = arr[b]; 
        arr[b] = temp; 
    }
    /*
    public static void main(String[] args){
        String s = "Algo"; 
        char[] arr = s.toCharArray(); 
        permute(arr, 0, arr.length); 
    }
    */
    
}
