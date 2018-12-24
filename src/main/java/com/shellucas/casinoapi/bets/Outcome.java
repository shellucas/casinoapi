package com.shellucas.casinoapi.bets;

/**
 *
 * @author shelby
 */
public interface Outcome extends Comparable<Outcome> {
    
    /**
     * Multiplies the bet amount by the odds.
     * 
     * @param betAmount
     * @return The product of the amount bet and the odds. 
     */
    public abstract double winAmount(double betAmount);
    
}
