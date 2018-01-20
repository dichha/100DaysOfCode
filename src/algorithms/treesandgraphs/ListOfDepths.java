/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.treesandgraphs;

import java.util.LinkedList; 
import java.util.ArrayList; 


/**
 *
 * @author dichha
 */
public class ListOfDepths {
    /*
    Though we might think at first glance that this problem requires a level-by-level
    traversal, this isn't actually necessary. We can travere the graph any way 
    that we'd like, provided we know which level we're on as we do so. 
    
    We can implement a simple modification of the pre-order traversal algorithm, 
    where we pass in level+1 to the next recursive call. The code below provides
    an implementation using depth-first search.
    */
    void createLevelLinkedList(TreeNode root, ArrayList<LinkedList<TreeNode>> lists, int level){
            if (root == null) return; // base case
            LinkedList<TreeNode> list = null; 
            if(lists.size() == level){
                list = new LinkedList<TreeNode>(); 
                /* 
                Levels are always traversed in order. So, if this is the first time
                we've visited  level i, we must have seen levels 0 through i-1. We
                can therefore safely add the level at the end.
                */
                lists.add(list);
            }else{
                list = lists.get(level); 
            }
            list.add(root); 
            createLevelLinkedList(root.left, lists, level+1);
            createLevelLinedLists(root.right, lists, level+1);
            
            
    }
    ArrayList<LinkedList<TreeNode>> createLevelLinkedList(TreeNode root){
        ArrayList<LinkedList<TreeNode>> lists = new ArrayList<LinkedList<TreeNode>>(); 
        createLinkedList(root, lists, 0);
        return lists; 
    }
    
    //BFS implementation 
    ArrayList<LinkedList<TreeNode>> createLevelLinkedList(TreeNode root){ 
        ArrayList<LinkedList<TreeNode>> result = new ArrayList<LinkedList<TreeNode>>(); 
        // visit the root
        LinkedList<TreeNode> current = new LinkedList<TreeNode>(); 
        if(root != null)
            current.add(root); 
        
        while(current.size() != 0){ 
            result.add(current); // add previous level
            LinkedList<TreeNode> parents = current; 
            current = new LinkedList<TreeNode>(); 
            for (TreeNode parent : parents){
                // Visit the children 
                if(parent.left != null)
                    current.add(parent.left); 
                if(parent.right != null)
                    current.add(parent.right); 
            }
        }
        return result; 
    }
}
