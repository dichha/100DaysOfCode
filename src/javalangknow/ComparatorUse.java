/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalangknow;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator; 

/**
 *
 * @author dichha
 */
public class ComparatorUse {
    int rollno; 
    String name; 
    String address; 
    
    // Constructor
    public ComparatorUse(int rollno, String name, String address){
      this.rollno = rollno; 
      this.name = name; 
      this.address = address; 
    }
    public String toString(){
        return this.rollno + " " + this.name + " " + this.address; 
    }
    
}
class SortByRoll implements Comparator<ComparatorUse>{
    // used for sorting in ascending order of roll number
    public int compare(ComparatorUse a, ComparatorUse b){
        return a.rollno - b.rollno; 
    }
}

class SortByName implements Comparator<ComparatorUse>{
    // used for sorting in ascending order of roll name
    public int compare(ComparatorUse a, ComparatorUse b){
        return a.name.compareTo(b.name);
    }
}

// Driver class

class Main{
    /*
    public static void main(String[] args){
        ArrayList<ComparatorUse> arr = new ArrayList<ComparatorUse>(); 
        arr.add(new ComparatorUse(111, "bbbb", "london")); 
        arr.add(new ComparatorUse(131, "aaaa", "nyc")); 
        arr.add(new ComparatorUse(121, "cccc", "jaipur")); 
        
        Collections.sort(arr, new SortByRoll());
        
        System.out.println("\nSorted by rollno"); 
        for(int i=0; i<arr.size(); i++){
            System.out.println(arr.get(i));
        }
        
        Collections.sort(arr, new SortByName());
        
        System.out.println("\n Sorted by name");
        for(int i=0; i<arr.size(); i++){
            System.out.println(arr.get(i));
        }
        
        
    }
*/
}