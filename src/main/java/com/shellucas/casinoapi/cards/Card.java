package com.shellucas.casinoapi.cards;

import java.util.Objects;

/**
 *
 * @author shelby
 */
public class Card {
    
    private final Ranks RANK;
    private final Suits SUIT;

    public Card(Suits SUIT, Ranks RANK) {
        this.SUIT = SUIT;
        this.RANK = RANK;
    }

    public Ranks getRANK() {
        return this.RANK;
    }
    
    public Suits getSUIT() {
        return this.SUIT;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.RANK);
        hash = 47 * hash + Objects.hashCode(this.SUIT);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Card other = (Card) obj;
        return this.RANK == other.RANK && this.SUIT == other.SUIT;
    }

    @Override
    public String toString() {
        return this.RANK + " of " + this.SUIT;
    }
}
