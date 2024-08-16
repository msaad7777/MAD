package com.mohammed.mohammedsaad;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface StockInfoDao {

    @Insert
    void insert(StockInfo stockInfo);

    @Query("SELECT * FROM stock_info WHERE stockSymbol = :symbol")
    LiveData<StockInfo> getStockBySymbol(String symbol);

    @Query("SELECT * FROM stock_info WHERE companyName = :name")
    LiveData<StockInfo> getStockByCompanyName(String name);
}
