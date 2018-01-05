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
    // Solution #2
    public static boolean isPermutationPallindrome2(String phrase){
        int countOdd = 0; 
        int[] table = new int[Character.getNumericValue('z') - 
                        Character.getNumericValue('a')];
        for (int i=0; i < phrase.length(); i++){
            int num = getCharNumber(phrase.charAt(i));
            if(num != -1){
                table[num]++; 
                if (table[num]%2 == 1)
                    countOdd++; 
                else
                    countOdd--;
            }
        }
        return countOdd <= 1; 
        
        
    }
    // Solution #3
    public static boolean isPermutationPallindrome3(String phrase){
        int bitvector = 0; 
        for (char c: phrase.toCharArray()){
            int num = getCharNumber(c); 
            bitvector = toggle(bitvector, num);
        }
        return ((bitvector & (bitvector -1)) == 0);
    }
    
    private static int toggle(int bitvector, int index){
        if (index < 0) 
            return bitvector;
        int mask = 1 << index; 
        if((mask & bitvector) == 0)
            return bitvector  |= mask; 
        else 
            return bitvector &= ~mask; 
    }
    
    
    public static void main(String[] args){
        String phrase = "taco belt a tleb ocat";
        System.out.println("\"" + phrase + "\"" + " is a permutation pallindrome? " + 
                String.valueOf(isPermutationPallindrome3(phrase)));
    
        String phrase2 = "hello my olleh";
        System.out.println("\"" + phrase2 + "\"" + " is a permutation pallindrome? " + 
                String.valueOf(isPermutationPallindrome3(phrase2)));
    
    }
    
    
    
}
