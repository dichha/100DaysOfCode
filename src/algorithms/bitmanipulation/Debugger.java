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
public class Debugger {
    // Explain what the following code does: (n & (n-1)) == 0
    /*
    1) What does it mean if A & B == 0? 
    2) What does n-1 look like (as compared with n)? 
    When you subtract 1 from #, you look at the LSB. if it'a a 1 you
    change it to 0, and you are done. If it's zero, you must "borrow"
    from a larger bit. So, you go to increasingly larger bits, 
    changing each bit from 0 to a 1, until you find a 1. You flip that 
    to a 0 and you are done. 
    Thus, n-1 will look like n, except that n's initial 0s will be 1s
    is n-1, and n's least significant 1 will be a 0 in n-1. i.e
    
    */
    // therefore, ((n&(n-1)==0) implies check if n is a power of 2 (or
    // n is 0). 
    static int bitSwapRequired(int a, int b){ 
        int count = 0;
        
        for(int c = a^b; c != 0 ; c = c >> 1 ){ 
            count += (c & 1); 
            
        }
        return count; 
    }
    public static void main(String[] args){
        int count = bitSwapRequired(29, 15); 
        System.out.println(count);
    }
     
}
