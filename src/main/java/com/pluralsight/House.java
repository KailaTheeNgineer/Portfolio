package com.pluralsight;

public class House extends FixedAsset {


    public House(int yearBuilt, int squareFeet, int bedrooms) {
    super(yearBuilt, squareFeet, bedrooms);
    }

    @Override
    public double getValue() {
        return 0;
    }
}
