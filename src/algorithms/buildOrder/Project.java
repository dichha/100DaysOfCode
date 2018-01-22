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
public class Project {
    private ArrayList<Project> children = new ArrayList<Project>(); 
    private HashMap<String, Project> map = new HashMap<String, Project>(); 
    private String name; 
    private int dependencies = 0; 
    
    public Project(String n){
        name = n; 
    }
    public void addNeighbor(Project node){
        if(!map.containsKey(node.getName())){
            children.add(node);
            node.incrementDependencies();
        }
    }
    public void incrementDependencies(){
        dependencies ++; 
    }
    public void decrementDependencies(){
        dependencies --; 
    }
    public String getName(){
        return name;
    }
    public ArrayList<Project> getChildren(){
        return children; 
    }
    public int getNumberDependencies(){
        return dependencies; 
    }
    
}
