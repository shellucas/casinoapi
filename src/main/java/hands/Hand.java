package hands;

import com.shellucas.casinoapi.bets.Bet;
import com.shellucas.casinoapi.cards.Card;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author shelby
 */
public class Hand {

    private final List<Card> cards;
    
    public Hand() {
        this.cards = new ArrayList<>();
    }
    
    /**
     * Amount of cards in the hand.
     * 
     * @return 
     */
    public int size() {
        return this.cards.size();
    }
    
    /**
     * Returns all cards in the hand as a list.
     * 
     * @return 
     */
    public List<Card> getCards() {
        return this.cards;
    }
    
    /**
     * Returns a string containing every card in the hand on a new line.
     * 
     * @return 
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        this.cards.forEach((card) -> sb.append(card).append("\n") );
        return sb.toString();
    }

}
