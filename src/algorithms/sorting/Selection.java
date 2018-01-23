/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.sorting;

/**
 *
 * @author dichha
 */
public class Selection {
    static int[] selectionSort(int[] list){
        int[] sorted = new int[list.length];
        
        for(int i=0; i<list.length-1; i++){
            int minIdx = i; 
            for (int j=i+1; j<list.length; j++){
                if (list[j] < list[minIdx]){  
                    int tmp = list[minIdx]; 
                    list[minIdx] = list[j];
                    list[j] = tmp; 
                }  
            }
           
            
        }
        return list; 
    }
    public static void main(String[] args){
        int[] list = {99, 23, -90, 60, -16, 12};
        int[] sorted = selectionSort(list); 
        for (int i: sorted)
            System.out.print(i + " ");
        
        
    }
    
}
