package com.mohammed.mohammedsaad;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Database(entities = {StockInfo.class}, version = 1, exportSchema = false)
public abstract class StockDatabase extends RoomDatabase {

    // Singleton instance
    private static volatile StockDatabase INSTANCE;
    // ExecutorService with a fixed thread pool for database write operations
    private static final int NUMBER_OF_THREADS = 4;
    static final ExecutorService databaseWriteExecutor =
            Executors.newFixedThreadPool(NUMBER_OF_THREADS);

    // Data Access Object
    public abstract StockInfoDao stockInfoDao();

    // Method to get the singleton instance of the database
    public static StockDatabase getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (StockDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                                    StockDatabase.class, "stock_database")
                            .fallbackToDestructiveMigration()
                            .build();
                }
            }
        }
        return INSTANCE;
    }
}

