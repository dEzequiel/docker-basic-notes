package edu.elsmancs.gildedrose.domain;
import static org.junit.Assert.*;
import org.junit.Test;

public class ConjuredItemTest {
    
    @Test
    public void createConjuredItem() {
        ConjuredItem item = new ConjuredItem("Conjured Cake", 5, 7);
        assertEquals(7, item.getQuality());
        assertEquals(5, item.getSellIn());
        assertEquals("Conjured Cake", item.getName());
    }

    @Test
    public void ConjuredItemSellLessZero() {
        ConjuredItem item = new ConjuredItem("Conjured Cake", -1, 7);
        item.updateQuality();
        assertEquals(0, item.getQuality());
    }

    @Test
    public void ConjuredItemSellInNotZero() {
        ConjuredItem item = new ConjuredItem("Conjured Cake", 1, 7);
        item.updateQuality();
        assertEquals(6, item.getQuality());
    }

    @Test
    public void ConjuredItemDecreaseSellIn() {
        ConjuredItem item = new ConjuredItem("Conjured Cake", 5, 7);
        for (int i = 0; i < 4; i++){item.updateQuality();}
        assertEquals(1, item.getSellIn());
    }

    @Test
    public void ConjuredItemDecreaseQuality() {
        ConjuredItem item = new ConjuredItem("Conjured Cake", 5, 7);
        for (int i = 0; i < 4; i++){item.updateQuality();}
        assertEquals(3, item.getQuality());
    }

}
