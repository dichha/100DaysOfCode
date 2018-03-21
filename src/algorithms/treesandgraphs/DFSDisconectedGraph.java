/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package algorithms.treesandgraphs;
import java.util.LinkedList; 


/**
 *
 * @author dichha
 */
public class DFSDisconectedGraph {
    static class Graph{
        int vertices; 
        LinkedList<Integer>[] adjList; 
        Graph(int vertices){
            this.vertices = vertices; 
            adjList = new LinkedList[vertices]; 
            for(int i=0; i<vertices; i++){
                adjList[i] = new LinkedList<Integer>(); 
            }
        }
        public void addEdge(int source, int dst){
            adjList[source].addFirst(dst); 
        }
        public void DFSRecursion(){
            boolean[] visited = new boolean[vertices]; 
            System.out.println("DFS");; 
            
            // visit for each node if not already visited. 
        }
        
    }
}
