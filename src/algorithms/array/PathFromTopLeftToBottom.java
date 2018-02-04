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
public class PathFromTopLeftToBottom {
    static int numberOfPaths(int m, int n){ 
        // If either given row number if first of 
        // given column number is first
        if(m == 1 || n == 1){ 
            return 1; 
        }
        // If diagonal movements are allowed then 
        // the last addition is required. 
        return numberOfPaths(m-1, n) + numberOfPaths(m, n-1); 
    }
    /*
    public static void main(String[] args){ 
        System.out.println(numberOfPaths(4, 4)); 
        
    }
    */
    
}
