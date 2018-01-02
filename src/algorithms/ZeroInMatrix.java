/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

/**
 *
 * @author dichha
 */
public class ZeroInMatrix {
    static void setZeros(int[][]matrix){
        boolean[] rows = new boolean[matrix.length]; 
        boolean[] cols = new boolean[matrix[0].length];
        
        for(int i=0; i < matrix.length; i++){
            for(int j=0; j < matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    rows[i] = true; 
                    cols[j] = true; 
                }
            }
        }
        // nullify rows
        for(int i=0; i < rows.length; i++){
            if(rows[i])
                nullifyRow(matrix, i);
        }
        // nullify cols
        for(int j=0; j < cols.length; j++){
            if(cols[j])
                nullifyCols(matrix, j);
        }
    }
    private static void nullifyRow(int[][]matrix, int row){
        for (int col=0; col < matrix[0].length; col++){
            matrix[row][col] = 0;
        }
    }
    private static void nullifyCols(int[][]matrix, int col){
        for(int row=0; row < matrix.length; row++){
            matrix[row][col] = 0;
        }
    }
    static void displayMatrix(int[][]matrix){
        for (int row=0; row<matrix.length; row++){
            for(int col=0; col < matrix[0].length; col++){
                System.out.print(" " + matrix[row][col]);
                
            }
            System.out.println();
        }
    }
    
    /*public static void main(String[] args){
        int[][]matrix = {
            {1, 2, 3, 6, 8, 10},
            {11, 3, 0, 99, -1, 23}, 
            {9, -12, 34, 1, 8, 9},
            {0, 23, 1, 1, 1, 1}
        };
        
        setZeros(matrix); 
        displayMatrix(matrix);
        
    }*/
    
    // Instead of using MN space, we could also use to O(1) space by using first 
    // col and row keep track of which row and col has 0 and nullify them later. 
     
    
}
