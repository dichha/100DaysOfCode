/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectorienteddesign.genericdeckofcards;

/**
 *
 * @author dichha
 */
public enum Suit{
    Club(0), Diamond(1), Heart(2), Spade(3); 
    
    private int value; 
    private Suit(int v){
        value = v; 
    }
    public int getValue(){
        return value; 
    }
    public static Suit getSuitFromValue(int value){
       Suit card = null; 
       switch(value){
           case 0: card = Suit.Club;
           break; 
           
           case 1: card =  Suit.Diamond; 
           break; 
           
           case 2: card = Suit.Heart;
           break; 
           
           case 3: card = Suit.Spade;
           break; 
       }
       return card; 
               
    }
}

