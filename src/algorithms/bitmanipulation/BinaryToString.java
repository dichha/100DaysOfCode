/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.bitmanipulation;

/**
 *
 * @author dichha
 */
public class BinaryToString {
    
    static String printBinary(double num){
        if(num >= 1 || num <= 0){
            return "ERROR";
        }
        StringBuilder binary = new StringBuilder(); 
        binary.append("."); 
        while(num > 0){
            // Setting a limit on length: 32 characters
            if (binary.length() >= 32){
                return "ERROR";
            }
           
            double r = num * 2; 
            System.out.println("Inside while loop" + binary);
            if (r >= 1){
                binary.append(1); 
                num = r - 1; 
            }else {
                binary.append(0); 
                num = r; 
            }
        }
        return binary.toString(); 
    }
    public static void main(String[] args){
        String ans = printBinary(0.71);
        System.out.println(ans);
    }
    
}
