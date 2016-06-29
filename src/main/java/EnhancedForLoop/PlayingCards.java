package EnhancedForLoop;

import java.util.*;
public class PlayingCards {
    enum Suit { CLUBS, DIAMONDS, HEARTS, SPADES }
    enum Rank { TWO, THREE, FOUR, FIVE, SIX, SEVEN,
                EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE }
    static class Card {
        Suit suit;
        Rank rank;
        Card(Suit s, Rank r) { suit = s; rank = r; }
        public String toString() { return "(" + suit + "," + rank + ")"; }
    }
    public static void main(String[] args) {
        List<Card> deck = new ArrayList<Card>();
        for (Suit suit : Suit.values())
            for (Rank rank : Rank.values())
                deck.add(new Card(suit, rank));
        System.out.println(deck);
        Collections.shuffle(deck);
        System.out.println(deck);
    }
}