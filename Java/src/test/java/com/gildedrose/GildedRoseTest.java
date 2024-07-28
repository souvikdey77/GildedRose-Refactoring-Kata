package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void foo() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("foo", app.items[0].name);
    }


    @Test
    void agedBrieWhenQualityLessThanFifty() {
        Item[] items = new Item[] { new Item("Aged Brie", 5, 1) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(4, app.items[0].sellIn);
        assertEquals(2, app.items[0].quality);
    }

    @Test
    void agedBrieWhenQualityMoreThanFifty() {
        Item[] items = new Item[] { new Item("Aged Brie", 5, 53) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(4, app.items[0].sellIn);
        assertEquals(53, app.items[0].quality);
    }

    @Test
    void backstageWhenConcertDayIsNineAndQualityIsFifty() {
        Item[] items = new Item[] { new Item("backstage", 9, 50) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("backstage", app.items[0].name);
        assertEquals(8, app.items[0].sellIn);
        assertEquals(50, app.items[0].quality);
    }

    @Test
    void backstageWhenConcertDayIsFiveAndQualityIsFifty() {
        Item[] items = new Item[] { new Item("backstage", 5, 50) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("backstage", app.items[0].name);
        assertEquals(4, app.items[0].sellIn);
        assertEquals(50, app.items[0].quality);
    }

    @Test
    void backstageWhenConcertDayIsFifteenAndQualityIsFifty() {
        Item[] items = new Item[] { new Item("backstage", 15, 50) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("backstage", app.items[0].name);
        assertEquals(14, app.items[0].sellIn);
        assertEquals(50, app.items[0].quality);
    }

    @Test
    void testConjuredWhenSellInIsTwoAndQualityIsFour() {
        Item[] items = new Item[] { new Item("conjured", 2, 4) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("conjured", app.items[0].name);
        assertEquals(1, app.items[0].sellIn);
        assertEquals(2, app.items[0].quality);
    }

    @Test
    void testConjuredWhenSellInIsTwoAndQualityIsNegative() {
        Item[] items = new Item[] { new Item("conjured", 2, -2) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("conjured", app.items[0].name);
        assertEquals(1, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
    }

    @Test
    void testGenericItemWithSellInAndQuality() {
        Item[] items = new Item[] { new Item("generic", 2, 2) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("generic", app.items[0].name);
        assertEquals(1, app.items[0].sellIn);
        assertEquals(1, app.items[0].quality);
    }

    @Test
    void testLegendaryItemWithSellInAndQuality() {
        Item[] items = new Item[] { new Item("sulfuras", 0, 80) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("sulfuras", app.items[0].name);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(80, app.items[0].quality);
    }

}
