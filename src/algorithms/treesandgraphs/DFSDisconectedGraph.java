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
            
            // visit for each node if not already visited. ]
            for(int i=0; i<vertices; i++){
                if(!visited[i]){
                    dfs(i, visited); 
                }
            }
        }
        public void dfs(int start, boolean[] visited){
            visited[start] = true;
            System.out.println(start + " ");
            for (int i=0; i<adjList[start].size(); i++){
                int vertex = adjList[start].get(i);
                if(!visited[vertex]){
                    dfs(vertex, visited);
                }
            }
        }
        
    }
    /*
      public static void main(String[] args) {
        int vertices = 7;
        Graph graph = new Graph(vertices);
        graph.addEdge(1,3);
        graph.addEdge(2,3);
        graph.addEdge(0,4);
        graph.addEdge(4,5);
        graph.addEdge(5,6);
        graph.DFSRecursion();
    }
*/
    
}
