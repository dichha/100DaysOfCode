/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

/**
 *
 * @author dichha
 */
public class PermutationOfStrings {
    public void permutation(char[] arr, int left, int size){
        int x; 
        if(left == size){
            for(int i=0; i<size; i++){
                System.out.print(arr[i]);
            }
            System.out.print(" "); 
        }else{
            // swap st each char is at first position 
            for( x=left; x<size; x++){
                swap(arr, left, x);
                // permute the remaining chars 
                permutation(arr, left+1, size); 
                
                // revert back to original 
                swap(arr, left, x); 
            }
        }
        
    }
    public void swap(char[] arr, int i, int j){
        char c = arr[i]; 
        arr[i] = arr[j]; 
        arr[j]= c; 
    }
    
    /*
    public static void main(String[] args){
        String s = "abc"; 
        char[] arr = s.toCharArray(); 
        
        PermutationOfStrings ps = new PermutationOfStrings(); 
        ps.permutation(arr, 0, arr.length); 
    }
    */
            
    
}
