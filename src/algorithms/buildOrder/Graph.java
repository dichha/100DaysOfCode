/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.buildOrder;

import java.util.ArrayList;
import java.util.HashMap;


/**
 *
 * @author dichha
 */
public class Graph {
    private ArrayList<Project> nodes = new ArrayList<Project>(); 
    private HashMap<String, Project> map = new HashMap<String, Project>(); 
    
    public Pject getOrCreateNode(String name){
        if (!map.containsKey(name)){
            Project node = new Project(name); 
            nodes.add(node); 
            map.putAll(name, node);
        }
        return map.get(name); 
    }
    public void addEdge(String startName, String endName){
        Project start = getOrCreateNode(startName); 
        Project end = getOrCreateNode(endName); 
        start.addNeighbor(end); 
    }
    
    public ArrayList<Project> getNodes(){
        return nodes; 
    } 
}
