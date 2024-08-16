package com.mohammed.mohammedsaad;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class StockBroadcastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent != null && "com.mohammed.mohammedsaad.STOCK_INFO_BROADCAST".equals(intent.getAction())) {
            String stockInfo = intent.getStringExtra("stock_info");
            if (stockInfo != null) {
                Toast.makeText(context, "Received: " + stockInfo, Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(context, "No stock info received", Toast.LENGTH_LONG).show();
            }
        }
    }
}
