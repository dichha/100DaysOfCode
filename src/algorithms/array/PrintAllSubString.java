/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.array;

/**
 *
 * @author dichha
 */
public class PrintAllSubString {
    static void printAllSubString(String str){
        for(int i=0; i<str.length(); i++){
            String s = Character.toString(str.charAt(i)) + " "; 
            System.out.println(s + " ");
            for(int j=i+1; j<str.length(); j++){
                s += Character.toString(str.charAt(j)) + " ";
                System.out.println(s);
            }
            System.out.println(); 
        }
    }
    /*
    public static void main(String[] args){
        String str = "abcd"; 
        printAllSubString(str);
    }
    */
    
}
