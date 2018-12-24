package com.shellucas.casinoapi.bets;

/**
 *
 * @author shelby
 */
public interface Bet {

    /**
     * Get the amount at stake.
     *
     * @return
     */
    public double getAmount();

    /**
     * Get the possible amount to win
     *
     * @return
     */
    public double winAmount();

    /**
     * Get the amount to lose (most likely the same as the amount at stake)
     *
     * @return
     */
    public double loseAmount();

    /**
     * The price of the bet (mostly the amount of the bet, but in some cases for
     * e.g. a commission can be layed upon the potential winnings.
     *
     * @return
     */
    public double price();
    
    /**
     * Returns the outcome of the bet.
     * @return 
     */
    public Outcome getOutcome();
}
