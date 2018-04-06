/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

import java.util.Arrays;

/**
 *
 * @author dichha
 */
public class WellOrderedPermutations {
    /* Logic
        1) Get the input sequence
        2) Find out all the permutations of a String
        3) Before printing check if the permutation is well formed 
    */
    static char[] A; 
    static void wellFormedStrings(String s){
        A = s.toCharArray(); 
        permutation(A, 0); 
    }
    static void permutation(char[] A, int left){
        if(left == A.length){
            if(isWellFormed(A)){
                System.out.println(Arrays.toString(A));
            }
            return; 
        }else{
            for(int i=left; i<A.length; i++){
                swap(i, left); 
                permutation(A, left+1); 
                swap(i, left); //backtrack
            }
        }
    }
    static void swap(int a, int b){
        char tmp = A[a]; 
        A[a] = A[b]; 
        A[b] = tmp; 
    }
    
    static boolean isWellFormed(char[] A){
        boolean wellFormed = true; 
        for(int i=0; i<A.length-1; i++){
            if(Character.toLowerCase(A[i]) > Character.toLowerCase(A[i+1])){
                wellFormed = false;
                break; 
            }
        }
        return wellFormed;   
    }
    /*
    public static void main(String[] args){
        String S = "Interview"; 
        System.out.println("Given String: " + S );
        wellFormedStrings(S);
    }
    */
}
