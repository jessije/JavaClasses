package com.lecture.twelve;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class SuperMarketUtilities {

    public int dublicateChecker(String incomingItem, String[] existingItemList) {
        int counter = 0;
        for (String item : existingItemList) {
            if (incomingItem.equalsIgnoreCase(item)) {
                return counter;
            }
            counter++;
        }

        return -1; //means false
    }

    public int getEmptyIndex(String[] items) {
        for (int counter = 0; counter < items.length; counter++) {
            if (items[counter] == null) {
                return counter;
            }
        }
        return -1;
    }

    public int getItemIndex(String incomingItem, String[] existingItemList) {
        int counter = 0;
        for (String item : existingItemList) {
            if (incomingItem.equalsIgnoreCase(item)) {
                return counter;
            }
            counter++;
        }

        return -1; //means false
    }

    public Double round(Double val) {
        return new BigDecimal(val.toString()).
                setScale(2, RoundingMode.HALF_UP).doubleValue();
    }
}



