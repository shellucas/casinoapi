/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shellucas.casinoapi.bets.factories;

import com.shellucas.casinoapi.cards.Card;
import com.shellucas.casinoapi.cards.Ranks;
import com.shellucas.casinoapi.cards.Suits;

/**
 *
 * @author shelby
 */
public interface AbstractCardFactory {
    
    public Card getCard(Ranks rank, Suits suit);
    
}
