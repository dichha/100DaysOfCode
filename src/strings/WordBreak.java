package strings;

import java.util.HashSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dichha
 */
public class WordBreak {
    static void wordBreak(String s, HashSet<String> hs){
        if(find(s, hs, "")){
            
        }else{
            System.out.println("Can't Break");
        }
    }
    static boolean find(String s, HashSet<String> dict, String answer){
        System.out.println(s + " " + answer); 
        if(s.length() == 0){
            System.out.println(answer);
            return true; 
        }else{
            int index = 0; 
            String word = ""; 
            while(index < s.length()){
                word += s.charAt(index); // add one char at a time
                // check if word exists in dictionary
                if(dict.contains(word)){
                    // add word to the answer and make recursive call
                    if(find(s.substring(index + 1), dict, answer + word + " ")){
                        return true; 
                    }else{
                        System.out.println(word + " backtrack");
                        index++; 
                    }
                }else{
                    index++; 
                }
                
            }
            return false; 
        }
    }
    /*
    public static void main(String[] args){
        HashSet<String> hs = new HashSet<String>(); 
        hs.add("this"); 
        hs.add("is"); 
        hs.add("sumit"); 
        hs.add("jain");
        hs.add("the"); 
        hs.add("problem"); 
        
        //String s = "thisissumitjain"; 
        
        String s = "thisisnotsumitjain"; 
        wordBreak(s, hs); 
    }
    */
    
}
