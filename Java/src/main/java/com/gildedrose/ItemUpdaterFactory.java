package com.gildedrose;

/**
 *  This factory class is dealing with the updater object creation
 */
public class ItemUpdaterFactory {

    public static final String CONJURED = "conjured";
    public static final String BACKSTAGE = "backstage";
    public static final String AGED_BRIE = "aged brie";
    public static final String LEGENDARY = "sulfuras";

    /**
     * This factory method will return the required updater
     * @param item to be provided
     * @return ItemUpdater
     */
    public static ItemUpdater createUpdater(Item item){
        if(item.name.toLowerCase().contains(CONJURED)){
            return new ConjuredUpdater();
        }
        else if(item.name.toLowerCase().contains(BACKSTAGE)){
            return new BackstageUpdater();
        }
        else if(item.name.toLowerCase().contains(AGED_BRIE)){
             return new AgedBrieUpdater();
        }
        else if(item.name.toLowerCase().contains(LEGENDARY)){
             return new LegendaryUpdater();
        }
        else{
           return new GenericUpdater();
        }
    }
}
