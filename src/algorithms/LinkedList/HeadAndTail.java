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
class HeadAndTail {
    public LinkedListNode head; 
    public LinkedListNode tail;
    public HeadAndTail(LinkedListNode h, LinkeListNode t){
        head = h;
        tail = t; 
    }
}
boolean isPallindrome(LinkedListNode head){
    HeadAndTail reversed= reverse(head);
    LinkedListNode reversedHead = reversed.head; 
    return isEqual(head, reversedHead);
}
HeadAndTail reverse(LinkedListNode head){
    if(head == null)
        return false;
    HeadAndTail ht = reverse(head.next);
    // getting the shoreter version of the linkedList
    LinkedListNode clonedHead = head.clone; 
    // gettin the first element of a linked list
    clonedHead.next = null; 

    if (ht == null)
        return new HeadAndTail(clonedHead, clonedHead); 
    // setting the tail to that first element
    ht.tail.next = clonedHead; 

    return new HeadAndTail(ht.head, clonedHead);
}
boolean isEqual(LinkedListNode one, LinkedListNode two){
    LinkedListNode head1 = one; 
    LinkedListNode head2 = two; 
    while(head1 != null && head2 != null){
        if(head1.data != head2.data)
            return false;
        head1 = head1.next; 
        head2 = head2.next; 
    }
    
    return head1 == null && head2 == null; 
    
}