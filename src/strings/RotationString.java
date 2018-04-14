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
public class RotationString {
    static boolean checkRotation(String s1, String s2){
        if(s1.length() != s2.length())
            return false; 
        String s3 = s2 + s2; 
        if(s3.contains(s1))
            return true;
        else 
            return false; 
                    
    }
    /*
    public static void main(String[] args){
        String s1 = "san3tiago"; 
        String s2 = "tiagosan3"; 
        boolean ans = checkRotation(s1, s2); 
        System.out.println(ans); 
    }
    */
    
}
