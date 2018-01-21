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
public class InOrderSuccessor {
    TreeNode inorderSucc(TreeNode n){
        if (n == null)
            return null; 
        // Found right children => return leftmost node of right subtree
        if(n.right != null){ 
            return leftMostChild(n.right);
        }else{
            TreeNode q = n; 
            TreeNode x = q.parent;
            
            // Go up until we're on left left instead of right
            while(x != null && x.left != q){
                q = x; 
                x = x.parent; 
            }
            return x; 
        }
        
        
    }
    TreeNode leftMostChild(TreeNode n){
        if (n == null)
            return null; 
        while(n.left != null)
            n = n.left; 
        return n; 
    }
}
