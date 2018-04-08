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
public class LocalMaxMinRevise {
    static void find(int[] a){
        if(a == null || a.length == 0){
            System.out.println("No local maximum or minimum");
            return; 
        }
        int size = a.length; 
        int firstElement = a[0]; 
        int lastElement = a[size-1]; 
        if(firstElement+size-1 == lastElement || firstElement-size-1 == lastElement){
            System.out.println("No local maxima or minima");
            return; 
        }
        if(firstElement < a[1]){
            // local maxima
            int lastShouldBe = firstElement+(size-1); 
            System.out.println(lastShouldBe);
            int localMax = (lastShouldBe + lastElement)/2; 
            System.out.println("local maxima: " + localMax);
        }else{
            // local minima
            int lastShouldBe = firstElement-(size-1); 
            int localMin = (lastShouldBe + lastElement)/2; 
            System.out.println("local minima: " + localMin); 
            
        }
        
    }
    public static void main(String[] args){
        int[] a = {3, 4, 5, 4, 3, 2, 1, 0,-1}; 
        System.out.println(Arrays.toString(a)); 
        find(a); 
        
    }
}
