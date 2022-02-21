package edu.elsmancs.gildedrose.domain;

public class NormalItem implements Updateable {

    private final Item item;
    
    public NormalItem(String name, int sellIn, int quality) {
        this.item = new Item(name, sellIn, quality);
    }
    

    int getSellIn() {
        return item.sellIn;
    }
    int getQuality(){
        return item.quality;
    }
    String getName(){
        return item.name;
    }

    void decreaseSellIn() {
        item.sellIn = getSellIn() - 1;
    }

    void setQuality(int amount) {
        item.quality = amount;
    }

    void improveQuality(int amount) {
        item.quality += amount;
        qualityChecker();
    }
    void reduceQuality(int amount) {
        item.quality -= amount;
    }
    void qualityChecker(){
        if (getQuality() > 50) {
            setQuality(50);
        }
    }

    @Override
    public void updateQuality() {
        if(getSellIn() <= 0) {
            setQuality(0);
        } 
        else {
            reduceQuality(1);
        }
        decreaseSellIn();

    } 
    
    @Override
    public String toString() {
        return item.name + ", " + item.sellIn + ", " + item.quality;
    }

}
