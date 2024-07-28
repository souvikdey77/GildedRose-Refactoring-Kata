package com.gildedrose;

/**
 * This class is responsible to update the generic item apart from Aged Brie, Backstage & Legendary item
 */
public class GenericUpdater implements ItemUpdater {
    /**
     * This method is responsible to update the generic item
     * @param item to be provided
     */
    @Override
    public void update(Item item) {
        if (item.quality > 0){
            item.quality -= 1;
        }
        if(item.sellIn < 0){
            item.quality -= 1;
        }
        item.sellIn = item.sellIn - 1;
    }
}
