package edu.elsmancs.gildedrose.domain;

public class BackstagePassesItem extends NormalItem {

    public BackstagePassesItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        if (getSellIn() <= 10 && getSellIn() > 5) {
            improveQuality(2);
        } else if (getSellIn() <= 5 && getSellIn() >= 1) {
            improveQuality(3);
        } else if (getSellIn() <= 0) {
            setQuality(0);
        } else {
            improveQuality(1);
        }

        decreaseSellIn();
    }
    
}  
