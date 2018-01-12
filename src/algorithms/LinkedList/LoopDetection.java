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
public class LoopDetection {
    LinkedListNode findBegining(LinkedListNode head){
        LinkedListNode slow = head; 
        LinkedListNode fast = head; 
        
        // Find the meetng point. This will be LOOP_SIZE - k steps
        // steps into the linked list
        
        while(fast != null && fast.next != null){
            slow = slow.next; 
            fast = fast.next.next; 
            if(slow == fast)
                break;
        }
        // Error check = no meeting point, and therefore no loop
        if (fast == null || fast.next == null)
            return null;
        
        // Move slow to Head. Keep fast at Meeting Point. Each are k steps
        // from the Loop Start. If they move at the same pace, they must meet
        // at the Loop Start. 
        
        
        slow = head; 
        while (slow != fast){
            slow = slow.next; 
            fast = fast.next; 
        }
        // Both now points to the start of the loop 
        return fast; 
       
                    
        
    }
}
