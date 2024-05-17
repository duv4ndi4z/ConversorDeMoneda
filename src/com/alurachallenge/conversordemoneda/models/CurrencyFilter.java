package com.alurachallenge.conversordemoneda.models;

public class CurrencyFilter {
    public String getCurrency(String currencyCode) {
        ApiConnection apiConnection = new ApiConnection();
        Currency currency = apiConnection.connectApi();
        return String.valueOf(currency.conversion_rates().get(currencyCode));
    }
}
//Al parecer funciona