/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionstream;

  import java.util.stream.Stream; 
  import java.util.stream.Collectors;
  import java.util.Set; 
  import java.util.Collections; 
  import java.util.HashSet; 
  
/**
 *
 * @author dichha
 */
public class StreamToSet {
    public static void main(String[] args){
        /*
        // UsingCollectors
        Stream<Integer> stream = Stream.of(-2, -1, 0, 1, 2);
        
        //using Stream.collect() to collect the elements of stream in a container
        Set<Integer> streamSet = stream.collect(Collectors.toSet());
        
        //displaying the elements
        streamSet.forEach(num -> System.out.println(num));
        */
        /*
        // converting stream to array and then to set
        Stream<String> stream = Stream.of("G", "E", "K", "S");
        
        String[] arr = stream.toArray(String[] :: new);
        
        //Creating a HashSet
        Set<String> set = new HashSet<>(); 
        
        Collections.addAll(set, arr); 
        
        // Displaying the elements
        set.forEach(str -> System.out.println(str));
        */
        
        // Usign forEach 
        
        Stream<Integer> stream = Stream.of(5, 10, 15, 20, 25); 
        
        //Creating a HashSet
        Set<Integer> set = new HashSet<>(); 
        
        // using set.add() to add elements of streams into empty set
        stream.forEach(set::add); 
        
        //Displaying the elements
        set.forEach(num -> System.out.println(num));
        
    }
    
}
