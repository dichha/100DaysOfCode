/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathandlogic;

/**
 *
 * @author dichha
 */
public class EggDropProblem {
    static int breakingPoint = 100; 
    static int countDrops = 0;
    static boolean drop(int floor){
        countDrops ++; 
        return floor >= breakingPoint; 
    }
    static int findBreakingPoint(int floors){
        int interval = 14; 
        int previousFloor = 0; 
        int egg1 = interval; 
        // Drop egg1 at decreasing intervals
        while(!drop(egg1) && egg1 <= floors){
            interval -= 1; 
            previousFloor = egg1; 
            egg1 += interval; 
            
        }
        // Drop egg2 at 1 unit increments 
        int egg2 = previousFloor + 1; 
        while (egg2 < egg1 && egg2 <= floors &&(!drop(egg2))){
            egg2 += 1; 
        }
        // If it didn't break, return -1
        return egg2 > floors ? -1 : egg2; 
        
                
    }
    
    public static void main(String[] args){
        int floor = findBreakingPoint(100); 
        System.out.print(floor);
    }
    
    
}
