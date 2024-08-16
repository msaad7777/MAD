package com.mohammed.mohammedsaad;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class StockBroadcastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent != null && intent.getAction().equals("com.mohammed.mohammedsaad.STOCK_INFO_BROADCAST")) {
            String stockInfo = intent.getStringExtra("stock_info");
            Toast.makeText(context, "Received: " + stockInfo, Toast.LENGTH_LONG).show();
        }
    }
}
