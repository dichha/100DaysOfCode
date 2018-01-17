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
public class Trie {
    /*
    We insert a key by seraching into the trie. We start from the root
    and search a link, which corresponds to the first character. There
    are 2 cases: 
    i) A link exists: Then we move down the tree following the links
    to the next child level. The algorithm continues with searching for
    the next key character. 
    ii) A link does not exist. Then we create a new node and link it with
    the parent's link matching the current key character. We repeat the
    step until we encounter the last character of the key, then we mark 
    the current node as an end node and the algorihtm finished. 
    */
    private TrieNode root; 
    public Trie(){
        root = new TrieNode(); 
    }
    
    // Insert a word into the trie. 
    public void insert(String word){
        TrieNode node = root; 
        for(int i=0; i<word.length(); i++){
            char currentChar = word.charAt(i); 
            if(!node.containsKey(currentChar)){
                node.put(currentChar, new TrieNode());
            }
            node = node.get(currentChar);
        }
        node.setEnd(); 
    }
    
    // Search for a key in a trie
    /*
    Each key is represented in the trie as a path from the root the 
    internal node or leaf. We start from the root w/ the first key character. 
    We examine the current node for a link corresponding to the key character. 
    There are 2 cases: 
    A link exist. We move to the next node in the path following this link, 
    and proceed searching for then next key character. 
    A link does not exist. If there are no available key characters and
    current node is marked as isEnd we return true. O/w there are possible 
    2 cases in each of them we return false: 
    a) There are key characters left, but it is impossible to follow the 
    key path in the trie, and the key is missing. 
    b) No key characters left, but current node is not marked as isEnd. 
    Therefore, the search key is only a prefix of another key in the trie.
    */
    
    // Search a prefix or whole key in trie and 
    // returns the node where search ends. 
    
    private TrieNode searchPrefix(String word){
        TrieNode node = root; 
        for(int i=0; i< word.length(); i++){
            char curLetter = word.charAt(i);
            if(node.containsKey(curLetter)){
                node = node.get(curLetter);
            }else{
                return null; 
            }
        }
        return node; 
    }
    
    // Returns if the word is in the trie
    public boolean search(String word){
        TrieNode node = searchPrefix(word);
        return node != null && node.isEnd(); 
    }
    // Returns if thre is any word in the trie
    // that starts with the given prefix
    public boolean starsWith(String prefix){
        TrieNode node = searchPrefix(prefix);
        return node != null; 
    }
}
