package edu.elsmancs.gildedrose.domain;
import static org.junit.Assert.*;
import org.junit.Test;

public class NormalItemTest{

    @Test
    public void createNormalItem() {
        NormalItem item = new NormalItem("Elixir of the Mongoose", 5, 7);
        assertEquals(7, item.getQuality());
        assertEquals(5, item.getSellIn());
        assertEquals("Elixir of the Mongoose", item.getName());
    }

    @Test
    public void normalItemSellInZero() {
        NormalItem item = new NormalItem("Elixir of the Mongoose", 0, 7);
        item.updateQuality();
        assertEquals(0, item.getQuality());
    }

    @Test
    public void normalItemSellInNotZero() {
        NormalItem item = new NormalItem("Elixir of the Mongoose", 1, 7);
        item.updateQuality();
        assertEquals(6, item.getQuality());
    }

    @Test
    public void normalItemDecreaseSellIn() {
        NormalItem item = new NormalItem("Elixir of the Mongoose", 5, 7);
        for (int i = 0; i < 4; i++){item.updateQuality();}
        assertEquals(1, item.getSellIn());
    }

    @Test
    public void normalItemDecreaseQuality() {
        NormalItem item = new NormalItem("Elixir of the Mongoose", 5, 7);
        for (int i = 0; i < 4; i++){item.updateQuality();}
        assertEquals(3, item.getQuality());
    }

    
}
