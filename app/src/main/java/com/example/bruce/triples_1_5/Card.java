package com.example.bruce.triples_1_5;

public class Card {
    private int mCount, mAlpha;
    private Color mColor;
    private Shape mShape;
    private int mImageID, mselectedImageID ;

    public enum Shape {
        SQUARE, CIRCLE, TRIANGLE, NO_SHAPE
    }
    ;
    public enum Color {
        BLUE, RED, GREEN, NO_COLOR
    }

    ;

    public Card(Shape shape, Color color,  int alpha, int count, int ImageID, int selectedImageID) {
        mCount = count;
        mColor = color;
        mShape = shape;
        mAlpha = alpha;
        mImageID = ImageID;
        mselectedImageID = selectedImageID;
}



    public int getCount() {
        return mCount;
    }
    public Color getColor() {
        return mColor;
    }
    public Shape getShape() {
        return mShape;
    }
    public int getAlpha() {
        return mAlpha;
    }

    public int getImageID() {
        return mImageID;
    }

    public int getSelectedImageID() {
        return mselectedImageID;
    }
}




