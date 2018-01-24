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
public class CheckSubTree {
    boolean containsTree(TreeNode t1, TreeNode t2){
        if(t2 == null) //  The empty tree is always a subtree
            return true; 
        return subTree(t1, t2); 
    }
    boolean subTree(TreeNode r1, TreeNode r2){
        if(r1 == null)
            return false; // big tree  is empty and subtree still not found
        else if (r1.data == r2.data && matchTree(r1, r2)){
            return true;
        }else{
            return subTree(r1.left, r2) || subtree(r2.right, r2);
        }      
    }
    boolean matchTree(TreeNode r1, TreeNode r2){
        if(r2 == null && r1== null)
            return true; // nothing left in the subtree
        else if (r2 == null || r1 == null)
            return false; // big tree is empty and subtree still not found
        else if(r2.data != r1.data)
            return false; 
        else
            return  matchTree(r1.left, r2.left) && matchTree(r1.right, r2.right); 
    }
    
}
