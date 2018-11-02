package com.example.bruce.triples_1_5;

import org.junit.Test;

import static org.junit.Assert.*;

public class DeckTest {

    @Test
    public void createShuffledDeck() {
        Deck deck = new Deck(81);
        Card topCard;
        Card nextCard;
        for(int i = 0; i < 40; i++) {
            topCard = deck.getTopCard();
            nextCard = deck.getTopCard();
            assertTrue(!topCard.equals(nextCard));
        }
    }

    @Test
    public void mgetNumCardsInDeck() {
       Deck deck = new Deck(81);
       int expected =  82;
       int actual = deck.getNumCardsInDeck();
       assertEquals(actual, expected);
    }

    @Test
    public void getTopCard() {
      Deck deck = new Deck(81);
      Card expected =  deck.getCard(0);
      Card actual =    deck.getTopCard();
      assertEquals(actual, expected);
    }
}