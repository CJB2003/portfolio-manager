package com.pluralsight.finance;

public class Jewelry extends FixedAsset{
    public double karat;

    public Jewelry(String name, double karat) {
        super(name, karat);
    }

    @Override
    public double getValue() {
        return 500 * karat;
    }

    public void getJewelryDesc() {
        System.out.println("The value of " + name + " " + getValue());
    }
}
