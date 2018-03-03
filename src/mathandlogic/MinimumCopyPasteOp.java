/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathandlogic;

/**
 *
 * @author dichha
 */
public class MinimumCopyPasteOp{
    static int find(int n){
        int res = 0; 
        for(int i=2; i<=n; i++){
            while(n%i == 0){
                res += i; 
                n /= i; 
            }
        }
        return res;
    }
    public static void main(String[] args){
        int n = 50; 
        int res = find(n);
        System.out.println(res);
    }
    
}
