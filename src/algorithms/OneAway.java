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
public class OneAway {
    /*
    Given two strings, write a function to check if they are one edit(or zero) e
    edits away
    */
    static boolean oneEditAway(String first, String second){
        if (first.length() == second.length())
            return oneEditReplace(first, second);
        else if(first.length()+1 == second.length())
            return oneEditInsert(first, second);
        else if (first.length()-1 == second.length())
            return oneEditInsert(second, first);
        return false; 
    }
    private static boolean oneEditReplace(String s1,  String s2){
        boolean foundDifference = false;
        int index = 0; 
        while (index < s1.length()){
            if (s1.charAt(index) != s2.charAt(index)){
                if(foundDifference)
                    return false; 
                foundDifference = true; 
                
            }
            index++; 
        }
        return true; 
                
    }
    private static boolean oneEditInsert(String s1, String s2){
        int index1 = 0; 
        int index2 = 0; 
        while(index1 < s1.length() && index2 < s2.length()){
            if(s1.charAt(index1) != s2.charAt(index2)){
                if(index1 != index2)
                    return false;
                index2++; 
            }else{
                index1++; 
                index2++; 
            }
        }
        return true; 
    }
    
    public static void main(String[] args){
        String s1 = "pale"; 
        String s2 = "bale"; 
        System.out.println("OneEditReplace of two strings " + s1 + " & " + s2 + " : " + oneEditAway(s1, s2));
        String s3 = "pale"; 
        String s4 = "ple"; 
       
        System.out.println("OneEditInsert of two strings " + s3 + " & " + s4 + " : " + oneEditAway(s3, s4));
        String s5 = "pale"; 
        String s6 = "bake"; 
        System.out.println("OneEditReplace of two strings " + s5 + " & " + s6 + " : " + oneEditAway(s5, s6));
    }
}
