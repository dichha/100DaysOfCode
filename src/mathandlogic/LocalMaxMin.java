/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathandlogic;

/**
 *
 * @author dichha
 */
public class LocalMaxMin{
    static void find(int[] arr){
        if(arr == null || arr.length == 0){
            System.out.println("No local maxima or minima");
            return; 
        }
        int size = arr.length; 
        int firstElement = arr[0]; 
        int lastElement = arr[size-1];
        
        if(firstElement+size-1 == lastElement || 
           lastElement-size+ 1 == firstElement){
            System.out.println("No local maxima or minima");
            return;
        }
        
        if(firstElement < arr[1]){
            // lets find local maxima
            int lastShouldBe = firstElement+(size-1);
            int localMax = (lastElement + lastShouldBe)/2;
            
            System.out.println(localMax);
        }else{
             // lets find local minima
            int lastShouldBe = firstElement - (size-1); 
            int localMin = (lastElement + lastShouldBe)/2;
            
            System.out.println(localMin);
           
            
        }
            
            
    }
    public static void main(String[] args){
        int[] arr1 = {3, 4, 5, 4, 3, 2, 1, 0, -1}; 
        find(arr1);
        
        int[] arr2 = {-4, -5, -6, -5, -4, -3}; 
        find(arr2);
    }
}
