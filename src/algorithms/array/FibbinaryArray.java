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
public class FibbinaryArray {
    static boolean checkFibinnary(int n){
        int prevLast = 1; 
        for(int i=0; i<n; i++){
            if((n&1)==1 && prevLast==1)
                return false;
            prevLast = n&1; 
            n >>= 1; 
                        
        }
        return true; 
    }
    public static void main(String[] args){
        int n = 10; 
        boolean isFibinnary = checkFibinnary(n);
        System.out.println(isFibinnary);
    }
    
}
