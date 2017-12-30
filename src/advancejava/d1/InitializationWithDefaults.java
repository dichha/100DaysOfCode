/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advancejava.d1;

/**
 *
 * @author dichha
 */
public class InitializationWithDefaults {
    private boolean booleanMember; 
    private byte byteMember; 
    private short shortMember; 
    private int intMember; 
    private long longMember; 
    private char charMember; 
    private float floatMember; 
    private double doubleMember; 
    private Object referenceMember; 
    
    public InitializationWithDefaults(){
        System.out.println("booleanMember = " + booleanMember);
        System.out.println("byteMember = " + byteMember);
        System.out.println("shortMember = " + shortMember);
        System.out.println("intMember = " + intMember);
        System.out.println("longMember = " + longMember);
        System.out.println("charMember = " + charMember);
        System.out.println("floatMember = " + floatMember);
        System.out.println("doubleMember = " + doubleMember);
        System.out.println("referenceMember = " +referenceMember);
    }
    /*public static void main(String[] args){
        final InitializationWithDefaults iwd = new InitializationWithDefaults(); 
        
    }*/
    
}
