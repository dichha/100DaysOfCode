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
public class MinimalTree {
    TreeNode createMinimalBST(int[] array){
        return creteMinimalBST(array, 0, array.length-1); 
    }
    TreeNode createMinimalBST(int[] array, int start, int end){
        if(end < start)
            return null; 
        int mid = (start + end)/ 2; 
        TreeNode n = new TreeNode(array[mid]); 
        n.left = createMinimalBST(array, 0, mid-1)
        n.right = createMinimalBST(array, mid+1, array.length-1);         
        return n; 
    }
    
    
}
