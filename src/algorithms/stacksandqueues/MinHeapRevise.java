/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.stacksandqueues;

import java.util.ArrayList; 
import java.util.List;
import java.util.Random;
/**
 *
 * @author dichha
 */
public class MinHeapRevise {
    private ArrayList<Integer> list; 
    public MinHeapRevise(){
        this.list = new ArrayList<Integer>(); 
    }
    
    public MinHeapRevise(ArrayList<Integer> items){
        this.list = items; 
        buildHeap();
    }
    public void buildHeap(){
        for(int i=list.size()/2; i >= 0; i--){
            minHeapify(i);
        }
    }
    public int left(int i){
        return 2*i + 1; 
    }
    public int right(int i){
        return 2*i + 2; 
    }
    public int parent(int i){
        if(i%2 == 1)
            return i/2;
        else
            return (i-1)/2; 
    }
    public void swap(int i, int parent){
        int temp = list.get(parent); 
        list.set(parent, list.get(i));
        list.set(i, temp); 
    }
    public void minHeapify(int i){
        int left = left(i); 
        int right = right(i); 
        int smallest = -1; 
        if(left <= list.size()-1 && list.get(left) < list.get(i))
            smallest = left; 
        else 
            smallest = i; 
        
        if(right <= list.size()-1 && list.get(right) < list.get(i))
            smallest = right; 
        
        // if the smallest key is not the current key then bubble-down 
        if(smallest != i){
            swap(i, smallest); 
            minHeapify(smallest); 
        }
        
    } 
    public int extractMin(){
        if(list.size() == 0){
            throw new IllegalStateException("MinHeap is Eception"); 
            
        }else if(list.size() == 1){
            int min = list.remove(0); 
            return min; 
        }
        // remove the last item, and set it as new root
        int last = list.get(list.size()-1); 
        int min = list.get(0); 
        list.set(0, last); 
        
        // bubble-down 
        minHeapify(0);
        
        return min; 
    }
    public void insert(int item){
        list.add(item); 
        int i = list.size()-1; 
        int parent = parent(i);
        while(parent >=0 && list.get(i) < list.get(parent)){
            swap(i, parent); 
            i = parent; 
            parent = parent(i); 
        }
    }
    
    public int getMin(){
        return list.get(0); 
    }
    
    public boolean isEmpty(){
        return list.size() == 0; 
    }
    
    public void decreaseKey(int i, int key){
        if(list.get(i) < key){
            throw new IllegalArgumentException("Key is larger than the original key");     
        }
        list.set(i, key); 
        int parent = parent(i);
        // bubble-up
        while(parent >= 0 && list.get(i) < list.get(parent)){
            swap(i, parent); 
            i = parent; 
            parent = parent(i); 
        }
    }
    /*
    public static void main(String[] args){
        Random r = new Random(); 
        ArrayList<Integer> list = new ArrayList<Integer>(); 
        for(int i = 0; i <  10; i++){
            int num = r.nextInt(101); 
            list.add(num); 
        }
        for(int i: list)
            System.out.print(i + ", " );
        System.out.println();
       
        MinHeapRevise mhr = new MinHeapRevise(list); 
        mhr.buildHeap();
        
        for(int i: list){
            System.out.print(i + " ");
        }
    }
    */
}
