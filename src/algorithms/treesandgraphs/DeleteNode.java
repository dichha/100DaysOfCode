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
class NodeD{
    NodeD next; 
    int data; 
    NodeD(int data){
        this.data = data; 
        next = null; 
    }
}
public class DeleteNode {
    NodeD head; 
    // Given a reference to the head of a list
    // and an int, insert a new Node on the 
    // front of the list
    public void push(int new_data){
        NodeD newNode = new NodeD(new_data); 
        
        newNode.next = head;  
        
        head = newNode;        
    }
    public void deleteNode(NodeD nodePtr){
        NodeD temp = nodePtr.next; 
        nodePtr.data = temp.data;
        nodePtr.next = temp.next;
        temp = null; 
    }
}
