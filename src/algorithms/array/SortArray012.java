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
public class SortArray012 {
    static int[] sortArray(int[] arr){
        int count0=0, count1=0, count2 =0; 
        for (int i=0; i < arr.length; i++){
            if (arr[i] == 0)
                count0 ++; 
            if (arr[i] == 1)
                count1 ++; 
            if (arr[i] == 2)
                count2 ++; 
        }
        for (int i=0; i< count0; i++){
            arr[i] = 0;
        }
        for (int i=count0; i < count0+count1; i++){
            arr[i] = 1;
        }
        for (int i=count0+count1; i < count0 + count1 + count2; i++){
            arr[i] = 2;
        }
        return arr; 
    }
    public static void main(String[] args){
        int[] arr = {0,1,1,0,1,2,1,2,0,0,0,1}; 
        int[] sorted = sortArray(arr); 
        for(int i: sorted){
            System.out.print(i + " ");
        }
    }
    
}
