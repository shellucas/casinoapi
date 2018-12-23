package com.shellucas.casinoapi.cards;

/**
 *
 * @author shelby
 */
public interface Card {
   
    /**
     * Get the rank of this card as defined in the Ranks enum.
     * 
     * @return rank of card
     */
    public Ranks getRANK();
    
    /**
     * Get the suit of this card as defined in the Suits enum.
     * 
     * @return suit of card
     */
    public Suits getSUIT();
    
    /**
     * Get the value of this card as an integer representation. This can be for
     * example a classic 1-13 (as in Ace, 2, 3, 4, 5, 6, 7, 8, 9, 10, Jack, 
     * Queen, King) or for blackjack the point of rank for base cards, 10 for
     * face cards and 1 or 11 for Aces, etc.
     * 
     * @return The int representation of the value of the card.
     */
    public int getValue();
    
}
