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
public class WellFormedParen {
    static boolean isWellFormed(String s){
        int closeParen = 0; 
        int openParen = 0; 
        char[] arr = s.toCharArray(); 
        for(char c: arr){
            if(c == '{')
                openParen ++; 
            else if (c == '}')
                closeParen ++; 
            if(closeParen > openParen)
                return false; 
            
        }
        if(openParen == closeParen)
            return true; 
        else
            return false; 
         
    }
    public static void main(String[] args){
        String x1 = "{{{{}}}}{}{}{}{}{}{}{}{}{}{}{{{}}}"; 
        String x2 = "{}{"; 
        String x3 = "}{"; 
        
        boolean ans = isWellFormed(x1);
        System.out.println(ans); 
        boolean ans2 = isWellFormed(x2);
        System.out.println(ans2);
        boolean ans3 = isWellFormed(x3);
        System.out.println(ans3);
    }
}
