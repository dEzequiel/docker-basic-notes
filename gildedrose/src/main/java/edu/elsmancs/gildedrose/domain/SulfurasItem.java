package edu.elsmancs.gildedrose.domain;

public class SulfurasItem extends NormalItem {

    public SulfurasItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }
    
    @Override
    public void updateQuality() {}

}
