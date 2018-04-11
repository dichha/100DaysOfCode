/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countingprobs;

/**
 *
 * @author dichha
 */
public class PermutationsLex {
    public static void show(int[] a){
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]);
        }
        System.out.println(); 
    }
    public static void swap(int[] a, int i, int j){
         int t = a[i]; 
         a[i] = a[j]; 
         a[j] = t; 
    }
    
    public static boolean hasNext(int[] a){
        int n = a.length; 
        
        // find rightmost element a[k] that is smaller than element to its 
        // right
        int k; 
        for(k=n-2; k >= 0; k--)
            if(a[k] < a[k+1]) break; 
            
        if(k == -1) return false; 
        
        // find right most element a[j] that is larger than a[k]
        int j = n-1; 
        while(a[k] > a[j])
            j--; 
        swap(a, j, k); 
        
        for(int r=n-1, s=k+1; r > s; r--, s++)
            swap(a, r, s); 
        return true; 
                
        
    }
    public static void perm(int[] a){ 
        show(a); 
        while(hasNext(a)){
            show(a); 
        }
    }
    public static void main(String[] args){
        int[] a = {0, 1, 2}; 
        perm(a); 
    }
}
