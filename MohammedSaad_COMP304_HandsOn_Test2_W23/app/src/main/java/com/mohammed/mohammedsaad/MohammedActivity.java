// Student Number - 301313784
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
    private RadioButton symbolRadioButtonAMZN;
    private RadioButton symbolRadioButtonGOOGL;
    private RadioButton symbolRadioButtonSSNLF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mohammed);

        stockViewModel = new ViewModelProvider(this).get(StockViewModel.class);
        stockInfoTextView = findViewById(R.id.stockInfoTextView);
        symbolRadioButtonAMZN = findViewById(R.id.symbolRadioButtonAMZN);
        symbolRadioButtonGOOGL = findViewById(R.id.symbolRadioButtonGOOGL);
        symbolRadioButtonSSNLF = findViewById(R.id.symbolRadioButtonSSNLF);
    }

    public void insertStocks(View view) {
        StockInfo stock1 = new StockInfo("AMZN", "Amazon", 990.00);
        StockInfo stock2 = new StockInfo("GOOGL", "Google", 2800.00);
        StockInfo stock3 = new StockInfo("SSNLF", "Samsung", 1200.00);

        stockViewModel.insert(stock1);
        stockViewModel.insert(stock2);
        stockViewModel.insert(stock3);

        Toast.makeText(this, getString(R.string.stocks_inserted), Toast.LENGTH_SHORT).show();
    }

    public void displayStockInfo(View view) {
        if (symbolRadioButtonAMZN.isChecked()) {
            stockViewModel.getStockBySymbol("AMZN").observe(this, stockInfo -> {
                if (stockInfo != null) {
                    stockInfoTextView.setText(getString(R.string.stock_info_format,
                            stockInfo.getStockSymbol(),
                            stockInfo.getCompanyName(),
                            stockInfo.getStockQuote()));
                    sendBroadcast(stockInfo);
                }
            });
        } else if (symbolRadioButtonGOOGL.isChecked()) {
            stockViewModel.getStockBySymbol("GOOGL").observe(this, stockInfo -> {
                if (stockInfo != null) {
                    stockInfoTextView.setText(getString(R.string.stock_info_format,
                            stockInfo.getStockSymbol(),
                            stockInfo.getCompanyName(),
                            stockInfo.getStockQuote()));
                    sendBroadcast(stockInfo);
                }
            });
        } else if (symbolRadioButtonSSNLF.isChecked()) {
            stockViewModel.getStockBySymbol("SSNLF").observe(this, stockInfo -> {
                if (stockInfo != null) {
                    stockInfoTextView.setText(getString(R.string.stock_info_format,
                            stockInfo.getStockSymbol(),
                            stockInfo.getCompanyName(),
                            stockInfo.getStockQuote()));
                    sendBroadcast(stockInfo);
                }
            });
        }
    }

    private void sendBroadcast(StockInfo stockInfo) {
        Intent intent = new Intent("com.mohammed.mohammedsaad.STOCK_INFO_BROADCAST");
        intent.putExtra("stock_info", getString(R.string.broadcast_stock_info_format,
                stockInfo.getStockSymbol(),
                stockInfo.getCompanyName(),
                stockInfo.getStockQuote()));
        sendBroadcast(intent);
    }
}
