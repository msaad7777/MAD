package com.mohammed.mohammedsaad;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

public class StockViewModel extends AndroidViewModel {

    private final StockRepository repository; // Marked as final

    public StockViewModel(Application application) {
        super(application);
        repository = new StockRepository(application);
    }

    public void insert(StockInfo stockInfo) {
        repository.insert(stockInfo);
    }

    public LiveData<StockInfo> getStockBySymbol(String symbol) {
        return repository.getStockBySymbol(symbol);
    }

    public LiveData<StockInfo> getStockByCompanyName(String name) {
        return repository.getStockByCompanyName(name);
    }
}
