package com.shellucas.casinoapi.players;

import com.shellucas.casinoapi.bets.Bet;

/**
 *
 * @author shelby
 */
public interface Player {

    /**
     * Returns True while the player is active.
     *
     * @return
     */
    public abstract boolean isPlaying();

    /**
     * Places a bet on the players table.
     * @param bet
     */
    public abstract void placeBets(Bet bet);

    /**
     * Updates stake with the result of the won bet. Updates roundsToGo
     * depending on implementation. Removes bet from table.
     *
     * @param wonBet
     */
    public abstract void win(Bet wonBet);

    /**
     * Updates stake with the result of the lost bet. Updates roundsToGo
     * depending on implementation. Removes bet from table.
     *
     * @param lostBet
     */
    public abstract void lose(Bet lostBet);

}
