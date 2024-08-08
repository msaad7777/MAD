package com.mohammed.nurseapp.data.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Patient(
    @PrimaryKey(autoGenerate = true) val patientId: Int,
    val firstname: String,
    val lastname: String,
    val department: String,
    val nurseId: Int,
    val room: String
)
