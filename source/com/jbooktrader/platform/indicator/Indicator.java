package com.jbooktrader.platform.indicator;


import com.jbooktrader.platform.marketbook.*;

/**
 * Base class for all classes implementing technical indicators.
 */
public abstract class Indicator {
    private final String name;
    protected Indicator parentIndicator;
    protected MarketBook marketBook;
    protected double value;

    public abstract void calculate();

    public abstract void reset();

    protected Indicator() {
        name = getClass().getSimpleName();
    }

    protected Indicator(Indicator parentIndicator) {
        this();
        this.parentIndicator = parentIndicator;
    }

    public void setMarketBook(MarketBook marketBook) {
        this.marketBook = marketBook;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" value: ").append(value);
        return sb.toString();
    }

    public double getValue() {
        return value;
    }


    public String getName() {
        return name;
    }
}
