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
public class MissingNumInArray {
    static int missingNum(int[] arr, int n){
        int num = arr[0];
        for(int i=1; i<n; i++){
            int next = num +1; 
            if(arr[i] != next)
                return next;
            num = next; 
        }
        return -1; 
    }
    /*
    public static void main(String[] args){
        int[] arr = {7,8,9,11, 12,13}; 
        int m = missingNum(arr, 5);
        System.out.print(m);
    }
*/
    
}
