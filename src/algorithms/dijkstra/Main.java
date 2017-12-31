/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.dijkstra;

/**
 *
 * @author dichha
 */
public class Main {
    public static void main(String[] args){
        Edge[] edges = {
            new Edge(0, 2, 1), new Edge(0, 3, 4), new Edge(0, 4, 2), 
            new Edge(0, 1, 3), new Edge(1, 3, 2), new Edge(1, 4, 3),
            new Edge(1, 5, 1), new Edge(2, 4, 1), new Edge(3, 5, 4), 
            new Edge(4, 5, 2), new Edge(4, 6, 7), new Edge(4, 7, 2), 
            new Edge(5, 6, 4), new Edge(6, 7, 5)
            
        };
        
        Graph g = new Graph(edges);
        g.calculateShortestDistances(); 
        g.printResult();
    }
    
}
