/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.treesandgraphs;

import java.util.Random;

/**
 *
 * @author dichha
 */

class TreeNode{
    private int data; 
    public TreeNode left; 
    public TreeNode right; 
    private int size = 0; 
    public TreeNode(int d){
        data = d; 
        size = 1; 
    }
    public TreeNode getRandomNode(){
        int leftSize = (left == null)? 0 : left.size();
        Random random = new Random(); 
        int index = random.nextInt();
        if(index < leftSize){
            return left.getRandomNode();
        }else if (index == leftSize){
            return this; 
        }else{
            return right.getRandomNode();
        }
    }
    
    public int size(){
        return size; 
    }
    public int data(){
        return data; 
    }
    public void insertInOrder(int d){
        if(d <= data){
            if (left == null){
                left = new TreeNode(d);
            }else{
                left.insertInOrder(d);
            }
        }else{
            if(right == null){
                right = new TreeNode(d); 
            }else{
                right.insertInOrder(d);
            }
        }
    }
    public TreeNode find(int d){
        if(data == d){
            return this;
        }else if(d <= data){
            return left != null ? left.find(d): null;
        }else if(d > data){
            return right != null ? right.find(d): null;
        }
        return null; 
    }
}
public class RandomNode {
    
}

// Sol#2
class Tree{
    TreeNode root = null; 
    
    public int size(){
        return root == null ? 0 : root.size();
    }
    public TreeNode getRandom(){
        if (root == null){
            return null; 
        }
        Random random = new Random(); 
        int i = random.nextInt(size());
        return root.getIthNode(i);
    }  
    public void insertInOrder(int value){
        if(root == null)
            root = new TreeNode(value);
        else{
            root.insertInOrder(value);
        }
    }
    
}

class TreeNodeII{
    private int size; 
    public TreeNode left; 
    public TreeNode right;
    private int data; 
    
    public TreeNodeII(int d){
        data = d; 
    }
    // Constructor and variables are the same
    public TreeNodeII getIthNode(int i){
        int leftSize = (left == null)? 0 : left.size(); 
        if(i < leftSize){
            return left.getIthNode(i);
        }else if (leftSize == i){
            return this;
        }else{
            return right.getIthNode(i - (left.size()+1));
        }
    }
}

