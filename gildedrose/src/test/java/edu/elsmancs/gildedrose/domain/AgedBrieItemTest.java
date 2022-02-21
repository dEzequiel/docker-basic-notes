package edu.elsmancs.gildedrose.domain;
import static org.junit.Assert.*;
import org.junit.Test;

public class AgedBrieItemTest{

    @Test
    public void createAgedBrie() {
        AgedBrieItem item = new AgedBrieItem("Aged Brie", 5, 7);
        assertEquals(7, item.getQuality());
        assertEquals(5, item.getSellIn());
        assertEquals("Aged Brie", item.getName());
    }

    @Test
    public void AgedBrieSellInZero() {
        AgedBrieItem item = new AgedBrieItem("Aged Brie", 0, 0);
        item.updateQuality();
        assertEquals(1, item.getQuality());
    }

    @Test
    public void AgedBrieSellInNotZero() {
        AgedBrieItem item = new AgedBrieItem("Aged Brie", 1, 7);
        item.updateQuality();
        assertEquals(9, item.getQuality());
    }

    @Test
    public void AgedBrieDecreaseSellIn() {
        AgedBrieItem item = new AgedBrieItem("Aged Brie", 5, 7);
        for (int i = 0; i < 4; i++){item.updateQuality();}
        assertEquals(1, item.getSellIn());
    }

    @Test
    public void AgedBrieDecreaseQuality() {
        AgedBrieItem item = new AgedBrieItem("Aged Brie", 5, 7);
        for (int i = 0; i < 4; i++){item.updateQuality();}
        assertEquals(15, item.getQuality());
    }


    
}