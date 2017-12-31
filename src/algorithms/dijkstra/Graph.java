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

// now we must create graph object and implement dijkstra algorithm
public class Graph {
    private Node[] nodes;
    private int noOfNodes; 
    private Edge[] edges;
    private int noOfEdges;
    
    /*
    - In the constructor, we take an array of Edges and we build
    the Graph by creating corresponding Nodes.
    - 
    */
    public Graph(Edge[] edges){
        this.edges = edges;
        // create all nodes ready to be updated with the edges
        this.noOfNodes = calculateNoOfNodes(edges);
        this.nodes = new Node[this.noOfNodes];
        
        for (int n=0; n < this.noOfNodes; n++){
            this.nodes[n] = new Node();
        }
        
        // add all the edges to the nodes, each edge added to two
        // nodes (to and from)
        this.noOfEdges = edges.length;
        for (int edgeToAdd = 0; edgeToAdd < this.noOfEdges; edgeToAdd++){
            //System.out.println("node: " + Integer.toString(edgeToAdd));
            this.nodes[edges[edgeToAdd].getFromNodeIndex()].getEdges().add(edges[edgeToAdd]);
            //System.out.println((this.nodes[edges[edgeToAdd].getFromNodeIndex()].toString()));
            this.nodes[edges[edgeToAdd].getToNodeIndex()].getEdges().add(edges[edgeToAdd]);
        }
    } 
    
    
    public int calculateNoOfNodes(Edge[] edges){
        int noOfNodes = 0;
        for (Edge e: edges){
            if (e.getToNodeIndex() > noOfNodes)
                noOfNodes = e.getToNodeIndex();
            if (e.getFromNodeIndex() > noOfNodes)
                noOfNodes = e.getFromNodeIndex();
        }
        noOfNodes ++;
        return noOfNodes;
        
    }
    
    // Implementing a Dijkstra's algorithm
    public void calculateShortestDistances(){
        // node 0 as source
        this.nodes[0].setDistanceFromSource(0);
        int nextNode = 0;
        
        // visit every node
        for (int i=0; i< this.nodes.length; i++){
            // loop around the edges of current node
            
            ArrayList<Edge> currentNodeEdges = this.nodes[nextNode].getEdges();
            
            for (int joinedEdge = 0; joinedEdge < currentNodeEdges.size(); joinedEdge++){
                int neighborIndex = currentNodeEdges.get(joinedEdge).getNeigboringIndex(nextNode);
                
                // only if not visited
                if(!this.nodes[neighborIndex].isVisited()){
                    int tentative = this.nodes[nextNode].getDistanceFromSource()+currentNodeEdges.get(joinedEdge).getLength();
                    if (tentative < this.nodes[neighborIndex].getDistanceFromSource()){
                        this.nodes[neighborIndex].setDistanceFromSource(tentative);
                        //System.out.println("node " + Integer.toString(i) + " distance: " + 
                        //        Integer.toString(tentative));
                    }
                }
            }
            // all neighbors checked so node visited 
            this.nodes[nextNode].setVisited(true);
            
            // next node must be with shortest distance
            nextNode = getNodeShortestDistanced();
            
        }
    }
    
    private int getNodeShortestDistanced(){
        int storedNodeIndex = 0; 
        int storedDist = Integer.MAX_VALUE; 
        for (int i=0; i < this.nodes.length; i++){
            int currentDist = this.nodes[i].getDistanceFromSource();
            if (!this.nodes[i].isVisited() && currentDist < storedDist){
                storedDist = currentDist;
                storedNodeIndex = i;
            }
        }
        return storedNodeIndex;
    }
    
    // display result
    public void printResult(){
        String output = "Number of nodes = " + this.noOfNodes;
        output += "\n Number of edges = " + this.noOfEdges;
        
        for (int i = 0; i < this.nodes.length; i++){
            output += ("\n The shortest distance from node 0 to node " + i + " is "
                    + nodes[i].getDistanceFromSource());
        }
        
        System.out.println(output);
    }
    public Node[] getNodes(){
        return nodes; 
    }
    public int getNoOfNodes(){
        return noOfNodes;
    }
    public Edge[] getEdges(){
        return edges;
    }
    public int getNoOfEdges(){
        return noOfEdges;
    }
    
}
