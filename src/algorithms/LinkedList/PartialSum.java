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
class Node2{
    int data; 
    Node2 next;
    public Node2(int data){
        this.data = data;
        this.next = null; 
    }
}
public class PartialSum {
    public Node2 sum = null; 
    public int carry = 0; 
    
}
Node2 addLists(Node2 n1, Node2 n2){
    int len1 = length(n1); 
    int len2 = length(n2); 

    // Pad the shorter lists with zeroes 
    if (len1 < len2){
       l1 = padList(l1, len2 - len1);
       l2 = padList(l2, len1 - len2);       
    }
    // Add Lists 
    PartilaSum sum = addListHelper(l1 ,l2);
    /* 
    If there was a carry value left over, insert this at the front of the 
    list. O/w, just return the LinkedList Node.
    */
    if(sum.carry == 0){
        return sum.sum; 
    }else{
        Node2 result = insertBefore(sum.sum, sum.carry);
        return result; 
    }
}
PartialSum addListHelper(Node2 l1, node2 l2){
    if(l1 == null && l2 == null){
        PartialSum  sum = new PartialSum(); 
        return sum; 
    }
    // Add smaller digits recursively
    PartialSum sum = addListHelper(l1.next, l2.next);

    // Add carry to current data
    int val = sum.carry + l1.data + l2.data;
    
    // Insert sum of current digits
    Node2 fullResult = insertBefore(sum.sum, val%10);

    // Return sum so far, and the carry value
    sum.sum = fullResult; 
    sum.carry = val/10; 
    return sum;
}
// Pad the list list with zeros 
Node2 padList(Node2 l, int padding){
    Node2 head = l; 
    for (int i=0; i<padding; i++){
        head = insertBefore(head, 0);
    }
    return head; 
}

// Helper function to insert node in the front of a linked list
Node2 insertBefore(Node2 list, int data){
    Node2 node = new Node(2);
    if(list != null){
        node.next = list; 
    }
    return node;
}
}

