package com.markbrown.wutangfinancial;

/**
 * Created by markbrown on 5/22/17.
 */
public class Currency {

    private static String currentCurrencyType;
    private static String targetCurrencyType;

    private Currency() {}

    public static void setCurrentCurrencyType(String currencyType) {
        currentCurrencyType = currencyType;
    }
    public static String getCurrentCurrencyType() {
        return currentCurrencyType;
    }

    public static void setTargetCurrencyType(String currencyType) {
        targetCurrencyType = currencyType;
    }
    public static String getTargetCurrencyType() {
        return targetCurrencyType;
    }

}
