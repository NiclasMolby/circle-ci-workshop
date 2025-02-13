package net.praqma.codeacademy.gildedrose;

import static org.junit.Assert.*;

import org.junit.Test;

public class GildedRoseTest {

    @Test
    public void foo() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("foo", app.items[0].name);
    }
    @Test
    public void old_brie() {
        Item[] items = new Item[] { new Item("Aged Brie", 0, 1) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertTrue("brie is a higher quality",app.items[0].quality>1 );

    }
    @Test
    public void never_over_50() {
        Item[] items = new Item[] { new Item("Aged Brie", 0, 50) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertTrue("brie is higher quality than it should be able to",app.items[0].quality==50 );

    }

    /*@Test
    public void concert_tickets_drops_to_0() {
      Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 1, 20) };
      GildedRose app = new GildedRose(items);
      app.updateQuality();
      assertTrue("Concert tickets are at zero value", app.items[0].quality == 0);
    }

    @Test
    public void concert_tickets_increase_by_2_when_10_days_left() {
      int initialQuality = 20;
      Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 11, initialQuality) };
      GildedRose app = new GildedRose(items);
      app.updateQuality();
      assertEquals("Concert tickets increase by 2", app.items[0].quality, initialQuality + 2);
    }


    @Test
    public void concert_tickets_increase_by_3_when_5_days_left() {
      int initialQuality = 20;
      Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 4, initialQuality) };
      GildedRose app = new GildedRose(items);
      app.updateQuality();
      assertEquals("Concert tickets increase by 3", app.items[0].quality, initialQuality + 3);
    }*/
}
