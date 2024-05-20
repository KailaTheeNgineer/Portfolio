package com.pluralsight;

public abstract class FixedAsset implements  Valuable {

    protected String name; protected double marketValue; protected double weight;
    protected double karat;   protected int yearBuilt; protected int squareFeet; protected int bedrooms;

    // default constructor
    public FixedAsset(String name, double marketValue, double weight, double karat, int yearBuilt, int squareFeet, int bedrooms) {
        this.name = name;
        this.marketValue = marketValue;
        this.weight = weight;
        this.karat = karat;
        this.yearBuilt = yearBuilt;
        this.squareFeet = squareFeet;
        this.bedrooms = bedrooms;
    }

    // constructor for Jewelry
    public FixedAsset(String name, double karat) {
        this.name = name;
        this.karat = karat;
    }

    // constructor for Gold
    public FixedAsset(double weight) {
        this.weight = weight;
    }

    // constructor for House
    public FixedAsset(int yearBuilt, int squareFeet, int bedrooms) {
        this.yearBuilt = yearBuilt; this.squareFeet = squareFeet; this.bedrooms = bedrooms;
    }






    @Override
    public abstract double getValue();
}
