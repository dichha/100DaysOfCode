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
class NodeP{
    int data; 
    NodeP left; 
    NodeP right; 
    NodeP(int data){
        this.data = data; 
        left = right = null; 
    }
}
public class PrintNodesInKthDis {
    NodeP root; 
    void printKDistant(NodeP node, int k){
        if(node == null)
            return; 
        if(k == 0){
            System.out.print(node.data + " ");
            return; 
        }
        printKDistant(node.left, k-1);
        printKDistant(node.right, k-1);
    }
    /*
    public static void main(String[] args){
        PrintNodesInKthDis tree = new PrintNodesInKthDis(); 
        tree.root = new NodeP(1);
        tree.root.left = new NodeP(2); 
        tree.root.right = new NodeP(3);
        tree.root.left.left = new NodeP(4); 
        tree.root.left.right = new NodeP(5); 
        tree.root.right.left = new NodeP(8);
        
        tree.printKDistant(tree.root, 2);
    }
*/
    
}
