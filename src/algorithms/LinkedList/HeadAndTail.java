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
// Solution 2: Iterative
boolean isPallindrome(LinkedListNode head){
    LinkedListNode fast = head; 
    LinkedListNode slow = head; 
    
    /*
    Push elements from first half of linked list onto stack. When fast runner
    (which is moving in 2X speed) reaches the end of the linked list, 
    then we know we're at the middle.
    */
    Stack<Integer> stack = new Stack<Integer>(); 
    while(fast != null && fast.next != null){
        stack.push(slow.data);
        slow = slow.next; 
        fast = fast.next.next; 
    }
    // Has odd number of elements, so skip the middle element
    if (fast != null)
        slow = slow.next; 

    while(slow != null){
        int top = stack.pop().intValue();
        // If values are different, then it's not a pallindrome
        if (top != slow.data)
            return false; 
        slow = slow.next; 
    }
    return true; 
    
    }
}
// Solution 3: Recustion

class Result{
        public LinkedListNode node; 
        public boolean result; 
}

boolean isPallindrome(LinkedListNode head){
    int length = lengthOfList(head)
    Result p = isPallindromeRecurse(head, length);
    return p.result; 
}

Result isPallindromeRecurse(head.next, length-2){
    if (head == nul || length <= 0){ // even number of nodes
        return new Result(head, true); 
    }else if (length == 1){ // odd number of nodes
        return new Result(head.next, true);
    }
    // Recurse on sublist
    Result res = isPallindromeRecurse(head.next, length-2);
    // If child calls are not a Pallindrome, pass back up a failure
    if (!res.result || res.node == null)
        return res; 
    res.result = (head.data == res.node.data);

    // Return the corresponding node
    res.node = res.node.next; 
    return res; 
}


int lengthOfList(LinkedListNode n){
    int size = 0; 
    while (n != null){
        size ++; 
        n = n.next; 
    }
    return size; 
}
