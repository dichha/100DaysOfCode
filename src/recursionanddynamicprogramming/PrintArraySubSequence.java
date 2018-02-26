/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursionanddynamicprogramming;

/**
 *
 * @author dichha
 */
public class PrintArraySubSequence {
    public static void printAllSubSequences(int[] arrInput){
        int[] temp = new int[arrInput.length];
        int index = 0; 
        solve(arrInput, index, temp);
    }
    private static void solve(int[] arrInput, int index, int[] temp){
        if(index == arrInput.length){
            print(arrInput, temp);
            return;
        }
        temp[index] = 1;
        solve(arrInput, index+1, temp);
        temp[index] = 0; 
        solve(arrInput, index+1, temp);
                
            
    }
    private static void print(int[] arrInput, int[] temp){
        String result = ""; 
        for(int i=0; i< temp.length; i++){
            if(temp[i] == 1)
                result += arrInput[i];
        }
        if(result == "")
            result = "{EmptySet}";
        System.out.println(result);
    }
    public static void main(String[] args){
        int[] arrInput = {1, 2, 3}; 
        printAllSubSequences(arrInput);
    }
}
