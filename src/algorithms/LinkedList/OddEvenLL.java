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

    // Segregate even and odd nodes in a Linked List s.t 
    // all even numbers appear before all the odd numbers in the 
    // modified linked list

    class LinkedList{
        Node head; 
        class Node{
            int data; 
            Node next; 
            Node(int d){ 
                data = d; 
                next = null; 
            }
        }
        public void segregateEvenOdd(){
            Node evenStart = null; 
            Node evenEnd = null; 
            Node oddStart = null; 
            Node oddEnd = null; 
            Node currentNode = head; 

            while(currentNode != null){ 
                int element = currentNode.data; 
                if(element % 2 == 0 ){
                    if(evenStart == null){ 
                        evenStart = currentNode; 
                        evenEnd = evenStart; 
                    }else{ 
                        evenEnd.next = currentNode; 
                        evenEnd = evenEnd.next; 
                    }

                }else{ 
                    if(oddStart == null){ 
                        oddStart = currentNode; 
                        oddEnd = oddStart; 
                    }else{ 
                        oddEnd.next = currentNode; 
                        oddEnd = oddEnd.next; 
                    }
                }
                // Move head pointer 1 step in forward direction
                currentNode = currentNode.next; 
            }
            if(oddStart == null || evenStart == null){
                return; 
            }
            evenEnd.next = oddStart; 
            oddEnd.next = null; 
            head = evenStart; 

        }
        void push(int newData){
            Node newNode = new Node(newData); 
            newNode.next = head; 
            head = newNode; 
        }
        void printList(){
            Node temp = head; 
            while(temp != null){
                System.out.print(temp.data + " "); 
                temp = temp.next; 
            }
            System.out.println(); 
        }
        public static void main(String[] args){ 
            LinkedList ll = new LinkedList(); 
            int[] data = {11, 10, 9, 6, 4, 1, 0};
            for (int i: data){ 
                ll.push(i); 
            }
            ll.segregateEvenOdd();
            ll.printList();

        }
    }


