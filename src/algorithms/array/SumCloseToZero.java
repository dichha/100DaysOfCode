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
public class SumCloseToZero {
    static int findSum(int[] arr){
             
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); 
        int i=0; 
        int j=arr.length-1;
        int sum = 0; 
        int posCounter = 0; 
        int negCounter = 0; 
        int closestSoFar = Integer.MAX_VALUE; 
        while(i < j){
            sum = arr[i] + arr[j]; 
            if(sum == 0){
                break; 
            }else if(sum > 0){
                j--; 
               
                if(closestSoFar > sum){
                    closestSoFar = sum; 
                    posCounter=j; 
                    System.out.println("************");
                    System.out.println(closestSoFar);
                }
            }else{
                i++; 
                
                if(Math.abs(sum) < closestSoFar){
                    closestSoFar = sum;
                    negCounter=i; 
                    System.out.println("+++++++++++++"); 
                    System.out.println(closestSoFar); 
                }
                    
            }
     
        }
        System.out.println(arr[posCounter] + " " + arr[posCounter]); 
        return sum; 
        
        
    }
    /*
    public static void main(String[] args){
        int a[] = {1, 4, -5, 3, -2, 5, 10, -6, 20}; 
        int closestSum = findSum(a); 
        System.out.println("sum close to zero in the give array is: " + closestSum); 
    }
    */
    
}
