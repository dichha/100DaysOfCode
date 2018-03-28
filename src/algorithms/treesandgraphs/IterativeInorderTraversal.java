/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.treesandgraphs;

import java.util.Stack; 
/**
 *
 * @author dichha
 */
  class Node2{
        int data; 
        Node2 left; 
        Node2 right; 
        Node2(int data){
            this.data = data; 
        }
    }
public class IterativeInorderTraversal {
    public void inorderRecursive(Node2 root) {
        if (root != null) {
                inorderRecursive(root.left);
                System.out.print(root.data + " ");
                inorderRecursive(root.right);
        }
    }
  
    Stack<Node2> stack  = new Stack<Node2>(); 
    public void inorderIteration(Node2 root){
        while(true){
            // Go to the left extreme and on the way push the node into stack
            while(root != null){
                stack.push(root);
                // System.out.print(root.data + " ");
                root = root.left;
                
            }
            if(stack.isEmpty()){
                return; 
            }
            root = stack.pop();
            System.out.print(root.data + " ");
            root = root.right; 
            
        }
        
    }
    /*
    public static void main(String[] args){
        Node2 root = new Node2(1); 
        root.left = new Node2(2); 
        root.right = new Node2(3); 
        root.left.left = new Node2(4); 
        root.left.right = new Node2(5); 
        
        IterativeInorderTraversal i = new IterativeInorderTraversal(); 
        i.inorderIteration(root);
        System.out.println();
        i.inorderRecursive(root);
        
    }
    */
     
}
