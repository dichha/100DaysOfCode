/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.bitmanipulation;

import java.util.ArrayList;

/**
 *
 * @author dichha
 */
public class FlipBitToWin {
    static int SEQUENCE_LENGTH = 32; 
    static int longestSequence(int n){
        int max = 0; 
        for(int i=0; i<SEQUENCE_LENGTH; i++){
            max = Math.max(max, longestSequenceOf1s(n,i));
        }
        return max; 
    }
    static int longestSequenceOf1s(int n, int idxToIgnore){
        int counter=0;
        int max = 0; 
        for (int j=0; j< SEQUENCE_LENGTH; j++){
            if(j == idxToIgnore || getBit(n, j)){
                counter++;  
                
            }else{
                counter=0;
            }
            max = Math.max(max, counter);
        }
        return max; 
        
    }
    static boolean getBit(int n, int idx){
        return (n & (1 << idx)) != 0; 
    }
    /*
    public static void main(String[] args){
        int n = 1775;
        int count = longestSequence(n);
        System.out.print(count);
        
        
    }
    */
    
    //Improved Solution
    int longestSequence(int n){
        
        if (n == -1) return SEQUENCE_LENGTH; // special case of no zeros at all. 
        
        ArrayList<Integer> sequences = getAlternatingSequences(n); 
        return findLongestSequence(sequences); 
        
    }
    // Return list of the sequence sizes. The sequence starts offf with the number of 0s
    // which might be (0) and then alternates with the counts of each values
    
    ArrayList<Integer> getAlternatingSequences(int n){
        ArrayList<Integer> sequences = new ArrayList<Integer>(); 
        int searchingFor = 0; 
        int counter = 0; 
        
        for (int i=0; i < SEQUENCE_LENGTH; i++){ 
            if ((n & 1) != searchingFor){
                sequences.add(counter); 
                searchingFor = n & 1; // Flip 1 to 0 or 1 
                counter = 0; 
            }
             counter++; 
            n >>>= 1; // We want to shift the sign bit too. 
        }
        sequences.add(counter); 
        return sequences;
    }
    int findLongestSequence(ArrayList<Integer> seq){
        int maxSeq = 1; 
        for (int i = 0; i < seq.size(); i += 2){
            int zerosSeq = 1; 
            int onesSeqRight = i - 1 >= 0 ? seq.get(i-1) : 0; 
            int onesSeqLeft = i + 1 < seq.size() ? seq.get(i+1): 0;
            
            int thisSeq = 0; 
            if (zerosSeq == 1){// can merge
                thisSeq = onesSeqLeft + 1 + onesSeqRight; 
            }else if(zerosSeq > 1){
                thisSeq = 1 + Math.max(onesSeqRight, onesSeqLeft);
            }else if (zerosSeq == 0){ // no zeros but take either side
                thisSeq = Math.max(onesSeqRight, onesSeqLeft); 
            }
            maxSeq = Math.max(thisSeq, maxSeq); 
        }
        return maxSeq; 
    }
     
}
