package com.pluralsight.finance;

import java.util.ArrayList;
import java.util.List;

public class Portfolio {
    private String name;
    private String owner;
    private List<iValuable> assets;

    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
        this.assets = new ArrayList<>();
    }

    /// Adds asset to array list
    public void addAssets(iValuable asset) {
        this.assets.add(asset);
    }

    /// Default totalValue gets asset values added to it each iteration and returns combined value
    public double getValue() {
        double totalValue = 0;
        for (iValuable asset : this.assets) {
            totalValue += asset.getValue();
        }
        return totalValue;
    }

    /// mostValuable gets replaced if less than asset value
    public iValuable getMostValuable() {
        iValuable mostValuable = this.assets.get(0);

        for(iValuable asset : this.assets) {
            if (mostValuable.getValue() < asset.getValue()) {
                mostValuable = asset;
            }
        }
        return mostValuable;
    }

    /// LeastValuable gets replaced if value is greater than asset value
    public iValuable getLeastValuable() {
        iValuable leastValuable = this.assets.get(0);

        for(iValuable asset : this.assets) {
            if (leastValuable.getValue() > asset.getValue()) {
                leastValuable = asset;
            }
        }
        return leastValuable;
    }
}
