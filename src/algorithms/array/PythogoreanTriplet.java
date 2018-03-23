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
public class PythogoreanTriplet {
    /*
    static boolean containsPythoTriplets(int[] arr){
        for(int i=0; i<arr.length-2; i++ ){
            for(int j=i+1; j<arr.length-1; j++){
                int s = (arr[i]*arr[i]) + (arr[j] *arr[j]);
                System.out.println(s);
                for(int k=0; k<arr.length; k++){
                    if(((arr[k]*arr[k]) == s) && (k != i) && (k != j)){
                        System.out.println(arr[i] + " " + arr[j] + " = " + arr[k]);
                        return true;
                    }
                }
            }
        }
        return false; 
    }*/
    static boolean containsPythoTriplets(int[] arr){
        int[] squared = new int[arr.length]; 
        for(int i=0; i<arr.length; i++){
            squared[i] = (int)Math.pow(arr[i], 2); 
        }
        Arrays.sort(squared);
        for(int i=0; i<squared.length; i++){
            for(int j=i+1; j<squared.length; j++){
                int sum = (int) (Math.pow(arr[i], 2) + Math.pow(arr[j], 2));
                for(int k=j+1; k<squared.length; k++){
                    if(squared[k] == sum){
                        return true; 
                    }
                    if(squared[k] > sum)
                        break; 
                }
            }
        }
        
        return false; 
    }
    /*
    public static void main(String[] args){
        int[] arr = {3, 2, 4,6,9}; 
        boolean ans = containsPythoTriplets(arr);
        System.out.println("contains triplets? " + ans);
    }
    */
    
}
