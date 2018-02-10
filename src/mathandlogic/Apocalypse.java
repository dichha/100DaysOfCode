/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathandlogic;

import java.util.Random;

/**
 *
 * @author dichha
 */
public class Apocalypse {
    static int[] runOneFamily(int i){
        Random random = new Random();
        int girls = 0; 
        int boys = 0; 
        while(girls== 0){ 
            boolean gender = random.nextBoolean();
            if(gender){
                boys++;
            }else{
                girls++; 
            }
            
        }
        int[] gen = {girls, boys};
        return gen;
    }
    static double runFamilies(int n){
        int girls= 0; 
        int boys = 0; 
        for(int i=0; i<n; i++){
            int[] gender = runOneFamily(i);
            girls+= gender[0]; 
            boys += gender[1];
        }
        return (girls/(double)(boys + girls));
    }
    
    public static void main(String[] args){
        double p = runFamilies(10); 
        System.out.print(p);
        
    }
}
