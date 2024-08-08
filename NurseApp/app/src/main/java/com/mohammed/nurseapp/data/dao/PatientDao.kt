package com.mohammed.nurseapp.data.dao

import androidx.room.*
import com.mohammed.nurseapp.data.entities.Patient

@Dao
interface PatientDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertPatient(patient: Patient)

    @Query("SELECT * FROM Patient WHERE patientId = :patientId")
    suspend fun getPatientById(patientId: Int): Patient?

    @Update
    suspend fun updatePatient(patient: Patient)
}
