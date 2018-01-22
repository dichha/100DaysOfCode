/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.buildOrder;
/**
 *
 * @author dichha
 */
public class BuildOrder {
      // Find a correct build order
    Project[] findBuildOrder(String[] projects, String[][] dependencies){
        Graph graph = buildGraph(projects, dependencies); 
        return orderProjects(graph.getNodes());
    }
    
    // Buils the graph, adding the edge (a,b) if b is dependent on a. 
    // Assumes a pair is listed in "build order". The pair (a, b) in dependencies 
    // indicates that b depends on a and a must be built before b
    
    Graph buildGraph(String[] projects, String[][] dependencies){
        Graph graph = new Graph(); 
        for (String project: projects){
            graph.createNode(projects); 
        }
    }
    
}
