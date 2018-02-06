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
class Node{
    int data; 
    Node left, right; 
    Node(int data){
        this.data = data;
        left = right = null; 
    }
}

public class MirrorTree {
    
    Node root; 
    void mirror(){
        root = mirror(root); 
    }
    Node mirror(Node node){
        if (node == null){
            return node;
        }
        Node left = mirror(node.left); 
        Node right = mirror(node.right); 
        
        node.left = right; 
        node.right = left; 
        
        return node; 
    }
    void inOrder(){
        inOrder(root);
    }
    void inOrder(Node node){
        if (node == null){
            return;
        }
        inOrder(node.left);
        System.out.print(node.data + " "); 
        inOrder(node.right);
    }
    public static void main(String[] args){
        MirrorTree tree = new MirrorTree(); 
        tree.root = new Node(1);
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5);
        // print inorder traversal of the input tree
        System.out.println("Inorder traversal of input tree is : ");
        tree.inOrder();
        System.out.println("");
        
        // Convert tree to its mirror
        tree.mirror();
        
        // print inorder traversal of the minor tree
        System.out.println("Inorder traversal of binary tree is: "); 
        tree.inOrder();
    }
    
    
    
}
