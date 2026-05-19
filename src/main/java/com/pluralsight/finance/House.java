package com.pluralsight.finance;

public class House extends FixedAsset{
    public int yearBuilt;
    public int squareFeet;
    public int bedrooms;

    public House(String name, double marketValue, int yearBuilt, int squareFeet, int bedrooms) {
        super(name, marketValue);
        this.yearBuilt = yearBuilt;
        this.squareFeet = squareFeet;
        this.bedrooms = bedrooms;
    }

    /// Probably need a depreciating factor here for year built
    @Override
    public double getValue() {
        double houseValue = (squareFeet * 50) + (bedrooms * 1000);
        return houseValue;
    }
}
