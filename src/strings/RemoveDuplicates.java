/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set; 
import java.util.Iterator; 
import java.util.LinkedHashSet; 
import java.lang.StringBuilder; 
/**
 *
 * @author dichha
 */
public class RemoveDuplicates {
    /*
    // using sorting
    public static String removeDuplicates(String s){
        char[] chars = s.toCharArray(); 
        Arrays.sort(chars);
        String nodups = ""; 
        for(int i=1; i<chars.length; i++){
            if(chars[i-1]!= chars[i]){
                nodups += chars[i-1];
            }
        }
        // for last element
        if(chars[s.length()-1] != chars[s.length()-2]){
            nodups += chars[s.length()-1];
        }
        return nodups; 
        
    }
    */
    
    // using HashSet 
    /*
    public static String removeDuplicates(String s){
        char[] arrays = s.toCharArray(); 
        Set<Character> set = new HashSet<Character>(); 
        for(char c: arrays){
            set.add(c);
        }
        Iterator<Character> iterator = set.iterator(); 
        String nodups = ""; 
        while(iterator.hasNext()){
            nodups += iterator.next(); 
        }
        return nodups; 
        
    }
    */
    /*
    public static String removeDuplicates(String s){
        char[] chars = s.toCharArray(); 
        LinkedHashSet<Character> lhs = new LinkedHashSet(); 
        
        for(char c: chars)
            lhs.add(c); 
        
        Iterator<Character> iterator = lhs.iterator(); 
        
        String nodups = ""; 
        while(iterator.hasNext()){
            nodups += iterator.next(); 
        }
        
        return nodups; 
         
    }
    */
    
    public static String removeDuplicates(String s){
        char[] chars = s.toCharArray(); 
        boolean[] asciiSet = new boolean[256]; 
        
        StringBuilder sb = new StringBuilder(); 
        for(int i=0; i<chars.length; i++){
            if(asciiSet[chars[i]])
                continue; 
            asciiSet[chars[i]] = true;
            sb.append(chars[i]);
        }
        return sb.toString(); 
        
    }
    public static void main(String[] args){
        String s = "TheHitchhiker'sGuideToTheGalaxy"; 
        System.out.println(removeDuplicates(s));
    }
}
