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
public class Tries {
    TrieNode root; 
    
    public Tries(){
        root = new TrieNode();
    }
    
    public void insert(String word){
        TrieNode node = root; 
        for(int i=0; i<word.length(); i++){
            char c = word.charAt(i);
            if(!node.containsKey(c)){
                node.put(c, new TrieNode());
            }else{
                node = node.get(c);
            }
        }
        node.isEnd = true; 
    }
    
    public TrieNode searchPrefix(String word){
         TrieNode node = root; 
         for(int i=0; i<word.length(); i++){
             char c = word.charAt(i);
             if(node.containsKey(c)){
                 node = node.get(c);
             }else{
                 return null; 
             }
         }
         return node; 
    }
    
    public boolean search(String word){
        TrieNode node = searchPrefix(word); 
        return node != null && node.isEnd; 
    }
    public boolean startWith(String prefix){
        TrieNode node = searchPrefix(prefix);
        return node != null; 
    }
    
    
}
