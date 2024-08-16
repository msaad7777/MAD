package com.mohammed.mohammedsaad;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

public class MohammedActivity extends AppCompatActivity {

    private StockViewModel stockViewModel;
    private TextView stockInfoTextView;
    private RadioButton symbolRadioButton;
    private RadioButton companyNameRadioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mohammed);

        stockViewModel = new ViewModelProvider(this).get(StockViewModel.class);
        stockInfoTextView = findViewById(R.id.stockInfoTextView);
        symbolRadioButton = findViewById(R.id.symbolRadioButton);
        companyNameRadioButton = findViewById(R.id.companyNameRadioButton);
    }

    public void insertStocks(View view) {
        StockInfo stock1 = new StockInfo("AAPL", "Apple Inc.", 150.00);
        StockInfo stock2 = new StockInfo("GOOGL", "Alphabet Inc.", 2800.00);

        stockViewModel.insert(stock1);
        stockViewModel.insert(stock2);

        Toast.makeText(this, "Stocks inserted", Toast.LENGTH_SHORT).show();
    }

    public void displayStockInfo(View view) {
        if (symbolRadioButton.isChecked()) {
            stockViewModel.getStockBySymbol("AAPL").observe(this, stockInfo -> {
                if (stockInfo != null) {
                    stockInfoTextView.setText("Symbol: " + stockInfo.getStockSymbol() + "\nCompany: " + stockInfo.getCompanyName() + "\nQuote: " + stockInfo.getStockQuote());
                    sendBroadcast(stockInfo);
                }
            });
        } else if (companyNameRadioButton.isChecked()) {
            stockViewModel.getStockByCompanyName("Apple Inc.").observe(this, stockInfo -> {
                if (stockInfo != null) {
                    stockInfoTextView.setText("Symbol: " + stockInfo.getStockSymbol() + "\nCompany: " + stockInfo.getCompanyName() + "\nQuote: " + stockInfo.getStockQuote());
                    sendBroadcast(stockInfo);
                }
            });
        }
    }

    private void sendBroadcast(StockInfo stockInfo) {
        Intent intent = new Intent("com.mohammed.mohammedsaad.STOCK_INFO_BROADCAST");
        intent.putExtra("stock_info", "Symbol: " + stockInfo.getStockSymbol() + ", Company: " + stockInfo.getCompanyName() + ", Quote: " + stockInfo.getStockQuote());
        sendBroadcast(intent);
    }
}
