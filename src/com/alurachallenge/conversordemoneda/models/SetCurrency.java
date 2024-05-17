package com.alurachallenge.conversordemoneda.models;
//Clase redundante e innecesaria
//Traslado a la Clase Coverter, *NO olvidar eliminar*

public class SetCurrency {
    private String currencyA;
    private String currencyB;
    private Double NumToConvert;

    public SetCurrency(String currencyA, String currencyB, Double numToConvert) {
        this.currencyA = currencyA;
        this.currencyB = currencyB;
        this.NumToConvert = numToConvert;
    }

    public String getCurrencyA() {
        return currencyA;
    }

    public void setCurrencyA(String currencyA) {
        this.currencyA = currencyA;
    }

    public String getCurrencyB() {
        return currencyB;
    }

    public void setCurrencyB(String currencyB) {
        this.currencyB = currencyB;
    }

    public Double getNumToConvert() {
        return NumToConvert;
    }

    public void setNumToConvert(Double numToConvert) {
        NumToConvert = numToConvert;
    }

}
