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
public class URLify {
    public static String replaceSpaces(char[] str, int length){
        // The algorithm employs a 2-scan approach. 
        // In the first scan, count the number of spces. By tripling this 
        // number, we can compute how many extra characrters we will have in 
        // in the final string. 
        
        // In the second pass, which is done in reverse , we acfually edit the string. 
        // Wehen we seea space, we replace it with %20. If there is no space, then 
        // we copy the original character
        
        int spaceCount = 0; 
        int index = 0; 
        for (int i=0; i< length; i++){
            if(str[i] == ' '){
                spaceCount++;
            }
        }
        System.out.println("spaces: " + Integer.toString(spaceCount));
        index = length + spaceCount*2; 
        System.out.println("newLength: " + Integer.toString(index));
        for(int i = length-1; i >= 0; i--){
            if(str[i] == ' '){
                str[index - 1] = '0'; 
                str[index - 2] = '2'; 
                str[index - 3] = '%';
                index = index - 3; 
            }else{
                str[index -1] = str[i]; 
                index = index -1; 
            }
        }
        System.out.println(str.toString());
        for (char c: str)
            System.out.print(c + " "); 
        System.out.println();
        return new String(str);
    }
    public static void main(String[] args){
        String str = "Mr John Smith    "; 
        char[] chars = str.toCharArray(); 
        System.out.println("chars length: " + Integer.toString(chars.length));
        /*for (char c: chars)
            System.out.print(Character.toString(c));
            System.out.println();
        */
        replaceSpaces(chars, 13);
        System.out.println("URLified string: " + replaceSpaces(chars, 13)); 
    }
}
