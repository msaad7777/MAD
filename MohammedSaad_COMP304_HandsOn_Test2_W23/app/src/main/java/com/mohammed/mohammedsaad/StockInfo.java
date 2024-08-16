package com.mohammed.mohammedsaad;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "stock_info")
public class StockInfo {

    @PrimaryKey
    private String stockSymbol;
    private String companyName;
    private double stockQuote;

    public StockInfo() {}

    public StockInfo(String stockSymbol, String companyName, double stockQuote) {
        this.stockSymbol = stockSymbol;
        this.companyName = companyName;
        this.stockQuote = stockQuote;
    }

    public String getStockSymbol() {
        return stockSymbol;
    }

    public void setStockSymbol(String stockSymbol) {
        this.stockSymbol = stockSymbol;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public double getStockQuote() {
        return stockQuote;
    }

    public void setStockQuote(double stockQuote) {
        this.stockQuote = stockQuote;
    }
}
