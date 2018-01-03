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
public class Unique {
    
    /*static boolean isUnique(String str){
        // There are 2^7 = 128 ASCII characters
        if(str.length() > 128 )
            return false; 
        boolean[] charSet = new boolean[128];
        for(int i=0; i< str.length(); i++){
            int val = str.charAt(i);
            if(charSet[val])
                return false;
            charSet[val] = true;
        }
        return true; 
        
    }*/
    
    // using bit vector to reduce space usage by a factor 8
    // will have a assumption that string contains lower case letter only
    
    static boolean isUnique(String str){
        int checker = 0;
        for (int i=0; i< str.length(); i++){
            int val = str.charAt(i) - 'a';
            if((checker & (1 << val)) > 0) // << --> left shift by 'val'
                return false;
            checker |= (1 << val);  // or'd and designated binary value of a
                                    // letter to its corresponding bit 
        }
        return true; 
    }
    
    public static void main(String[] args){
        String str = "apple"; 
        String str2 = "cat";
        System.out.println(str + " is unique? " + String.valueOf(isUnique(str)));
        System.out.println(str2 + " is unique? " + String.valueOf(isUnique(str2)));
    }
}
