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
public abstract class Card {
    private boolean available = true; 
    // Number or face that's on card - a number 2 through 10, or 11 for Jack, 12 for Queen, 13 for King, or 1 for Ace
    protected int faceValue; 
    protected Suit suit; 
    
    public Card(int c, Suit s){
        faceValue = c; 
        suit = s; 
    }
    public abstract int value(); 
    public Suit suit(){
        return suit; 
    }
    
    // Checks if the card is available to be given out to someone
    public boolean isAvailable(){
        return available; 
    }
    public void markUnavailable(){
        available = false; 
    }
    
    public void markAvailable(){
        available = true; 
    }
    
}
