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
class NodeY{
    int src; 
    int dst; 
    public NodeY(int src, int dst){
        this.src = src; 
        this.dst = dst; 
    }
}
class GraphY{
    int vertex; 
    LinkedList<NodeY>[] adjacencyList; 
    public GraphY(int vertex){
        this.vertex = vertex; 
        adjacencyList = new LinkedList[vertex];
        for(int i=0; i<vertex; i++){
            adjacencyList[i] = new LinkedList<NodeY>(); 
        }
    }
    public void addEdge(int source , int destination){
        NodeY node = new NodeY(source, destination);
        adjacencyList[source].addLast(node);
    }
}


public class AllPathsBetweenTwoNodes {
    
    public void print(GraphY graph, int start, int end, String path, boolean[] visited){
        String newPath = path + "->" + start; 
        visited[start] = true;
        LinkedList<NodeY> list = graph.adjacencyList[start]; 
        for(int i=0; i < list.size(); i++){
            int dst = list.get(i).dst; 
            if(!visited[dst] && dst != end){
                visited[dst] = true;
                print(graph, dst, end, newPath, visited);
            }else if(dst == end){
                System.out.println(newPath + " -> " + dst);
            }
        }
        visited[start] = false; 
        
    }
    public void printAllPaths(GraphY graph, int start, int end){
        boolean[] visited = new boolean[graph.vertex]; 
        visited[start] = true; 
        print(graph, start, end, "", visited); 
    }
    /*
    public static void main(String[] args){
        int vertices = 6; 
        GraphY graph = new GraphY(vertices);
        AllPathsBetweenTwoNodes paths = new AllPathsBetweenTwoNodes(); 
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(3, 4);
        graph.addEdge(2, 3);
        graph.addEdge(4, 0);
        graph.addEdge(4, 1);
        graph.addEdge(4, 5);
        paths.printAllPaths(graph, 0, 5);
    }
*/
    
}
