package com.shellucas.casinoapi.cards;

/**
 *
 * @author shelby
 */
public enum Ranks {
    
    ACE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(11),
    QUEEN(12),
    KING(13);

    private final int rank;

    /**
     * @param rank 
     */
    Ranks(int rank) {
        this.rank = rank;
    }
    
    /**
     * Get an integer representation of the rank.
     * 
     * @return the rank
     */
    public int getRank() {
        return this.rank;
    }
}
