package com.pluralsight.finance;

public abstract class FixedAsset implements iValuable{
    public String name;
    public double marketValue;

    public FixedAsset(String name, double marketValue) {
        this.name = name;
        this.marketValue = marketValue;
    }

    @Override
    public double getValue() {
        return marketValue;
    }
}
