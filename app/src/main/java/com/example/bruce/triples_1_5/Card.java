package com.example.bruce.triples_1_5;

public class Card {
    private int mCount, mAlpha;
    private Color mColor;
    private Shape mShape;
    private int mImageID, mselectedImageID ;
    private boolean mIsSelected;

    public enum Shape {
        NO_SHAPE, SQUARE, CIRCLE, TRIANGLE
    }
    ;
    public enum Color {
        NO_COLOR, BLUE, RED, GREEN
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

    public void setIsSelected(boolean isSelected){
        mIsSelected = isSelected;
    }
    public boolean getIsSelected() {
        return mIsSelected;
    }
}




