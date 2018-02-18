/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.array;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dichha
 */
public class FirstNonRepeatingCharacter {

    /*
    static char[] numOfChars = new char[256]; 
    static void getCharCount(String str){
        for(int i=0; i<str.length(); i++){
            numOfChars[str.charAt(i)]++;
        }
    }
    static int firstNonRepeating(String str){
        getCharCount(str);
        int idx = -1; 
        for(int i=0; i < numOfChars.length; i++){
            if(numOfChars[str.charAt(i)] == 1){
              idx = i;   
              
              break; 
            }    
        }
        return idx; 
    }
    */
    static int MAX_CHAR = 256; 
    static void findFirstNonRepeating(){
        // inDLL[x] contains pointer to a DLL node if x is present
        // in DLL. If x is not present, then inDLL[x] is NULL
        List<Character> inDLL = new ArrayList<Character>(); 
        
        // repeated[x] is true if x is repeated two or more times. 
        // If x is not seen so far or x is seen only once, then 
        // repeated[x] is false
        boolean[] repeated = new boolean[MAX_CHAR]; 
        
        // let us consider following stream and see the process
        String stream = "geeksforgeeksandgeeksquizfor"; 
        for(int i= 0; i<stream.length(); i++){
            char x = stream.charAt(i); 
            System.out.println("Reading " + x + " from stream n");
            
            // We process this character only if it has not occured 
            // or occured only once. 
            if(!repeated[x]){
                //If the character is not in DLL, then add this at 
                // the end of the DLL.
                if(!inDLL.contains(x)){
                    inDLL.add(x); 
                }else{
                    inDLL.remove((Character)x); 
                    repeated[x] = true; 
                }
                
            }
            //Print the current first non-repeating character from stream
            if(inDLL.size() != 0){
                System.out.print("First non-repeating character so far is ");
                System.out.println(inDLL.get(0));
            }
                
        }
    }
    /*
    public static void main(String[] args){
        findFirstNonRepeating(); 
        //String str = "geeksforgeeks"; 
        //int i = firstNonRepeating(str);
        //System.out.print(i);
        //System.out.println(str.charAt(i));
    }
*/
}
