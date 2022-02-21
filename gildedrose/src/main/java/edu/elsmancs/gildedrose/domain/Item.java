package edu.elsmancs.gildedrose.domain;

public final class Item {
    
    // Attributes
    protected final String name;
    protected int sellIn = 0;
    protected int quality = 0;

    // Construtor
    Item (String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }


}
