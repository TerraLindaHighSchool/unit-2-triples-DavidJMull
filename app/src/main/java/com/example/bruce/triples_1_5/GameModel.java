package com.example.bruce.triples_1_5;

import android.content.Context;
import java.util.ArrayList;

public class GameModel {
    private Deck deck;
    private ArrayList<Card> mCardOnBoard;
    private ArrayList<Integer> mSelectedCards = new ArrayList<>();
    private long mStartTime;
    private int mScore, mTriplesRemaining, mLevel, mNumOfCardsInDeck;

    GameModel(int numOfCardsInDeck, int level) {
        mLevel = level;
        mNumOfCardsInDeck = numOfCardsInDeck;
        mCardOnBoard = new ArrayList<>();
        deck = new Deck(numOfCardsInDeck);
    }

    /*************************************************
     * Getters and Setters
     *************************************************/


    public Card getCardOnBoard(int index) {
        return mCardOnBoard.get(index);
    }

    public int getSelectedCardIndex(int index) {
        return mSelectedCards.get(index);
    }


    public long getStartTime() {
        return mStartTime;
    }

    public void setStartTime() {
        mStartTime = 0;
    }

    public int getScore() {
        return mScore;
    }

    public void setScore(int score) {
        mScore = score;
    }

    public int getTriplesRemaining() {
        return mTriplesRemaining;
    }

    public void setTriplesRemaining() {
        mTriplesRemaining--;
    }


    public int getNumOfCardsInDeck() {
        return mNumOfCardsInDeck;
    }

    public int getNumOfCardsSelected() {
        return mSelectedCards.size();
    }

    /*************************************************
     * Methods that place cards to board
     *************************************************/
    protected void addCardToBoard() {
        mCardOnBoard.add(deck.getTopCard());
    }

    protected void replaceCardOnBoard(int index) {
        // to be implemented
    }

    /*************************************************
     * Methods that keep track of selected cards
     *************************************************/

    protected void addSelectedCardIndex(int cardIndex) {
        mSelectedCards.add(cardIndex);
    }

    protected void removeSelectedCardIndex(int cardIndex) {

    }

    protected void resetSelectedCardIndices() {
        // to be implemented
    }

    /*************************************************
     * Scoring
     *************************************************/
    protected int updateScore() {
        // to be implemented
        return -1; // temporary placeholder until implementation
    }

    /*************************************************
     * Methods that determine play
     *************************************************/

    protected boolean isTriple(int firstCard, int secondCard, int thirdCard) {
        Card[] cards = {mCardOnBoard.get(firstCard), mCardOnBoard.get(secondCard), mCardOnBoard.get(thirdCard)};
        if ((cards[0].getColor().ordinal() + cards[1].getColor().ordinal() + cards[2].getColor().ordinal()) % 3 == 0
                && (cards[0].getShape().ordinal() + cards[1].getShape().ordinal() + cards[2].getShape().ordinal()) % 3 == 0
                && (cards[0].getAlpha() + cards[1].getAlpha() + cards[2].getAlpha()) % 3 == 0
                && (cards[0].getCount() + cards[1].getCount() + cards[2].getCount()) % 3 == 0) {
            return true; // temporary placeholder until implementation
        } else return false;
    }

    protected boolean playIsPossible() {
        // to be implemented
        boolean truth = false;
        for (int i = 0; i < mCardOnBoard.size(); i++) {
            if (getCardOnBoard(i).getShape() == Card.Shape.NO_SHAPE) continue;
            for (int r  = i +1; r < mCardOnBoard.size(); r++) {
                if (getCardOnBoard(r).getShape() == Card.Shape.NO_SHAPE) continue;
                for (int t = r  + 1; t < mCardOnBoard.size(); t++) {
                    if (getCardOnBoard(t).getShape() == Card.Shape.NO_SHAPE) continue;
                    if (isTriple(i, r, t)) truth = true;
                }
                }
            }
            return truth;
        }




    protected String getGameOverMessage(Context context){
        String message = context.getString(R.string.game_over);
        if(mTriplesRemaining > 0)
            message = "      " + message + "\n" + context.getString(R.string.play_not_possible);
        return message;
    }
}

