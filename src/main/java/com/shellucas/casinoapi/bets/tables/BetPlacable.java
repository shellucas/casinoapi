package com.shellucas.casinoapi.bets.tables;

import com.shellucas.casinoapi.bets.Bet;

/**
 *
 * @author shelby
 */
public interface BetPlacable {

    /**
     * Get the limit of the sum of all bets by a player.
     * 
     * @return 
     */
    public double getLimit();
    
    /**
     * Get the minimum value for a single bet made by a player.
     * 
     * @return 
     */
    public double getMinimum();
    
    /**
     * Places a bet.
     * 
     * @param bet 
     */
    public void placeBet(Bet bet);
    
    /**
     * Removes a bet from the placement.
     * 
     * @param bet
     * @return 
     */
    public Bet removeBet(Bet bet);
    
}
