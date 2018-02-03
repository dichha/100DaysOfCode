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
public class PairwiseSwap {
    static int swapOddEvenBits(int x){ 
        // using masks of (01010101 & x) << 1 for odd  
        //return (((x & 0xaaaaaaaa) >>> 1) | ((x & 0x55555555) << 1));
        return (((x & 01010101) >>> 1) | (x & 10101010) << 1); 
    }
    public static void main(String[] args){ 
        int ans = swapOddEvenBits(12); 
        System.out.print(ans); 
    }
}
