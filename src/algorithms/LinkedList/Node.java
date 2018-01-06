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
public class Node {
    Node next = null; 
    int data;
    public Node(int data){
        this.data = data;
    }
    static void appendToTail(Node head,int n){
        Node node = head;
        Node end = new Node(n);
        while(node.next != null){
            node = node.next; 
        }
        node.next = end;
    }
    Node deleteNode(Node head, int d){
        Node n = head;
        if(n.data == d)
            return n.next; 
        while(n.next != null){
            if (n.next.data == d){
                n.next = n.next.next; 
                return head; // head didn't change
            }
            n = n.next; 
        }
        return head; 
    }
    static void displayContent(Node head){
        Node n = head;
   
        while(true){
            if(n == null)
                break; 
            System.out.print(n.data + " ");
            n = n.next; 
        }
        System.out.println();
    }
    public static void main(String[] args){
        Node n = new Node(5); 
        int[] list = {11, 22, 12, 82, 100, 0, -2, 32}; 
        for(int num: list)
            appendToTail(n, num);
        
        System.out.println("Printing contents of Singly-linked LinkedList");
        displayContent(n);
        
        
    }
}
