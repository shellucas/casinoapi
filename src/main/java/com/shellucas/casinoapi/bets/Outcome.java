package com.shellucas.casinoapi.bets;

/**
 *
 * @author shelby
 */
public interface Outcome {

    /**
     * Multiplies the bet amount by the odds. Therefore, this returns the
     * outcome of a bet.
     *
     * @param betAmount
     * @return The product of the amount bet and the odds.
     */
    public double winAmount(double betAmount);

    /**
     * Changes odds to numerator:1
     *
     * @param numerator
     */
    public void alterOdds(int numerator);

}
