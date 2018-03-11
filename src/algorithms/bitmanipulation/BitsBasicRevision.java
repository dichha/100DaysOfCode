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
public class BitsBasicRevision {
    boolean getBit(int num, int i){
        return ((num &(1<<i)) != 0);
    }
    int setBit(int num, int i){
       return  num | (1 << i);
    }
    
    int clearBit(int num, int i){
        int mask = ~(1 << i);
        return (num & mask);
    }
    
    // To clear all bits from MSB through i(inclusive) 
    int clearBitsMSBthroughI(int num, int i){
        int mask = (1 << i) - 1; 
        return (num & mask);
    }
    
    // To clear all bits from i through 0 
    int clearBitsIthrough0(int num, int i){
        int mask = ~( -1 >>> (31-i));
        return (num & mask);
    }
    
    // To update bits
    int updateBit(int num, int i, boolean bitIs1){
        int value = bitIs1 ? 1 : 0; 
        int mask = ~(1 << i);
        return ((num & mask) | (value << i)); 
    }
}
