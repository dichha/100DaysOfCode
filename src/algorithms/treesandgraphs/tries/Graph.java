/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.treesandgraphs.tries;

import java.util.Iterator;
import java.util.LinkedList; 
/**
 *
 * @author dichha
 */
public class Graph {
    private int V; // no. of vertices
    // Array of lists for Adjacency List Representation 
    private LinkedList<Integer> adj[];
    
    // Constructor
    Graph(int v){
        V = v; 
        adj = new LinkedList[v]; 
        for(int i=0; i<v; i++){
            adj[i] = new LinkedList(); 
        }
    }
    // Fucntion to add an edge into the graph 
    void addEdge(int v, int w){
        adj[v].add(w); // Add w to v's list
    }
    // A function used by DFS
    void DFSUtil(int v, boolean visited[]){
        // Mark the current node as visited and print it
        visited[v] = true; 
        System.out.print(v + " ");
        
        // Recur for all the vertices to this vertex
        Iterator<Integer> i = adj[v].listIterator(); 
        while(i.hasNext()){
            int n = i.next(); 
            if(!visited[n])
                DFSUtil(n, visited);
        }
    }
    // The function to do DFS traversal. It uses recursive DFSUtil()
    void DFS(int v){
        // Mark all the vertices as not visited (set as false by default
        // in java
        boolean visited[] = new boolean[V]; 
        // call the recursive helper function to print DFS traversal 
        DFSUtil(v, visited);
    }
    
    public static void main(String args[]){
        Graph g = new Graph(4);
        
        g.addEdge(0, 1); 
        g.addEdge(0, 2);
        g.addEdge(1, 2); 
        g.addEdge(2, 3); 
        g.addEdge(3, 3);
        
        System.out.println("Following is Depth Fist Traversal"
                + "(starting from vertex 2)");
        
        g.DFS(0);
    }
}
