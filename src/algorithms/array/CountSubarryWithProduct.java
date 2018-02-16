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
public class CountSubarryWithProduct {
    /*
    static int productCount(int[] arr, int p){
        
        int count = 0; 
        int pro = 1; 
        
        for(int i=0; i<arr.length; i++){
            pro = arr[i];
            if(pro <= p)
                count++;
            for(int j= i+1; j<arr.length; j++){
                pro *= arr[j];
                if(pro <= p)
                    count++;
                else
                    break; 
                
            }
        }
        /*
        int ptr = 0;
        for(int i=ptr; i<arr.length; i++){ 
            pro *= arr[i];
            if(pro <= p){
                count ++;
                System.out.print(pro + " ");
            }
            if(i == arr.length-1){
                
                ptr ++; 
            }
        }
        System.out.println();
        */
        
       // return count; 
    //}
    static int productCount(int[] arr, int k){
        int n = arr.length; 
        int p = 1; 
        int res = 0; 
        for(int start=0, end=0; end < n; end++){
              
            // Move right bound by 1 step
            // Update the product
            p *= arr[end]; 
            
            // move left bound so guarantee that 
            // p is agian less than k
            while(start < end && p >= k){
                p /= arr[start++];
                System.out.print(p + " " + start + " " + end + " ");
                
            }
            System.out.println();
            // If p < k, update the counter. 
            // Note that this is working even for 
            // (start == end): it means that the 
            // previous window cannot grow anymore
            // and  a single array element is the only  addendum
            if(p < k){
                int len = end-start + 1; 
                res += len; 
            }
            
        }
        return res; 
    }
    
    public static void main(String[] args){
        int[] arr = {10, 4, 2, 6}; 
        int p = 100; 
        int count = productCount(arr, p); 
        System.out.println(count);
    }

    
}
