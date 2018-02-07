/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.treesandgraphs;

/**
 *
 * @author dichha
 */
class Node1{
     int data; 
     Node1 left, right; 
     Node1(int data){
         this.data = data; 
     }
}
public class IsIsomorphic {
    Node1 root1, root2; 
    
    static boolean isIsomorphic(Node1 n1, Node1 n2){
        if((n1 == null ) && (n2 == null))
            return true; 
        if((n1 == null) || (n2 == null))
            return false; 
        if(n1.data != n2.data)
            return false; 
        
        return (isIsomorphic(n1.left, n2.left) && isIsomorphic(n1.right, n2.right)) || 
        (isIsomorphic(n1.left, n2.right) && isIsomorphic(n1.right, n2.left));
    }
    public static void main(String[] args){
        IsIsomorphic iso = new IsIsomorphic();
        iso.root1 = new Node1(1);
        iso.root1.left = new Node1(2); 
        iso.root1.right = new Node1(3);
        iso.root1.left.left = new Node1(4);
        iso.root1.left.right = new Node1(5);
        iso.root1.right.left = new Node1(6);
        iso.root1.left.right.left = new Node1(7); 
        iso.root1.left.right.right = new Node1(8);
        
        iso.root2 = new Node1(1); 
        iso.root2.left = new Node1(3); 
        iso.root2.right = new Node1(2); 
        iso.root2.right.left = new Node1(4); 
        iso.root2.right.right = new Node1(5); 
        iso.root2.left.right = new Node1(6); 
        iso.root2.right.right.left = new Node1(8); 
        iso.root2.right.right.right = new Node1(7); 
        
        
        if (iso.isIsomorphic(iso.root1, iso.root2) == true){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
    }
    
}
