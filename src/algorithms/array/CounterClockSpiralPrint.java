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
public class CounterClockSpiralPrint {
    static int R = 4; 
    static int C = 4; 
    static void counterClockSpiral(int m, int n, int[][] arr){
        int i, rowS=0, colS=0; 
        /*
        rowS - starting row index
        m - ending row index
        l - starting column index
        n - ending column index
        i - iterator
        */
        
        // initialize count 
        int cnt = 0; 
        // total number of elements in matrix
        int total = m*n; 
        
        while(rowS < m && colS < n){
            if(cnt == total)
                break; 
            // Print the first column from the remaining columns
            for(i=rowS; i<m; i++){
                System.out.print(arr[i][colS] + " ");
                cnt ++; 
            }
            colS++;
            
            if(cnt == total)
                break;
            
            // Print the colSast row from the remaining rows
            for(i = colS; i<n; ++i){
                System.out.print(arr[m-1][i] + " ");
                cnt++;
            }
            m--;
            if (cnt == total)
                break; 
            
            // Print the last column from the remaining columns 
            if(rowS < m){
                for(i = m-1; i >= rowS; --i){
                    System.out.print(arr[i][n-1] + " ");
                    cnt++; 
                }
                n--;
            }
            if(cnt == total)
                break; 
            
            // Print the first row from the remaining rows 
            if (colS < n){
                for(i = n-1; i >= colS; --i){
                    System.out.print(arr[rowS][i] + " ");
                    cnt ++; 
                }
                rowS++; 
            }
        }
        
        
    }
    public static void main(String[] args){
        int[][] arr = {{1, 2, 3, 4}, 
                       {5, 6, 7, 8}, 
                       {9, 10, 11, 12}, 
                       {13, 14, 15, 16}
                       };
         counterClockSpiral(R, C, arr);
        
    }
       
    
}
