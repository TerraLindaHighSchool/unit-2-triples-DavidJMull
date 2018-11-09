package com.example.bruce.triples_1_5;

import android.content.Context;
import java.util.ArrayList;

public class GameModel {
    private Deck deck;
    private ArrayList<Card> mCardOnBoard;
    private ArrayList<Integer> mSelectedCards;
    private long mStartTime;
    private int mScore, mTriplesRemaining, mLevel,mNumOfCardsInDeck;

    GameModel(int numOfCardsInDeck, int level){
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

    public int getNumOfCardsSelected(){
        return mSelectedCards.size();
    }

    /*************************************************
     * Methods that place cards to board
     *************************************************/
    protected void addCardToBoard(){
        mCardOnBoard.add(deck.getTopCard());
    }

    protected void replaceCardOnBoard(int index){
        // to be implemented
    }

    /*************************************************
     * Methods that keep track of selected cards
     *************************************************/

    protected void addSelectedCardIndex(int cardIndex){
        mSelectedCards.add(cardIndex);
    }

    protected void removeSelectedCardIndex(int cardIndex){

    }

    protected void resetSelectedCardIndices(){
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

    protected boolean isTriple(int firstCard, int secondCard, int thirdCard){
        // to be implemented
        return true; // temporary placeholder until implementation
    }

    protected boolean playIsPossible(){
        // to be implemented
        return true;  // temporary placeholder until implementation
    }

    protected String getGameOverMessage(Context context){
        String message = context.getString(R.string.game_over);
        if(mTriplesRemaining > 0)
            message = "      " + message + "\n" + context.getString(R.string.play_not_possible);
        return message;
    }
}

