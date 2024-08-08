package com.mohammed.nurseapp.data.dao

import androidx.room.*
import com.mohammed.nurseapp.data.entities.Test

@Dao
interface TestDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTest(test: Test)

    @Query("SELECT * FROM Test WHERE testId = :testId")
    suspend fun getTestById(testId: Int): Test?

    @Update
    suspend fun updateTest(test: Test)
}
