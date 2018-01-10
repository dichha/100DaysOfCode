/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.LinkedList;

/**
 *
 * @author dichha
 */
class Node1{
    int data;
    Node1 next; 
    public Node1(){
        
    }
    public Node1(int data){
        this.data = data; 
        this.next = null; 
    }
    
    void setNext(Node1 node){
        this.next = node; 
    }
    
}
public class AddTwoList {
    
    
    static Node1 addList(Node1 list1, Node1 list2, int carry){
        if(list1 == null && list2 == null && carry == 0)
            return null; 
        Node1 result = new Node1(); 
        
        int value = carry;
        if(list1 != null)
            value += list1.data; 
        if(list2 != null)
            value += list2.data; 
        
        result.data = value%10; // getting the last digit
        // recurse
        if(list1 != null || list2 != null){
            Node1 more = addList(list1 == null? null : list1.next,
                                list2 == null? null : list2.next,
                                value >= 10? 1:0
                                );
            result.setNext(more);
        }
        return result;
        
    }
    static void displayContent(Node1 n){
        while( n != null){
            System.out.print(n.data + " ");
            n = n.next; 
        }
        System.out.println();
    }
    public static void main(String[] args){
        Node1 n1 = new Node1(7);
        Node1 n2 = new Node1(1);
        Node1 n3 = new Node1(6);
        
        n1.setNext(n2);
        n2.setNext(n3);
        displayContent(n1);
        
        Node1 n4 = new Node1(5);
        Node1 n5 = new Node1(9);
        Node1 n6 = new Node1(2);
        
        n4.setNext(n5);
        n5.setNext(n6);
        displayContent(n4);
        
        Node1 sum = addList(n1, n4, 0);
        displayContent(sum);
        
        
        
    }
    
}
