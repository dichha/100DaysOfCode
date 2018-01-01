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
public class PerpendicularMatrixRotatioin {
    static void rotateMatrix(int[][] matrix, int n){
        for (int layer=0; layer < n/2; layer++){
            int first = layer; 
            int last = n-layer-1;
            for (int i=first; i<last; i++){
                int offset = i-first; 
                // save top
                int top = matrix[first][i];
                // left ->  top
                matrix[first][i] = matrix[last-offset][first];
                // bottom -> left
                matrix[last-offset][first] = matrix[last][last-offset];
                //right -> bottom
                matrix[last][last-offset] = matrix[i][last]; 
                
                // top -> right
                matrix[i][last] = top; 
                
            }
        }
    }
    static void displayMatrix(int[][] matrix, int n){
        for (int i=0; i< n; i++){
            for (int j=0; j < n; j++){
                System.out.print(" " + matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args){
        int n = 4;
        int[][] matrix = 
        {
            {1, 2, 3,4},
            {5, 6, 7, 8}, 
            {9, 10, 11, 12}, 
            {13, 14, 15, 16}
        };
        rotateMatrix(matrix, n); 
        displayMatrix(matrix, n);
    }
    
}
