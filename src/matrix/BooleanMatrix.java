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
public class BooleanMatrix {
    static void modifyMatrix(int[][] mat, int r, int c){
        int[] row = new int[r]; 
        int[] col = new int[c]; 
        
        // initialize all values of row[] as 0
        for(int i=0; i<r; i++){
            row[i] = 0; 
        }
        // initialize all values of col[] as 0
        for(int i=0; i<c; i++){
            col[i] = 0; 
        }
        
        // store the rows and columns to be marked as 1 in row[]
        // and col[] respectively
        
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(mat[i][j] == 1){
                    col[i] = 1; 
                    row[i] = 1;
                }
                    
            }
        }
        // Modify the input matrix mat[] using the above constructed
        // row[] and col[] arrays
        
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(row[i] == 1 || col[j] == 1){
                    mat[i][j] = 1; 
                }
            }
        }
    }
    static void printMatrix(int[][] mat, int r, int c){
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
               System.out.print(mat[i][j]); 
            }
            System.out.println();
        }
    }
    /*
    public static void main(String[] args){
        int[][] mat = {{1, 0, 0, 1}, 
                       {0, 0, 1, 0},
                       {0, 0, 0, 0},}; 
        System.out.println("Matrix Initially");
        printMatrix(mat,3, 4);
        
        modifyMatrix(mat, 3, 4);
        System.out.println("Matrix after modification n");
        printMatrix(mat, 3, 4); 
        }
    }
    */
    
    
}
