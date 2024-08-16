package com.mohammed.mohammedsaad;

import android.app.Application;

import androidx.lifecycle.LiveData;

public class StockRepository {

    private final StockInfoDao stockInfoDao;  // Marked as final

    public StockRepository(Application application) {
        StockDatabase db = StockDatabase.getDatabase(application);
        stockInfoDao = db.stockInfoDao();
    }

    public void insert(StockInfo stockInfo) {
        StockDatabase.databaseWriteExecutor.execute(() -> stockInfoDao.insert(stockInfo));
    }

    public LiveData<StockInfo> getStockBySymbol(String symbol) {
        return stockInfoDao.getStockBySymbol(symbol);
    }

    public LiveData<StockInfo> getStockByCompanyName(String name) {
        return stockInfoDao.getStockByCompanyName(name);
    }
}
