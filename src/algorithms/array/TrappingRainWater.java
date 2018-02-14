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
public class TrappingRainWater {
    /*
    static int trappedWater(int[] arr){
        //int min = Math.min(arr[0], arr[arr.length -1]);
        //int max = Math.max(arr[0], arr[arr.length -1]);
        
        int disk = Math.min(arr[0], arr[arr.length-1]);
        int total = 0; 
        for(int i=0; i <= arr.length-2; i++){
            total += (disk - arr[i]);
        }
        return total > 0? total : 0 ; 
    }
    */
    /*
    static int findWater(int[] arr){
        // left[i] contains height of tallest bar to the left of i'th bar including itself
        int[] left = new int[arr.length]; 
        // right[i] contains height of tallest bar to the right of i'th bar including itself
        int[] right = new int[arr.length]; 
        int water = 0; // initialize result
        
        // Fill left array
        left[0] = arr[0]; 
        for(int i=1; i < arr.length; i++){
            left[i] = Math.max(left[i-1], arr[i]); 
        }
        // fill right array
        right[arr.length-1] = arr[arr.length-1]; 
        for(int i=arr.length-2; i >=0; i--){
            right[i] = Math.max(right[i+1], arr[i]);
        }
        // Calculate the accumulated water element by element
        // consider the amount of water on i'th bar, the 
        // amount of water accumulated on this particular 
        // bar will be equal to min(min[left], right[i]-arr[i])
        for(int i=0; i<arr.length; i++){
            water += Math.min(left[i], right[i])-arr[i]; 
        }
        
        return water; 
        
    }
    */
    // Space optimized
    static int findWater(int[] arr){
        // initialize output
        int result = 0; 
        // maximum element on left and right
        int leftMax = 0; 
        int rightMax = 0; 
        
        // indices to traverse the array
        int lo = 0; 
        int hi = arr.length-1; 
        while(lo <= hi){
            if(arr[lo] < arr[hi]){
                if(arr[lo] > leftMax){
                    leftMax = arr[lo];
                }else{
                    result += leftMax = arr[lo];
                    lo++;
                            
                }
                
            }else{
                if(arr[hi] > rightMax){
                    rightMax = arr[hi];
                }else{
                    result += rightMax -arr[hi];
                    hi--; 
                }
            }
                
        }
        return result; 
        
        
    }
    
    public static void main(String[] args){
        // int[] elevation = {3, 0, 0, 2, 0, 4}; 
        //int[] elevation = {6, 9, 9}; 
        // int total = trappedWater(elevation);
        int[] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}; 
        
        int  total = findWater(arr);
        System.out.println(total + " ");
    }
    
}
