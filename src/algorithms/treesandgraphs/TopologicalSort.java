/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.treesandgraphs;

import java.util.LinkedList; 
import java.util.Stack; 

/**
 *
 * @author dichha
 */
public class TopologicalSort {
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
        public void topologicalSorting(){
            boolean[] visited = new boolean[vertices]; 
            
            Stack<Integer> stack = new Stack<>(); 
            
            // visit from each node if not already visited
            for (int i=0; i<vertices; i++){
                if(!visited[i]){
                    topologicalSortUtil(i, visited, stack);
                }
            }
            System.out.println("Topological Sort: "); 
            int size = stack.size(); 
            for(int i=0; i<size; i++){
                System.out.print(stack.pop() + " "); 
            }
                    
        }
        public void topologicalSortUtil(int start, 
                boolean[] visited, Stack<Integer> stack){
            visited[start] = true; 
            for(int i=0; i<adjList[start].size(); i++){
               int vertex = adjList[start].get(i); 
               if(!visited[vertex])
                   topologicalSortUtil(i, visited, stack);
            }
            stack.push(start);
        }
        
        
    }
    /*
    public static void main(String[] args){
        int vertices = 8; 
        Graph graph = new Graph(vertices); 
        graph.addEdge(7,6); 
        graph.addEdge(7, 5); 
        graph.addEdge(6, 4); 
        graph.addEdge(6, 3); 
        graph.addEdge(5, 4); 
        graph.addEdge(5, 2); 
        graph.addEdge(3, 1);
        graph.addEdge(2, 1); 
        graph.addEdge(1, 0);
        graph.topologicalSorting(); 
    }
    */
}
