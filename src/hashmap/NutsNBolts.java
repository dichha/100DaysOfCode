/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author dichha
 */
public class NutsNBolts {
    /*
    static void swap(int i, int j, char[] bolts){
        char temp = bolts[j];
        bolts[j] = bolts[i];
        bolts[i] = temp; 
    }
    static void match(char[] nuts, char[] bolts){
        for(int i=0; i<nuts.length; i++){
            char nut = nuts[i];
            for(int j=i; j<bolts.length; j++){
                if(nut == bolts[j]){
                    swap(i,j, bolts);
                }
            }
        }
    }
    */
    static void match(char[] nuts, char[] bolts, Map<Character, Integer> map){
        
        for(int i=0; i<nuts.length; i++){
            map.put(nuts[i], i);
        }
    }
    public static void main(String[] args){
        Map<Character, Integer> map = new HashMap<Character, Integer>(); 
        char[] nuts = {'$', '%', '&', 'x', '@'};
        char[] bolts = {'%', '@', 'x', '$', '&'};
        match(nuts, bolts, map);
        System.out.println(Arrays.toString(bolts));
        for(int i=0; i < bolts.length; i++){
            char bolt = bolts[i];
            if(map.containsKey(bolt)){
                nuts[i] = bolts[i];
            }
          
        }
        System.out.print(Arrays.toString(nuts));
        /*
        System.out.println(Arrays.toString(nuts));
        System.out.println(Arrays.toString(bolts));
        */
    
    }
    
}
