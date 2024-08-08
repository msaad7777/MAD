package com.mohammed.mohammedsaad_comp304lab4_ex1

import java.io.Serializable

data class Landmark(
    val name: String,
    val address: String,
    val latitude: Double,
    val longitude: Double
) : Serializable
