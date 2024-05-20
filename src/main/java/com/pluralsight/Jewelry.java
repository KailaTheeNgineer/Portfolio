package com.pluralsight;

public class Jewelry extends FixedAsset {

public Jewelry(String name, double karat) {
    super(name, karat);
}


    @Override
    public double getValue() {
        return 0;
    }
}
