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
public class ClockwiseSpiral {
   
    public static void print(int[][] mat){
            int r = mat.length; 
            int c = mat[0].length; 

            int rInc = 0;  // counter for the increasing row
            int cInc = 0;  // counter for increasing column
            
            // doing loop until rInc and cInc reaches to its max
            while(rInc < r && cInc < c){
                    // left -> right
                    for(int i=rInc; i<c; i++){
                            System.out.print(mat[rInc][i] + " ");
                    }
                    rInc ++; // disregardiong top row
                    
                    //top -> down
                    for(int i=rInc; i < r; i++){
                            System.out.print(mat[i][c-1] + " "); 
                    }
                    c--; // disregarding last column
                    
                    // right -> left
                    for(int i=c-1; i>=cInc; i--){
                            System.out.print(mat[r-1][i] + " ");
                    }
                    r--; // disregarding last row
                    
                    // down -> top
                    for(int i=r-1; i>=rInc; i--){
                            System.out.print(mat[i][cInc] + " "); 	
                    }
                    cInc++; // disregarding 1st column

            }
    }
    public static void main(String[] args){
            int[][] mat = {{1, 2, 3, 4}, 
                           {5, 6, 7, 8},
                           {9, 10, 11, 12}, 
                           {13, 14, 15, 16}
                           };
            print(mat); 
    }

    
}
