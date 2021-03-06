package com.shellucas.casinoapi.cards;

import java.util.Collection;

/**
 *
 * @author shelby
 */
public interface CardCollection {

    /**
     * Amount of cards in the collection.
     *
     * @return Size of collection
     */
    public int size();

    /**
     * Returns all cards in the collection as a list. Subclasses might want to
     * return a Stack or Deque implementation of the list in the case of a deck
     * or an ArrayList or Bag in the case of a hand.
     *
     * @return List of cards
     */
    public Collection<? extends Card> getCards();

}
