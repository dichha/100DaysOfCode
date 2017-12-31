/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.dijkstra;

import java.util.ArrayList;
/**
 *
 * @author dichha
 */
public class Node {
    /*
    - Representing Nodes
    - A node must have a list of Edge that are linked to it. 
    - It must have a field to define if the Node has been visited or not
    - 'distanceFromSource' field to represent the result that Node of the 
    algorithm
    */
    private int distanceFromSource = Integer.MAX_VALUE;
    private boolean visited; 
    private ArrayList<Edge> edges  = new ArrayList<Edge>(); 
    // now we must create edges
    
    public int getDistanceFromSource(){
        return distanceFromSource;
    }
    public void setDistanceFromSource(int distanceFromSource){
        this.distanceFromSource = distanceFromSource;
    }
    public boolean isVisited(){
        return visited;
    }
    public void setVisited(boolean visited){
        this.visited = visited;
    }
    public ArrayList<Edge> getEdges(){
        return edges;
    }
    public void setEdges(ArrayList<Edge> edges){
        this.edges = edges;
    }
}
