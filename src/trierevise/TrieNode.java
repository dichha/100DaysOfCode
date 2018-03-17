/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trierevise;

/**
 *
 * @author dichha
 */
public class TrieNode {
    private TrieNode[] links; 
    private final int R = 26;
    private boolean isEnd; 
    
    public TrieNode(){
        links = new TrieNode[R]; 
    }
    
    public void put(char c, TrieNode node){
        links[c - 'a'] = node;
    }
    
    
}
