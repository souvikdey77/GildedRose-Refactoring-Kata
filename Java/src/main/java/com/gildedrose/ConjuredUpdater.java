package com.gildedrose;

/**
 * This class is responsible for conjured item update
 */
public class ConjuredUpdater implements ItemUpdater {
    /**
     * This method is responsible to update the conjured item
     * @param item to be provided
     */
    @Override
    public void update(Item item) {
        item.quality -= 2;
        if (item.quality < 0) {
            item.quality = 0;
        }
        item.sellIn = item.sellIn - 1;
    }
}
