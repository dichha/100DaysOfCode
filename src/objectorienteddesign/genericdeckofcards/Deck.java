/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectorienteddesign.genericdeckofcards;

import java.util.ArrayList;

/**
 *
 * @author dichha
 */
public class Deck<T extends Card>{
    private ArrayList<T> cards; // all cards, dealt or not
    private int dealtIndex = 0; // marks first undealt card
    
    public void setDeckOfCards(ArrayList<T> deckOfCards){
        cards = deckOfCards;
    }
    
    public void shuffle(){
        for(int i=0; i < cards.size(); i++){
            int j = (int) (Math.random()*(cards.size()-i)+i); 
            T card1 = cards.get(i); 
            T card2 = cards.get(j); 
            cards.set(i, card2); 
            cards.set(j, card1); 
        }
    }
    
    public int remainingCards(){
        return cards.size() - dealtIndex; 
    }
    
    public T[] dealHand(int number){
        if(remainingCards() < number)
            return null; 
        T[] hand = (T[]) new Card[number]; 
        int count = 0; 
        while(count < number){
            T card = dealCard();
            if (card != null){ 
                hand[count] = card; 
                count++;
            }
        }
        return hand; 
    }
    
    public T dealCard(){
        if(remainingCards() == 0)
            return null; 
        T card = cards.get(dealtIndex); 
        card.markUnavailable();
        dealtIndex++; 
        return card; 
    }
    
    
    
    
}
