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
public class InsertionRevision {
    static int updateBits(int n, int m, int i, int j){
        // create a mask to clear bits i through j in n. EXAMPLE: i = 2, j = 4. Result 
        // should be 11100011. For simplicity, we'll use just 8 bits for the example. 
        
        int allOnes = ~0; // will equal sequce of all 1s. 
        
        // 1s before position j, then 0s. left = 11100000
        int left = allOnes << (j+1); 
        
        // 1's after position i. right = 00000011
        int right = ((1 << i) - 1); 
        
        //System.out.println("right: " + right);
        
        // All 1s except for 0s between  i an j. mask = 11100011
        int mask = left | right; 
        //System.out.println(mask + ": mask");
        
        // Clear bits j through i then put m in there. 
        int nCleared = n & mask; // clear bits j through i 
        int mShifted = m << i; // move m into correct position 
        
        return nCleared | mShifted; // OR them, and we're done
        
    }
    
    public static void main(String[] args){
     // represent a number to its bit value: (n>>k) & 1
     String n = Integer.toString(100, 2); 
     String m = Integer.toString(10, 2);
     int ans = updateBits(Integer.parseInt(n), Integer.parseInt(m), 2, 6);
     /*
     System.out.println(n + " " + m);
     System.out.println(Integer.parseInt(n));
     */
     System.out.println(ans);
             
    }
    
    
}
