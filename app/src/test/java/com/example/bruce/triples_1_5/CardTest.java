package com.example.bruce.triples_1_5;

import android.graphics.drawable.Drawable;

import org.junit.Test;

import static org.junit.Assert.*;

public class CardTest {
    Card[] card = {
            new Card(1, Card.Color.RED, Card.Shape.SQUARE, 0, R.drawable.circle_blue_1_0, R.drawable.circle_blue_1_0_selected),
            new Card(2, Card.Color.BLUE, Card.Shape.TRIANGLE, 1,  R.drawable.triangle_green_1_2,  R.drawable.triangle_green_1_2_selected),
            new Card(3, Card.Color.GREEN, Card.Shape.CIRCLE, 2, R.drawable.square_red_2_1, R.drawable.square_red_2_1_selected),
            new Card(0, Card.Color.NOCOLOR, Card.Shape.NOSHAPE, 0,  R.drawable.circle_red_1_0, R.drawable.circle_red_1_0_selected)
    };
    @Test
    public void getCount() {
        int[] expected = {1,2,3};
        int[] actual = new int[expected.length];
        for (int i = 0; i< expected.length;i++) {
            actual[i] = card[i].getCount();
        }
        assertArrayEquals(actual, expected);
    }

    @Test
    public void getColor() {
        Card.Color[] expected = {Card.Color.RED, Card.Color.BLUE, Card.Color.GREEN, Card.Color.NOCOLOR};
        Card.Color[] actual = new Card.Color[card.length];
        for (int i = 0; i< card.length;i++) {
            actual[i] = card[i].getColor();
        }
        assertArrayEquals(expected, actual);


    }

    @Test
    public void getShape() {
        Card.Shape[] expected = {Card.Shape.SQUARE, Card.Shape.TRIANGLE, Card.Shape.CIRCLE, Card.Shape.NOSHAPE};
        Card.Shape[] actual = new Card.Shape[card.length];
        for (int i = 0; i< card.length;i++) {
            actual[i] = card[i].getShape();
        }
        assertArrayEquals(expected, actual);
    }

    @Test
    public void getAlpha() {
        int[] expected = {0,1,2};
        int[] actual = new int[expected.length];
        for (int i = 0; i< expected.length;i++) {
            actual[i] = card[i].getAlpha();
        }
        assertArrayEquals(expected, actual);
    }

    @Test
    public void getImageID() {
        int[] expected = {R.drawable.circle_blue_1_0,R.drawable.triangle_green_1_2,R.drawable.square_red_2_1, R.drawable.circle_red_1_0};
        int[] actual = new int[expected.length];
        for (int i = 0; i< expected.length;i++) {
            actual[i] = card[i].getImageID();
        }
        assertArrayEquals(expected, actual);
    }

    @Test
    public void getSelectedImageID() {
        int[] expected = {R.drawable.circle_blue_1_0_selected,R.drawable.triangle_green_1_2_selected,R.drawable.square_red_2_1_selected,R.drawable.circle_red_1_0_selected};
        int[] actual = new int[expected.length];
        for (int i = 0; i< expected.length;i++) {
            actual[i] = card[i].getSelectedImageID();
        }
        assertArrayEquals(expected, actual);
    }

}