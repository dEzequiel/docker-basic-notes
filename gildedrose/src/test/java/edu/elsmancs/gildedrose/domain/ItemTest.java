package edu.elsmancs.gildedrose.domain;
import static org.junit.Assert.*;
import org.junit.Test;

public class ItemTest {

    @Test
    public void createItem() {

        Item item = new Item("+5 Dexterity Vest", 10, 20);
        assertEquals("+5 Dexterity Vest", item.name);
        assertEquals(10, item.sellIn);
        assertEquals(20, item.quality);   
    }

}
