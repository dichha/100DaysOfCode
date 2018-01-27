/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.treesandgraphs;

/**
 *
 * @author dichha
 */
public class RearrangePositiveNegative {
    static int[] rearrange(int[] list){
        int n = list.length; 
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j>0; j--){
                if(list[j] < list[j-1]){
                    int temp = list[j];
                    list[j] = list[j-1];  
                    list[j-1] = temp;
                }
            }
        }
        return list;
    }
    
    public static void main(String[] args){
        int[] list = {12, 11, -13, -5, 6,21, -7, 5, -3, -6}; 
        int[] sorted = rearrange(list); 
        for(int i: sorted){
            System.out.print(i + " "); 
        }
    }

    
}
