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
enum State {
    Univisted, Visited, Visiting; 
}
public class RouteBetweenNodes {
    boolean search(Graph g, Node start, Node end){
        if(start == end)
            return true;
        // Operates as Queue
        LinkedList<Node> q = new LinkedList<Node>(); 
        
        for(Node u: g.getNodes()){
            u.state = State.Univisted; 
        }
        start.state = State.Visiting; 
        q.add(start);
        Node u; 
        while(q.size() != 0){
            u = q.poll(); 
            if(u != null){
                for(Node v: u.getAdjacent()){
                    if(v.status == State.Unvisited){
                        if(v == end)
                            return true; 
                        else{
                            v.state = state.Visiting; 
                            q.add(v);
                        }
                    }
                }
            }
            u.state = State.Visited; 
            
            
        }
        return false; 
                    
    }
    
}
