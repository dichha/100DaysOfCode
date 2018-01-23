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
public class BSTSequence {
    
    ArrayList<LinkedList<Integer>> allSequence(TreeNode node){
        ArrayList<LinkedList<Integer>> result = new ArrayList<LinkedList<Integer>>(); 
        
        if(node == null){
            result.add(new LinkedList<Integer>()); 
            return result; 
        }
        LinkedList<Integer> prefix = new LinkedList<Integer>(); 
        prefix.add(node.data); 
        
        // Recurse on the left and right subtree
        ArrayList<LinkedList<Integer>> leftSeq = allSequences(node.left); 
        ArrayList<LinkedList<Integer>> rightSeq = allSequences(node.right);
        
        // Weave together each list from the left and rigth sides 
        for (LinkedList<Integer> left: leftSeq){
            for (LinkedList<Integer> right: rightSeq){
                ArrayList<LinkedList<Integer>> weaved = new ArrayList<LinkedList<Integer>>(); 
                weaveLists(left, right, weaved, prefix); 
                result.addAll(weaved);
            }
        }
        return result; 
    }
    
    /* 
    Weave lists together in all possible ways. This algorithm works by removing
    head from one list, recursing, and then doing the same thing with the other
    list. 
    
    */
    void weaveLists(LinkedList<Integer> first, LinkedList<Integer> second, 
            ArrayList<LinkedList<Integer>> results, LinkedList<Integer> prefix){
            // one list is empty. add remainder to [cloned] prefix and store resutl
            if(first.size() == 0 || second.size() ==  0){
                LinkedList<Integer> result = (LinkedList<Integer>) prefix.clone();
                result.addAll(first); 
                result.addAll(second); 
                results.add(result);
            }
            // Recurse w/ head of first added to the prefix. Removing the head 
            // will damage first, so we'll need to put it back where we found it
            // afterwards. 
            int headFirst = first.removeFirst();
            prefix.addLast(headFirst); 
            weaveLists(first, second, results, prefix); 
            prefix.removeLast(); 
            first.addFirst(headFirst); 
            
            /*
            Do the same thing w/ second, damaging and then restoring
            */
            int headSecond = second.removeFirst(); 
            prefix.addLast(headSecond); 
            weaveLists(first, second, results, prefix); 
            prefix.removeLast(); 
            second.addFirst(headSecond); 
                
    }
}
