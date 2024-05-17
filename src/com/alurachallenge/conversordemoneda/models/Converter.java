package com.alurachallenge.conversordemoneda.models;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public  class Converter {
    private static final CurrencyFilter currency = new CurrencyFilter();
    private String fromCurrency;
    private String toCurrency;
    private Double numberToConvert;

    public Converter(String fromCurrency, String toCurrency, Double numberToConvert) {
        this.fromCurrency = fromCurrency;
        this.toCurrency = toCurrency;
        this.numberToConvert = numberToConvert;
    }

    public String getFromCurrency() {
        return fromCurrency;
    }

    public void setFromCurrency(String fromCurrency) {
        this.fromCurrency = fromCurrency;
    }

    public String getToCurrency() {
        return toCurrency;
    }

    public void setToCurrency(String toCurrency) {
        this.toCurrency = toCurrency;
    }

    public Double getNumberToConvert() {
        return numberToConvert;
    }

    public void setNumberToConvert(Double numberToConvert) {
        this.numberToConvert = numberToConvert;
    }

    private static String round(double numberToRound) {
        DecimalFormat df = new DecimalFormat("0.00");
        df.setRoundingMode(RoundingMode.HALF_UP);
        return df.format(numberToRound);
    }

    public void Convert() {
        try {
            Double currency1 = Double.valueOf(currency.getCurrency(this.fromCurrency));
            Double currency2 = Double.valueOf(currency.getCurrency(this.toCurrency));
            String operation = round((currency2 / currency1) * this.numberToConvert);
            System.out.println("El valor " + this.numberToConvert
                    + " [" + this.fromCurrency + "]" + " corresponde al valor final de ==>> "
                    + operation + " [" + this.toCurrency + "]");
        } catch (NumberFormatException e) {
            System.out.println("Error al intentar convertir la moneda, valores no esperados (Error:" + e
                    +")");
        }
    }
}