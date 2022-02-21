package edu.elsmancs.gildedrose.domain;

public class AgedBrieItem extends NormalItem {

    public AgedBrieItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality(){
        if (getSellIn() <= 0) {
            improveQuality(1);
        } else {
            improveQuality(2);
        }

        decreaseSellIn();
    }

}
