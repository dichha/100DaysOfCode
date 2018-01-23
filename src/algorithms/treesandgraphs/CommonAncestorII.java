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
public class CommonAncestorII {
    
    TreeNode commonAncestor(TreeNode root, TreeNode p, TreeNode q){
        // Check if either node is not in the tree, or if one covers the other
        if(!covers(root, p)|| !covers(root, q))
            return null; 
        else if (covers(p, q))
            return p; 
        else if (covers(q, p))
            return q;
        
        // Traverse upwards until you find a node that covers q
        TreeNode sibling = getSibling(p); 
        TreeNode parent = p.parent; 
        while(!covers(sibling, q)){
            sibling = getSibling(parent); 
            parent = parent.parent;
        }
        return parent; 
    }
    
    boolean covers(TreeNode root, TreeNode p){
        if (root == null) 
            return false; 
        if (root == p)
            return true;
        return covers(root.left, p) || covers(root.right, p); 
    }
    TreeNode getSibling(TreeNode node){
        if(node == null || node.parent == null)
            return null; 
        TreeNode parent = node.parent; 
        return parent.left == node? parent.right : parent.left; 
    }
    
}
