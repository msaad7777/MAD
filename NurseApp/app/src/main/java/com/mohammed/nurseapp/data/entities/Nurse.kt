package com.mohammed.nurseapp.data.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Nurse(
    @PrimaryKey val nurseId: Int,
    val firstname: String,
    val lastname: String,
    val department: String,
    val password: String
)
