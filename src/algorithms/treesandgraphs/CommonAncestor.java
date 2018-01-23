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
public class CommonAncestor {
    // Sol. #1: With Link to Parents
    TreeNode commonAncestor(TreeNode p, TreeNode q){
        if(p == q)
            return null; 
        TreeNode ancestor = p;
        
        while(ancestor != null){
            if(isOnPath(ancestor, q))
                return ancestor;
            ancestor = ancestor.parent;
        }
        return null; 
        
    }
    boolean isOnPath(TreeNode ancestor, TreeNode node){
        while(node != null && node != ancestor)
            node = node.parent; 
        return node == ancestor; 
    }
    
    
}
