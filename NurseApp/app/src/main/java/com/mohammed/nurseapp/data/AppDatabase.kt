package com.mohammed.nurseapp.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.mohammed.nurseapp.data.dao.PatientDao
import com.mohammed.nurseapp.data.dao.TestDao
import com.mohammed.nurseapp.data.dao.NurseDao
import com.mohammed.nurseapp.data.entities.Patient
import com.mohammed.nurseapp.data.entities.Test
import com.mohammed.nurseapp.data.entities.Nurse

@Database(entities = [Patient::class, Test::class, Nurse::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun patientDao(): PatientDao
    abstract fun testDao(): TestDao
    abstract fun nurseDao(): NurseDao
}
