/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathandlogic;

/**
 *
 * @author dichha
 */
public class PascalTriangle {
    
    /*
    // Function to print fist n lines of Pascal's triangle
    static void printPascal(int n){
        // Iterate through every line and print entries in it
        for(int line=0; line < n; line++){
            for(int i=0; i<=line; i++){
                System.out.print(binomialCoef(line, i) + " ");
            }
            System.out.println();
        }
    }
    static int binomialCoef(int n, int k){
        int res = 1; 
        if(k > n-k)
            k = n-k; 
        for(int i=0; i<k; i++){
            res *= (n-i); 
            res /= (i+1);
        }
        return res; 
    }
    */
    static void printPascal(int n){
        int[][] pascal = new int[n][n];
        for (int line=0; line<n; line++){
            for(int i=0; i<=line; i++){
                if(line == i || i==0){
                    pascal[line][i] = 1;
                }else{
                    pascal[line][i] = pascal[line-1][i-1] + pascal[line-1][i];
                }
                System.out.print(pascal[line][i] + " ");
                
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args){
        int n= 7; 
        printPascal(n);
    }
    
}
