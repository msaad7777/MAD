package com.mohammed.nurseapp.data.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Test(
    @PrimaryKey(autoGenerate = true) val testId: Int,
    val patientId: Int,
    val nurseId: Int,
    val BPL: Int,
    val BPH: Int,
    val temperature: Float,
    // Add more fields as necessary
)
