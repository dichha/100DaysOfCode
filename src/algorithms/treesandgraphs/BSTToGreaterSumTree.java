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
public class BSTToGreaterSumTree {
    static class Node{
        Node left; 
        Node right; 
        int data; 
        public Node(int data){
            this.data = data; 
            left = null; 
            right = null; 
        }
    }
    public static int sum = 0; 
    public void greaterTree(Node root){
        if(root != null){
            greaterTree(root.right);
            // store the node value in temp
            int temp = root.data; 
            // update the sum, sum till previous visited one
            root.data = sum; 
            // update the sum
            sum = sum + temp; 
            greaterTree(root.left); 
            
        }else{
            return; 
        }
       
    }
    public void inorder(Node root){
        if(root != null){
             inorder(root.left); 
            System.out.print(root.data + " ");
            inorder(root.right);
        }
        
    }
    /*
    public static void main(String[] args){
        Node root = new Node(10); 
        root.left = new Node(5); 
        root.right = new Node(15); 
        root.left.left = new Node(2); 
        root.left.right = new Node(7); 
        root.right.left = new Node(12); 
        root.right.right = new Node(20); 
        
        BSTToGreaterSumTree b = new BSTToGreaterSumTree(); 
        b.inorder(root); 
        System.out.println(); 
        b.greaterTree(root); 
        b.inorder(root); 
        
        
    }
    */
    
}

