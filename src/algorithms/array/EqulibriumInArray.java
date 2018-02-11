/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.array;

/**
 *
 * @author dichha
 */
public class EqulibriumInArray {
    static int findEquilibrium(int[] arr){ 
        int totalSum = 0;
        for(int i=0; i<arr.length; i++){
            totalSum += arr[i];
        }
        int leftSum = 0;
        for(int i=0; i<arr.length; i++){
            totalSum -= arr[i]; 
            if(leftSum ==  totalSum)
                return arr[i];
            
            leftSum += arr[i]; 
            
        }
        return -1; 
    }
    public static void main(String[] args){
        int[] arr =  {-7,1, 5, 2,1,3,4, 5, -4, -3, 0}; 
        int e = findEquilibrium(arr);
        System.out.println(e);
    }
    
}
