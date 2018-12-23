package com.shellucas.casinoapi.players;

import com.shellucas.casinoapi.bets.Bet;
import com.shellucas.casinoapi.bets.tables.BetPlacer;

/**
 *
 * @author shelby
 */
public abstract class Player {

    private double stake;
    private int roundsToGo;
    private BetPlacer table;

    public Player(double stake, int roundsToGo, BetPlacer table) {
        this.stake = stake;
        this.roundsToGo = roundsToGo;
        this.table = table;
    }

    /**
     * Returns True while the player is active.
     *
     * @return
     */
    public abstract boolean isPlaying();

    /**
     * Places a bet on the players table.
     */
    public abstract void placeBets();

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
    
    public int getRoundsToGo() {
        return roundsToGo;
    }

    public double getStake() {
        return stake;
    }

    public BetPlacer getTable() {
        return table;
    }

    public void setStake(double stake) {
        this.stake = stake;
    }

    public void setTable(BetPlacer table) {
        this.table = table;
    }

}
