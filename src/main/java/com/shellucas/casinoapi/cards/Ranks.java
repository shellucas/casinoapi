/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
     * Constructor used for all cards besides Aces.
     * 
     * @param rank 
     */
    Ranks(int rank) {
        this.rank = rank;
    }
    
    public int getRank() {
        return this.rank;
    }
}
