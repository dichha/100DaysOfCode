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
public class Permutation {
    // checking two strings are permutation of each other
    // Solution 1: Sort the Array
    /*
    private static String sort(String s){
        char[] charArray = s.toCharArray();
        java.util.Arrays.sort(charArray);
        return new String(charArray);
    }
    static boolean isPermutation(String s1, String s2){
        if (s1.length() != s2.length())
            return false; 
        return sort(s1).equals(sort(s2));
    }
    */
    
    /*
    Solution 2: count the number of character in s1 and then compare it to s2
    
    */
    static boolean isPermutation(String s1, String s2){
        if(s1.length() != s2.length())
            return false; 
        int[] letters = new int[128]; // Assumption
        
        for(char c: s1.toCharArray())
            letters[c]++;
        /*
        for (int i=0; i< letters.length; i++){
            System.out.print(Integer.toString(letters[i]) + " ");
        }*/
        for(char c2: s2.toCharArray()){
            letters[c2]--;
            if(letters[c2] < 0)
                return false; 
        }
        return true;
    }
    public static void main(String[] args){
        String s1 = "Missisipi"; 
        String s2 = "ipisissiM";
        System.out.println(s1 + " " + s2 + " are permutation of each other: "
        + String.valueOf(isPermutation(s1, s2)));
                
        String s3 = "apple"; 
        String s4 = "applet";
        System.out.println(s3 + " " + s4 + " are permutation of each other: "
        + String.valueOf(isPermutation(s3, s4)));
        
    }
    
    
}
