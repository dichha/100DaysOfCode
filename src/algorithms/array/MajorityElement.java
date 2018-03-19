/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 *
 * @author dichha
 */

public class MajorityElement {
    /*
    public static void find(int[] arr){
        boolean found = false; 
        for(int i=0; i<arr.length; i++){
            int x = arr[i]; 
            int count = 1; 
            for(int j=i+1; j< arr.length; j++){
                if(arr[j] == x){
                    count++; 
                }
            }
            if(count > arr.length/ 2){
                System.out.println("Element appearing more than n/2 times: " + x);
                found = true; 
            }
        }
        if(!found)
            System.out.println("No Elements appearning more than n/2 times");
        
    }
    */
    static void find(Integer[] arr){
        Map<Integer, Integer> map = new HashMap<Integer, Integer>(); 
        for(int i: arr){
            if(map.containsKey(i))
                map.put(i, map.get(i)+1);
            else
                map.put(i, 1);
            
        }
        int i=0;
        int maj = arr.length/2; 
        Collection values = map.values();      
     
        Integer[] intArr = (Integer[]) values.toArray(new Integer[values.size()]);
        Arrays.sort(intArr); 
        int maxVal = intArr[intArr.length-1];
        if(maxVal >= maj){
           for(int key: map.keySet()){
               if(map.get(key).equals(maxVal))
                   System.out.println("The number is " + key);
           }
        }else{
            System.out.println("There is no such integer");
        }
        //System.out.println(intArr[(intArr.length-1)]);
   
    }
    /*
    public static void main(String[] args){
        Integer[] arr = {1, 3, 5, 5, 4, 1, 5, 14, 16, 7, 9, 10}; 
        find(arr); 
    }
    */

    
    
}
