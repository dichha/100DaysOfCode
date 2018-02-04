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
public class TinyURL {
    static String idToShortURL(int n){  
       String base = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYA013456789"; 
       char[] map = base.toCharArray(); 
       String shortURL = ""; 
       while(n > 0){
           // convert given integer id to a base 62 number
           // use above map to store actual character in short url 
           shortURL += map[n%62]; 
           n = n/62;
           
       }
       return new StringBuffer(shortURL).reverse().toString();
    } 
    // Function to get integer ID back fromshort url; 
    static int shortURLtoID(String shortURL){
        int id = 0; // initialize result
        // A simple base conversion
        for (int i=0; i<shortURL.length(); i++){ 
            if('a' <= shortURL.charAt(i) && shortURL.charAt(i) <= 'z')
                id = id*62 + shortURL.charAt(i) - 'a';
            if('A' <= shortURL.charAt(i) && shortURL.charAt(i) <= 'Z')
                id = id*62 + shortURL.charAt(i) - 'A' + 26; 
            if('0' <= shortURL.charAt(i) && shortURL.charAt(i) <= '9') 
                id = id*62 + shortURL.charAt(i) - '0' + 52;             
        }         
      return id;   
    } 
    public static void main(String[] args){ 
        int n = 12345; 
        String shortURL = idToShortURL(n); 
        System.out.println("Generated short URL is " + shortURL); 
        System.out.println("Id from URL is " + shortURLtoID(shortURL)); 
    }
    
}
