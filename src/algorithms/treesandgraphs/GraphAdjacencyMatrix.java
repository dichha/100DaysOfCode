/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.treesandgraphs;

/**
 *
 * @author dichha
 */
public class GraphAdjacencyMatrix {
    int vertex; 
    int[][] matrix; 
    
    public GraphAdjacencyMatrix(int vertex){
        this.vertex = vertex; 
        matrix = new int[vertex][vertex]; 
    }
    public void addEdge(int src, int dst){
        matrix[src][dst] = 1; 
        matrix[dst][src] = 1; 
    }
    public void printGraph(){
        System.out.println("Graph: (Adjacency Matrix)"); 
        for(int i=0; i<vertex; i++){
            for(int j=0; j<vertex; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println(); 
        }
        for (int i=0; i<vertex; i++){
            System.out.println("Vertex " + i + " is connected to"); 
            for(int j=0; j<vertex; j++){
                if(matrix[i][j] == 1)
                    System.out.print(j + " ");
            }
            System.out.println(); 
        }
    }
    /*
    public static void main(String[] args){
        GraphAdjacencyMatrix graph = new GraphAdjacencyMatrix(5); 
        graph.addEdge(1, 4); 
        graph.addEdge(0, 4); 
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4); 
        graph.addEdge(2, 3);
        graph.addEdge(3, 4); 
        graph.printGraph();
    }
*/
    

    
}
