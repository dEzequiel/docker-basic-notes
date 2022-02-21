package edu.elsmancs.gildedrose.domain;

public class ConjuredItem extends NormalItem{

    public ConjuredItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        if(getSellIn() >= 0) {
            reduceQuality(1);
        } else if (getSellIn() < 0) {
            setQuality(0);
        } else {
            reduceQuality(4);
        }

        decreaseSellIn();
    }
    
}
