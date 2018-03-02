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
public class GraphAdjacencyList {
    LinkedList<Integer>[] list; 
    int vertex; 
    
    public GraphAdjacencyList(int vertex){
        this.vertex = vertex; 
        list = new LinkedList[vertex];
        for(int i=0; i<vertex; i++){
            list[i] = new LinkedList<Integer>(); 
        }
        
    }
    public void addEdge(int source, int destination){
        // add edge
        list[source].addFirst(destination); 
        
        // add back edge (for undirected)
        list[destination].addFirst(source);
    }
    public void print(){
        for(int i=0; i<vertex; i++){
            if(list[i].size() > 0){
                System.out.print("Vertex " + i + " is connected to:");
                for(int j=0; j < list[i].size(); j++){
                    System.out.print(list[i].get(j) + " ");
                }
                System.out.println(); 
            }
        }
    }
    /*
    public static void main(String[] args){
        GraphAdjacencyList gal = new GraphAdjacencyList(5);
        gal.addEdge(0, 1); 
        gal.addEdge(0, 4); 
        gal.addEdge(1, 2);
        gal.addEdge(1, 3); 
        gal.addEdge(1, 4); 
        gal.addEdge(2, 3);
        gal.addEdge(3, 4); 
        gal.print(); 
        
    }
    */
}
