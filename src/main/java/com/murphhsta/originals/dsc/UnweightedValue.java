package com.murphhsta.originals.dsc;

public class UnweightedValue {
    double unweightedValue;

    public UnweightedValue(double unweightedValue) {
        this.unweightedValue = unweightedValue;
    }

    public double getUnweightedValue() {
        return unweightedValue;
    }

    public void setUnweightedValue(double unweightedValue) {
        this.unweightedValue = unweightedValue;
    }

    @Override
    public String
    toString() {
        return "UnweightedValue{" +
                "unweightedValue=" + unweightedValue +
                '}';
    }
}
