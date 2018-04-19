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
public class StringToInteger {
    static int stoi(String s){
       int n=-1;
       try{
           n = Integer.parseInt(s);
           
       }catch(NumberFormatException e){
           return n; 
       }
       return n; 
       
    }
    /*
    public static void main(String[] args){
        String s = "123a"; 
        int n = stoi(s); 
        System.out.println(n); 
    }
    */
}
