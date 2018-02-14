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
public class Hand <T extends Card>{
    protected ArrayList<T> cards = new ArrayList<T>(); 
    
    public int score(){
        int score = 0; 
        for(T card: cards){
            score += card.value();
        }
        return score; 
    }
    
    public void addCard(T card){
        cards.add(card);
    }
    
    
}
