package com.gildedrose;

/**
 * This class is responsible for updating the BackStage related item
 */
public class BackstageUpdater implements ItemUpdater {

    /**
     * This method is responsible to update the item related to backstage
     * @param item to be provided
     */
    @Override
    public void update(Item item) {
        if (item.sellIn < 0) {
            item.quality = 0;
        }
        Integer increasedQuality = increasedQuality(item.sellIn);
        item.quality += increasedQuality;
        if (item.quality > 50) {
            item.quality = 50;
        }
        item.sellIn = item.sellIn - 1;
    }

    /**
     * This method is responsible to increase the quality based on the remaining days of concert
     *
     * @param remainingConcertDays remaining concert days
     * @return quality
     */
    private static Integer increasedQuality(int remainingConcertDays) {
        if (remainingConcertDays < 6) {
            return 3;
        } else if (remainingConcertDays < 11) {
            return 2;
        } else {
            return 1;
        }
    }
}
