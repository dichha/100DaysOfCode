/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.treesandgraphs;

import java.util.Iterator;
import java.util.LinkedList; 

/**
 *
 * @author dichha
 */
public class DFSRevise {
    LinkedList<Integer>[] adj; 
    private int V; 
    
    DFSRevise(int v){
        V = v; 
        adj = new LinkedList[V]; 
        for(int i=0; i<v; i++){
            adj[i] = new LinkedList<Integer>();  
        }   
    }
    void addEdge(int v1, int v2){
        adj[v1].add(v2); 
    }
    void DFSUtil(int v, boolean[] visited){
        visited[v] = true;
        System.out.print(v + " ");
        
        Iterator<Integer> i = adj[v].listIterator(); 
        while(i.hasNext()){
            int num = i.next(); 
            if(!visited[num]){ 
                DFSUtil(num, visited);
            }
        }
        
    }
    void DFS(int v){
        boolean[] visited = new boolean[V]; 
        DFSUtil(v, visited);
    }
    
    public static void main(String[] args){
        DFSRevise  dfs = new DFSRevise(4);
        
        dfs.addEdge(0, 1);
        dfs.addEdge(0, 2);
        dfs.addEdge(1, 2); 
        dfs.addEdge(2, 0);
        dfs.addEdge(2, 3);
        dfs.addEdge(3, 3);
        
        System.out.println("Following is the DFS traversal"
                            + "(starting from vertex 2)");
        
        dfs.DFS(2);
        
    }
    
}
