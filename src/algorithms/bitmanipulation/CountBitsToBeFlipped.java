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
public class CountBitsToBeFlipped {
    static int calculate(int x, int y){
        // xor of 2 numbers, the bit will in the result if that bit is set in either x or y 
        // so by doing xor we will get all the bits which needs to be flipped to convert x to y
        int z = x ^ y; 
        int count = 0; 
        while(z >0 ){
            count += z & 1; 
            z >>= 1; 
        }
        return count; 
    }
    public static void main(String[] args){
        int x = 10; 
        int y = 20; 
        int c = calculate(x, y); 
        System.out.print("requires " + c + " flipps.");
    }
    
}
