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
public class StringCompression {
    static String compressString(String str){
        int countConsecutive = 0; 
        StringBuilder compression = new StringBuilder(); 
        // Check if the next charcter is same as the current one
        for (int i=0; i < str.length(); i++){
            countConsecutive++; 
            if(i+1 >= str.length() || str.charAt(i+1) != str.charAt(i)){
                compression.append(str.charAt(i));
                compression.append(countConsecutive);
                countConsecutive = 0;
                        
            }  
            
        }
        System.out.println(compression.toString());
        return compression.length() < str.length()? compression.toString() : str; 
        
    }
    public static void main(String[] args){
        String s1 = "aaavdAAef0"; 
        System.out.println("compressed version of String " + " s1: " + s1 + " : " +
            compressString(s1));
        String s2 = "aaaabbbbcccceeeee";
        System.out.println("compressed version of String " + " s2: " + s2 + " : " + 
            compressString(s2));
    }
}
