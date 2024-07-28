package com.gildedrose;

import static com.gildedrose.ItemUpdaterFactory.createUpdater;
import static java.util.Arrays.asList;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        asList(items).forEach(item-> createUpdater(item).update(item));
    }
}
