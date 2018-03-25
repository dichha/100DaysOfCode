/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.array;

import java.util.LinkedList; 

/**
 *
 * @author dichha
 */
public class DetectCycleInGraph {
    static class Graph{
        int vertices; 
        LinkedList<Integer>[] adjList; 
        
        Graph(int vertices){
            this.vertices = vertices; 
            adjList = new LinkedList[vertices]; 
            for(int i=0; i<vertices; i++){
                adjList[i] = new LinkedList<>(); 
            }
        }
        public void addEdge(int src, int dst){
            adjList[src].addFirst(dst);
        }
        public boolean isCycle(){
            boolean[] visited = new boolean[vertices]; 
            boolean recursiveArr[] = new boolean[vertices]; 
            
            // dfs from each node
            for(int i=0; i<vertices; i++){
                if(isCycleUtil(i, visited, recursiveArr))
                    return true;
            }
            return false; 
        }
        public boolean isCycleUtil(int vertex, 
                boolean[] visited, boolean[] recursiveArr){
            visited[vertex] = true; 
            recursiveArr[vertex] = true; 
            
            // recrusive call to all the adjacent vertices
            for(int i=0; i<adjList[vertex].size(); i++){
                // if not already visited
                int adjVertex = adjList[vertex].get(i); 
                // if has loop back to ancestor
                if(!visited[adjVertex] && isCycleUtil(adjVertex, 
                        visited, recursiveArr))
                    return true; 
                // self loop
                else if(recursiveArr[adjVertex])
                    return true;
            }
            // if reached here means cycle has not found in DFS
            // from this vertex
            // reset
            
            recursiveArr[vertex] = false; 
            return false; 
            
        }
        
    }
    /*
    public static void main(String[] args){
        int vertices = 4; 
        Graph graph = new Graph(vertices); 
        
        graph.addEdge(0, 1); 
        graph.addEdge(1, 2); 
        graph.addEdge(2, 3); 
        graph.addEdge(3, 1); 
        
        boolean result = graph.isCycle(); 
        System.out.println("is Cycle present: " + result); 
    }
    */
    
}
