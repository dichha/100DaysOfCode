/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.bitmanipulation;

/**
 *
 * @author dichha
 */
public class Insertion {
    int updateBits(int n, int m, int i, int j){
        /*
        Create a mast to clear bit i through j in n. EXAMPLE: i = 2, 
        j = 4. Result should be 11100011. For simplicitly, we'll use 
        just 8 bits for the example. 
        */
        int allOnes = ~0; 
        // 1s before position j, then 0s. Left = 11100000
        int left = allOnes << (j+1);
        
        // 1's after position i. right = 00000011
        int right = (1 << i)-1;
        
        // all 1s, except for 0s between i and j. mask 11100011
        int mask = left | right; 
        
        // Clear bits j through i then put m in there
        int n_cleared = left & mask; // clear bits j through i
        int m_shifted = m << j; // Move m into correct position
        
        return n_cleared | m_shifted; 
        
    }
    
}
