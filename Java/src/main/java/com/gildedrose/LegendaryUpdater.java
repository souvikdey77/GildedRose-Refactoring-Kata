package com.gildedrose;

public class LegendaryUpdater implements ItemUpdater {
    /**
     * This method is responsible to update the legendary(ex: sulfuras) item
     * @param item to be provided
     */
    @Override
    public void update(Item item) {
        // as per the requirement, no need to update the legendary quality & sellin
        // quality should be default to 80
    }
}
