/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

/**
 *
 * @author dichha
 */
public class StringRotation {
    
    static boolean isRotation(String s1, String s2){
        int len = s1.length(); 
        // Check that s1 and s2 are equal length and not empty
        if(len == s2.length() && len > 0){
            String s1s1 = s1 + s1; 
            return isSubstring(s1s1, s2); 
        }
        return false; 
    } 
    private static boolean isSubstring(String s1s1, String s2){
        return s1s1.contains(s2); 
    }
    
    public static void main(String[] args){
        String s1 = "erbottlewat"; 
        String s2 = "waterbottle"; 
        System.out.println(s2 + " is a rotation of " + s1 + ": " + String.valueOf(isRotation(s1, s2)));
        String pattern = "codecracking";
        String word = "crackingcode";
        System.out.println(word + " is a rotation of " + pattern + ": " + String.valueOf(isRotation(pattern, word)));
        
        String pattern2 = "codecracking";
        String word2 = "cracking-code";
        System.out.println(word2 + " is a rotation of " + pattern2 + ": " + String.valueOf(isRotation(pattern2, word2)));
                
    }
}
