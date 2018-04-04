/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

/**
 *
 * @author dichha
 */
public class Anagram {
    static boolean checkAnagram(String word1, String word2){
        char[] chars = word1.toCharArray(); 
        StringBuilder sb = new StringBuilder(word2); 
        
        for(char c: chars){
            int index = sb.indexOf(Character.toString(c)); 
            if(index != -1){
                sb.deleteCharAt(index);
            }else{
                return false; 
            }
        }
        return sb.length() == 0 ?  true: false; 
    }
    /*
    public static void main(String[] args){
        boolean ans = checkAnagram("pots", "tops"); 
        System.out.print(ans);
         boolean ans2 = checkAnagram("pot", "tops"); 
        System.out.print(ans2);
    }
    */
    
}
