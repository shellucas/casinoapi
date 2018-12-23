package com.shellucas.casinoapi.bets;

import java.util.Objects;

/**
 *
 * @author shelby
 */
public abstract class Outcome {

    /**
     * String representation of the outcome of the bet (e.g. 1, "black" "all in")
     */
    private String name;

    /**
     * Numerator for odds, where the assumed denominator is 1. Hence, the field
     * would be initialized to 10 if the odds where 10:1 ( numerator :
     * denominator ).
     */
    private int odss;
    
    /**
     * Multiplies the bet amount by the odds.
     * 
     * @param betAmount
     * @return The product of the amount bet and the odds. 
     */
    public abstract double winAmount(double betAmount);
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) { return true; }
        if (obj == null) { return false; }
        if (getClass() != obj.getClass()) { return false; }
        final Outcome other = (Outcome) obj;
        return Objects.equals(this.name, other.name);
    }

    @Override
    public String toString() {
        return "The odds of placing on " + this.name + " are 1:" + this.odss;
    }
    
}
