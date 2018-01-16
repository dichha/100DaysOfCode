/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.treesandgraphs;

import java.util.ArrayList; 
/**
 *
 * @author dichha
 */
public class MinHeap {
    private ArrayList<Integer> list; 
    
    public MinHeap(){
        this.list = new ArrayList<Integer>();
    }
    public MinHeap(ArrayList<Integer> items){
        this.list = items; 
        buildHeap();
    }
    
    public void insert(int item){
        list.add(item);
        int i = list.size()-1; 
        int parent = parent(i);
        
        // Inserting to a correct index
        while(parent != i && list.get(i) < list.get(parent)){
            swap(i, parent);
            i = parent; 
            parent = parent(i);
        }
    }
    public void buildHeap(){
        for (int i=list.size()/2; i >= 0; i--){
            minHeapify(i);
        }
    }
    public void minHeapify(int i){
        int left = left(i); 
        int right = right(i); 
        int smallest = -1; 
        
        // find the smallest key between curent node and its 
        // children 
        if(left <= left.size()-1 && list.get(left) < list.get(i)){
            smallest = left;
        }else{
            smallest = i; 
        }
        if(right <= list.size()-1 && list.get(right) < list.get(smallest)){
            smallest = right;
        }
        
        // if smallest key is no the current key then bubble-down it
        if(smallest != i){
            swap(i, smallest);
            minHeapify(smallest);
        }
    }
    public void swap(int i, int parent){
        int temp = list.get(parent);
        list.set(parent, list.get(i));
        list.set(i, temp);
    }
    public int parent(int i){
        if(i%2 == 1)
            return i/2;
        else
            return (i-1)/2;
    }
    public int left(int i){
        return 2*i+1; 
    }
    public int right(int i){
        return 2*i+2;
    }
    public int extractMin(){
        if(list.size() == 0){
            throw new IllegalStateException("MinHeap is EMPTY");
            
        }else if(list.size() == 1){
            int min = list.remove(0);
            return min; 
        }
        // remove the last item, and set it as new root
        int min = list.get(0); 
        int lastItem = list.remove(list.size() -1 ); 
        list.set(0, lastItem);
        
        //bubble-down until heap property is maintained
        minHeapify(0);
        
        return min; 
        
    }
}
