/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dichha
 */
public class BinHexEquivalence {
    /*
    - A function to check if the value of a binary number 
      (passed as a string) equals the hexadecimal representation 
      of a string. 
    */
    public static int digitToValue(char c){
        if(c >= '0' && c <= '9')
            return c - '0';
        else if ( c >= 'A' && c <= 'F')
            return 10 + c - 'A'; 
        else if ( c >= 'a' && c <= 'f')
            return 10 + c - 'a';
        else
            return -1; 
    }
    public static int convertToBase(String number, int base){
        if (base < 2 || (base > 10 && base != 16))
            return -1; 
        int value = 0; 
        for (int i = number.length()-1; i >= 0; i --){
            // System.out.println( "char: " + number.charAt(i));
            int digit = digitToValue(number.charAt(i));
            // System.out.println("digit: " + digit); 
            if (digit < 0  || digit >= base)
                return -1; 
            int exp = number.length()-1-i; 
            value += digit * Math.pow(base,exp); 
            //System.out.println(base + " " + number + " : " + Integer.toString(value));
        }
        return value; 
    }
    public static boolean compareBinToHex(String binary, String hex){
        int n1 = convertToBase(binary, 2); 
        int n2 = convertToBase(hex, 16);
        System.out.println(n1 + " " + n2);
        if (n1 < 0 || n2 < 0)
            return false; 
        else
            return n1 == n2; 
    }
    public static void main(String[] args){
      System.out.println(compareBinToHex("111001011", "1CB"));
      System.out.println(compareBinToHex("110111100", "1CB"));
    }
}
