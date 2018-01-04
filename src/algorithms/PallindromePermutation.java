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
public class PallindromePermutation {
    /*
    Give a string, write a function to check if its is a permutation of a 
    pallindrome. A pallindrome is a word or phrase that is the same forwards and
    backwords. 
    
    - What does it takes to be able to write a set of characters the same way 
    forwards and backwords? We need to have an even number of almost all 
    characters, so that half can be on one side and half on the other side. 
    At most one character (the middel character) can have an odd count. 
    
    */
    // Solution #1
    static boolean isPermutationPallindrome(String phrase){
        int[] table = buildCharFrequency(phrase);
        return checkMaxOneOdd(table);
    }
    private static boolean checkMaxOneOdd(int[] count){
        boolean foundOdd = false; 
        for(int c: count){
            if (c%2 == 1){
                if (foundOdd)
                    return false;
                foundOdd = true; 
            }           
        }
        return true;
    }
    private static int[] buildCharFrequency(String phrase){
        int[] table = new int[Character.getNumericValue('z')-
                              Character.getNumericValue('a')];
        for(char c: phrase.toCharArray()){
            int num = getCharNumber(c);
            if(num != -1)
                table[num] += 1; 
        }
        return table; 
    }
    
    private static int getCharNumber(char c){
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        int A = Character.getNumericValue('A');
        int Z = Character.getNumericValue('Z');
        int val = Character.getNumericValue(c);
        if(a <= val && val <= z)
            return val-a;
        else if (A <= val && val <= Z)
            return val-A;
        return -1;
    }
    public static void main(String[] args){
        String phrase = "taco belt a tleb ocat";
        System.out.println("\"" + phrase + "\"" + " is a permutation pallindrome? " + 
                String.valueOf(isPermutationPallindrome(phrase)));
    
        String phrase2 = "hello my olleh";
        System.out.println("\"" + phrase2 + "\"" + " is a permutation pallindrome? " + 
                String.valueOf(isPermutationPallindrome(phrase2)));
    
    }
    
    
    
}
