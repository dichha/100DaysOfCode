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
public class ValidateBST {
    
    int index= 0; 
    void copyBST(TreeNode root, int[] array){
        if (root == null) 
            return; 
        copyBST(root.left, array); 
        int data = root.data;
        array[index] = data; 
        index++; 
        copyBST(root.right, array); 
    
    }
    boolean checkBST(TreeNode root){
        int[] array = new int[root.size];
        copyBST(root, array); 
        for(int i=1, i<root.size; i++){
            if (array[i] <= array[i])
                return false; 
        }
        return true; 
    }
    
    //implementation without array
    Integer last_printed = null; 
    boolean checkBST(TreeNode n){
        if (n == null)
            return true; 
        
        // Check / recurse left
        if(!checkBST(n.left))
            return false; 
        
        // Check current 
        if(last_printed != null && n.data <= last_printed)
            return false; 
        
        last_printed = n.data; 
        
        // Check / recurse right
        if(!checkBST(n.right))
            return false; 
        
        return true; 
                    
    }
    
    // Solution #2
    
    boolean checkBST(TreeNode n ){
        return checkBST(n, null, null);
    }
    
    boolean checkBST(TreeNode n, min, max){
        if(n == null)
            return true; 
        
        if(min != null && n.data <= min) || (max != null && max > n.data)
            return false; 
            
        if(!checkBST(n.right, n.data, null) || !checkBST(n.left, null, n.data))
            return false;
                    
        return true; 
    }    
}
