/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix;

/**
 *
 * @author dichha
 */
public class GeorgeCantorNumber{
    static void georgeCantor(int n){
        // counter for numerator
        int i=1; 
        // counter for denominator
        int j=1; 
        // to keep the check of no. of terms
        int k=1; 
        
        // loop till k is not equal to n
        while(k < n){
            j++; 
            k++; 
            /* check if k is already equal to N 
            then the first term is the required rational number
            */
            
            if(k == n)
                break; 
            
    
            /* 
            loop for traversing from right to left
            downwards diagonally
            */
            
            while(j>1 && k < n){
                j--;  // decrement denominator
                i++;  // increment numerator
                
                k++; // counter for no. of terms
            }
            if (k == n)
                break;
            
            i++; // increment numerator
            k++; 
            if (k == n)
                break; 
            
            while(i > 1 && k < n){
                i--; // decrement numerator
                j++; // increment numerator
                k++; 
            } 
        }
        System.out.println(n +"-th term: " + i + "/" + j);
    }
    static void printGCNumber(int r, int c){
        for(int i=1; i<=r; i++){
            for(int j=1; j<=c; j++){
                System.out.print(i + "/"+j + " "); 
            }
            System.out.print("...");
            System.out.println();
        }
     
    }
    /*
    public static void main(String[] args){
        int n=15; 
        georgeCantor(n); 
        printGCNumber(7, 7); 
    }
*/
    
}
