/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.treesandgraphs;

import java.util.HashMap;

/**
 *
 * @author dichha
 */
public class PathWithSum {
    
    int countPathWithSum(TreeNode root, int targetSum){
        if (root == null)
            return 0; 
        // Count path with sum starting from the root
        int pathFromRoot = countPathsWithSumFromNode(root, targetSum, 0); 
        
        // Try the nodes on the left and right
        int pathOnLeft = countPathWithSum(root.left, targetSum); 
        int pathOnRight = countPathWithSum(root.right, targetSum);
        
        return pathOnLeft + pathFromRoot + pathOnRight; 
        
    }
    
    // Returns the number of paths with this sum starting from this node
    int countPathsWithSumFromNode(TreeNode node, int targetSum, int currentSum){
        int totalPaths = 0; 
        if (currentSum ==  targetSum){
            totalPaths ++; 
        }
        totalPaths += countPathsWithSumFromNode(node.left, targetSum, currentSum);
        totalPaths += countPathsWithSumFromNode(node.right, targetSum, currentSum);
        return totalPaths; 
    }  
    
    int countPathsWithSum(TreeNode root, int targetSum){
        if (root == null) return 0; 
        HashMap<Integer, Integer> pathCount = new HashMap<Integer, Integer>(); 
        incrementHashTable(pathCount, 0, 1); 
        return countPathWithSum(root, targetSum, 0, pathCount); 
    }
    int countPathWithSum(TreeNode node, int targetSum, int runningSum, HashMap<Integer, Integer> pathCount){
        if(node == null) return 0; // Base case;
        runningSum += node.data; 
        incrementHashTable(pathCount, runningSum, 1); 
        
        // Count paths with sum ending at the current node. 
        int sum = runningSum - targetSum; 
        int totalPaths = pathCount.containsKey(sum) ? pathCount.get(sum) : 0; 
        
        // Count paths with sum on the left and right
        totalPaths += countPathWithSum(node.left, targetSum, runningSum, pathCount);
        totalPaths += countPathWithSum(node.right, targetSum, runningSum, pathCount);
        
        incrementHashTable(pathCount, runningSum, -1);
        return totalPaths; 
        
    }
    void incrementHashTable(HashMap<Integer, Integer> hashTable, int key, int delta){
        if(!hashTable.containsKey(key)){
            hashTable.put(key, 0);
        }
        hashTable.put(key, hashTable.get(key) + delta);
    }
    
    
}
