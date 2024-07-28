package com.gildedrose;

/**
 * This class is responsible to update the Aged Brie
 */
public class AgedBrieUpdater implements ItemUpdater {
    /**
     * This method is responsible to update the aged brie item
     * @param item to be provided
     */
    @Override
    public void update(Item item) {
        if (item.quality < 50) {
            item.quality += 1;
        }
        item.sellIn -= 1;
    }
}
