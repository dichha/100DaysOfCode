/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.stacksandqueues;
import java.util.Stack; 
/**
 *
 * @author dichha
 */
public class SortStackUsingTwoStacks {
    static void sortStack(Stack<Integer> s){
        Stack<Integer> r = new Stack<Integer>(); 
        while(!s.isEmpty()){
            int temp = s.pop(); 
            while(!r.isEmpty() && temp > r.peek()){
                s.add(r.pop());
            }
            r.add(temp);
            
        }
        
        while(!r.isEmpty()){
            System.out.print(r.pop() + " ");
        }
    }
    /*
    public static void main(String[] args){
        Stack<Integer> s = new Stack<Integer>(); 
        s.add(12); 
        s.add(9); 
        s.add(45); 
        s.add(0);
        s.add(-1); 
        s.add(-23); 
        s.add(3);
        
        sortStack(s); 
    }
    */
    
}
