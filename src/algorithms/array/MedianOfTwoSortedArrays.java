/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.array;

import java.util.Arrays;

/**
 *
 * @author dichha
 */
public class MedianOfTwoSortedArrays {
    static float getMedian(int[] x, int start, int end){
        int size = end-start+1; 
        double median;
        
        if(size%2 == 0){
            float m =  x[start + (size/2)];
            float n = x[start + (size -1)/2];
            return (m+n)/2;
        }else{
            return x[start + (size-1)/2];
        }
    }
    static float find(int[] a, int startA, int endA, int[] b, int startB, int endB){
        if(endA-startA+1==2 && endB-startB +1 ==2){
            float x = Math.max(a[startA], a[endA]);
            float y = Math.min(b[startB], b[endB]);
            return (x+y)/2; 
        }
        float medA = getMedian(a, startA, endA);
        float medB = getMedian(b, startB, endB);
        
        int midA = (startA + endA)/2; 
        int midB = (startB + endB)/2; 
        
        if(medA > medB){
            return find(a, startA, midA, b, midB, endB);
        }else{
            return find(a, midA, endA, b, startB, midB);
        }
        
        
    }
    
    /*
    static int findMedian(int[] a, int[] b){
        int[] c = new int[a.length + b.length]; 
        for(int i=0; i < a.length; i++){
            c[i] = a[i];
        }
        int idx = 0; 
        for(int j = a.length; j < (a.length + b.length); j++){ 
            c[j] = b[idx]; 
            idx++; 
        }
        Arrays.sort(c);
        int med = -1; 
        if(c.length%2 == 0){
            med = (c[c.length/2] + c[(c.length-1)/2])/2; 
        }else{
            med = c[c.length/2];
        } 
        return med; 
    }
    */
    public static void main(String[] args){
        int[] a = {2, 6, 9, 10, 11}; 
        int[] b = {1, 5, 7, 12, 15}; 
        //int med = findMedian(a, b);
        float med = find(a, 0, a.length-1, b, 0, b.length-1);
        System.out.println(med);
        
        
    }
}
