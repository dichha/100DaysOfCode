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
public class LongestCommonPrefix {
    static int findMinLength(String[] arr){
        int smallest = Integer.MAX_VALUE;
         
        for(int i=0; i < arr.length; i++){
            if (arr[i].length() < smallest){
                smallest = arr[i].length(); 
                
            }   
        }
        return smallest; 
    }
    static boolean allContainsPrefix(String[] arr, int n, String str, int start, int end){
        for (int i=0; i<=n-1; i++){
            for(int j=start; j <=end; j++){
                if(arr[i].charAt(j) != str.charAt(j))
                    return false; 
            }
        }
        return true; 
    }
    
    static String longestCommonPrefix(String[] arr){
       
        int index = findMinLength(arr); 
        String prefix = ""; 
        int low = 0; 
        int high = index; 
        while(low <= high){
            int mid = low + (high-low)/2; 
            if(allContainsPrefix(arr, arr.length, arr[0], low, mid)){
                prefix = prefix + arr[0].substring(low, mid-low+1); 
                
                // And then go for the righ part; 
                low = mid + 1; 
            }else{
                high = mid-1; 
            }
        }
        return prefix; 
    }
    
    public static void main(String[] args){
        String[] arr = {"geeksforgeeks", "geeks", "geek", "geezer"}; 
        String lcp = longestCommonPrefix(arr); 
        System.out.print(lcp); 
    }
    
}
