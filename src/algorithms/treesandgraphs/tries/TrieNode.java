/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.treesandgraphs.tries;

/**
 *
 * @author dichha
 */
public class TrieNode {
    /*
    Trie is a rooted tree. Its nodes have the following fields. 
    i) Maximum of R links to its children, where each link corresponds
    to one of R character values from dataset alphabet. In this article
    we assume that R is 26, the number of lowercase latin letters. 
    ii) Boolean field which specifies whether the node corresponds to the
    end of the key, or is just a key prefix. 
    */
    // R links to node children 
    private TrieNode[] links; 
    private final int R = 26; 
    private boolean isEnd; 
    public TrieNode(){
        links = new TrieNode[R];
    }
    public boolean containsKey(char ch){
        return links[ch - 'a'] != null; 
    }
    public TrieNode get(char ch){
        return links[ch - 'a'];
    }
    public void put(char ch, TrieNode node){
        links[ch - 'a'] = node; 
    }
    public void setEnd(){
        isEnd = true; 
    }
    public boolean isEnd(){
        return isEnd; 
    }
    // returns 
    
}
