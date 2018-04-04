/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

import java.util.HashMap;
import java.util.Set; 
import java.util.Map; 
/**
 *
 * @author dichha
 */
public class PrintDupCharacter {
    static void printDuplicateCharacters(String word){
        char[] chars = word.toCharArray(); 
        Map<Character, Integer> charMap = new HashMap<Character, Integer>(); 
        for(char c: chars){
            if(charMap.containsKey(c))
                charMap.put(c, charMap.get(c)+1); 
            else
                charMap.put(c, 1);
        }
        // Iterate through HashMap to print all duplicate characters of String
        Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet(); 
        
        System.out.printf("List of duplicate characters in String '%s' %n", word); 
        for(Map.Entry<Character, Integer> entry: entrySet){
            if(entry.getValue() > 1){
                System.out.printf("%s: %d %n", entry.getKey(), entry.getValue()); 
                
            }
        }
    }
    /*
    public static void main(String[] args){

        printDuplicateCharacters("Programming ");
       
    }
     */
}
