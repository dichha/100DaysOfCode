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
public class SelectionSortRevise{
	public static void 
        selectionSort(int[] arr){
		for(int i=0; i<arr.length; i++){
			int smaller = arr[i];
			int idx = -1; 
			for(int j = i+1; j <arr.length-1; j++){
				int num = arr[j]; 
				
				if(num < smaller){
					smaller = num; 
					idx = j; 
				}
			}
			if(smaller != arr[i]){
				int temp = arr[i];
				arr[i] = smaller; 
				arr[idx] = temp; 
				
			}

			
		}
                
	}
        /*
	public static void main(String[] args){
		int[] arr = {3, -2, 4, 5, 6, 7, 9}; 
		selectionSort(arr); 
                for(int i: arr){
                    System.out.print(i + " "); 
                }

	}
        */
}
