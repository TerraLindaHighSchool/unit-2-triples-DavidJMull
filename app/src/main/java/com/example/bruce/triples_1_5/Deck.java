package com.example.bruce.triples_1_5;
import java.util.Random;
/*
public class Deck {
    int count;
    String color;
    String shape;
    String shading;

    //Makes Deck 'Holder'
    private Card [] deck;

    int counter;

    public Deck(){
        //Creates All Cards
        int[] count ={1,2,3};
        String[] color ={"Red","Blue","Green"};
        String[] shape ={"Square","Triangle","Circle"};
        String[] shading ={"Solid","Empty","Shaded"};

        deck = new Card[count.length*color.length*shape.length*shading.length];

        for(int index = 0; index <= 12; index++ ){

            for(int index1 = 0; index1 <= 3; index1++ ){

                deck[index1 * valuee.length + index] = new Card(count.length*color.length*shape.length*shading.length);



            }

        }
//Shuffles Deck

        for(int i = 0; i<7; i++){

            shuffle();

        }

    }
    //Chooses card
    public Card draw() {

        counter++;
        if(counter == 52){
            for(int i = 0; i<7; i++){

                shuffle();

            }
            counter = 0;
        }
        return deck[counter - 1];

    }

    public void shuffle() {

        Random r = new Random();


        for(int i = 0; i<52; i++){

            int rand = r.nextInt(51);
            Card temp = deck[rand];
            deck[rand] = deck[i];
            deck[i] = temp;
        }


    }
    //Moves cards(

    public void print() {
        for( int i = 0; i < 52; i++ ) {
            deck[i].print();
        }
    }


}
