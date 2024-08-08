package com.mohammed.nurseapp.data.dao

import androidx.room.*
import com.mohammed.nurseapp.data.entities.Nurse

@Dao
interface NurseDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertNurse(nurse: Nurse)

    @Query("SELECT * FROM Nurse WHERE nurseId = :nurseId AND password = :password")
    suspend fun getNurse(nurseId: Int, password: String): Nurse?
}
