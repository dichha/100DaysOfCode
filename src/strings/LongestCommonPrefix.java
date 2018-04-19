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
public class LongestCommonPrefix {
    static int findShortestString(String[] arr){
        int shortest = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i].length() < arr[shortest].length()){
                shortest = i; 
                //System.out.println(arr[shortest]); 
            }
        }
        return shortest; 
        
    }
    static String findNewLCP(String lcp, String sub){
        for(int i=lcp.length()-1; i>=0; i--){
            if(lcp.charAt(i) == sub.charAt(i))
                return lcp.substring(0, i+1);
            
        }
        return "";
    }
    static void longestCommonPrefix(String[] arr){
        int s = findShortestString(arr);
        //System.out.println(s); 
        int l = arr[s].length();
        //System.out.println(l); 
        String lcp = arr[s]; 
        //System.out.println(lcp); 
        
        for(int i=0; i<arr.length; i++){
           if(i != s){
               //System.out.println(arr[i]); 
               String sub = arr[i].substring(0, l);
               //System.out.println(sub);
               
               if(!lcp.equals(sub)){
                   lcp = findNewLCP(lcp, sub);
                   //System.out.println(lcp); 
                   //l = lcp.length();
                   
                   if(lcp.length() != 0){
                       l = lcp.length();
                       
                   }else{
                       break; 
                   }
                   
                    
               }
               
           } 
        }
        
        if(l != 0)
            System.out.println(lcp.substring(0, l));
        else
           System.out.println("No common prefix");
        
    }
    /*
    public static void main(String[] args){
        //String[] arr = {"geeksforgeeks", "geeks", "geek", "geezer"}; 
        String[] arr = {"apple", "ape", "april"};
        longestCommonPrefix(arr); 
    }
    */
}
