/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.stacksandqueues;

import java.util.ArrayList; 
import java.util.Random;
/**
 *
 * @author dichha
 */
public class MaxHeap {
    static ArrayList<Integer> arr;
    public MaxHeap(ArrayList<Integer> arr){
        this.arr = arr; 
    }
    static void maxHeap(){
        for(int i=(arr.size()/2); i >= 0; i--){
            maxHeapify(i);
        }
    }
    static int rightChild(int i){
        return 2*i+2; 
    }
    static int leftChild(int i){
        return 2*i + 1; 
    }
    static int parent(int i){
        if(i%2 == 1)
            return i/2; 
        else
            return (i-1)/2;
    }
    static void swap(int a, int parent){
        int tmp = arr.get(a); 
        arr.set(a, arr.get(parent)); 
        arr.set(parent, tmp); 
    }
    static void maxHeapify(int i){
        int rc = rightChild(i);
        int lc = leftChild(i);
        
        int biggest = -1; 
        if(lc < arr.size() && arr.get(i) < arr.get(lc)){
            biggest = lc; 
        }else{
            biggest = i;
        }
        
        if(rc < arr.size() && arr.get(rc) > arr.get(biggest)){
            biggest = rc; 
        }
        
        if(biggest != i){
            swap(biggest, i); 
            maxHeapify(biggest); 
        }
        
    }
    static int extractMax(){
        if(arr.size() == 0){
            throw new IllegalStateException("Max heap exception"); 
        }
        if(arr.size() == 1){
            int temp = arr.remove(0); 
            return temp; 
        }
        int max = arr.get(0); 
        int temp = arr.remove(arr.size()-1); 
        arr.set(0, temp); 
        maxHeapify(0); 
        
        return max; 
    }
    static int getSize(){
        return arr.size(); 
    }
    
    static void insert(int n){
        int idx = arr.size();
        arr.set(idx, n);
        int p = parent(arr.size()-1); 
        while(p >= 0 && arr.get(p) < arr.get(idx)){
            swap(idx, p); 
            idx = p; 
            p = parent(idx); 
            
        }
    }
    
    static void print(ArrayList<Integer> arrr){
        for(int i=0; i<arr.size(); i++){
            System.out.print(arr.get(i) + " ");
        }
        System.out.println(); 
    }
    
    /*
    public static void main(String[] args){
        Random rand = new Random();
        ArrayList<Integer> arr = new ArrayList<Integer>(); 
        /*
        for(int i=0; i<10; i++){
            arr.add(rand.nextInt(101));
        }
        */
    /*
        arr.add(77); 
        arr.add(98); 
        arr.add(26); 
        arr.add(96); 
        arr.add(67); 
        arr.add(42); 
        arr.add(99); 
        arr.add(23); 
        arr.add(23); 
        arr.add(74); 
          
        MaxHeap mh = new MaxHeap(arr);
        print(arr);
        maxHeap(); 
        print(arr); 
       
        
    }
    */

    
}
