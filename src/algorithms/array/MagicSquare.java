/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.array;

/**
 *
 * @author dichha
 */
public class MagicSquare {
    static boolean isMagicSquare(int[][] matrix){
        // Calculate the sum of the prime diagonal
        int sum = 0; 
        for(int i=0; i < matrix[0].length; i++){
            sum = sum + matrix[i][i];
        }
        
        // for sum of Rows
        for (int i=0; i < matrix[0].length; i++){
            int rowSum = 0; 
            for(int j=0; j<matrix[0].length; j++){
                rowSum += matrix[i][j];
            }
            // check if every row sum is equal to prime diagonal sum 
            if(rowSum != sum)
                return false; 
        }
        // for sums in columns
        for(int i=0; i<matrix[0].length; i++){
            int colSum = 0; 
            for(int j=0; j<matrix[0].length; j++){
                colSum += matrix[j][i];
            }
            // check if every column sum is equal to prime diagonal sum 
            if(sum != colSum)
                return false; 
        }
        return true; 
    }
    /*
   public static void main(String[] args){
       int[][] mat={{2, 7, 6}, {9, 5, 1}, {4, 3, 8}};
       if (isMagicSquare(mat))
           System.out.println("Magic Square");
       else
           System.out.println("Not a magic square");
           
   }
    */
}
