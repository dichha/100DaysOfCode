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
public class QuickSort {
    
    static int partition(int[] list,  int low, int high){
        int i = low-1; 
        int pivot = list[high];
        for(int j=low; j<high; j++){
            if(list[j] <= pivot){
                i++;
                int temp = list[i]; 
                list[i] = list[j]; 
                list[j] = temp;
                
            }
        }
        int temp = list[i+1]; 
        list[i+1] = list[high];
        list[high] = temp; 
        return i +1; 
    }
    static int[] sort(int[] list, int low, int high){
        if (low < high){
            int par = partition(list, low, high); 
            sort(list, low, par-1); 
            sort(list, par+1, high);
        }
        return list; 
    }
    public static void main(String[] args){
        int[] list = {34, -23, 43, 34, 90, -15, 38, -73, 34}; 
        int[] sorted = sort(list, 0, list.length-1); 
        for(int i: sorted){
            System.out.print(i + " "); 
        }
    }
}
