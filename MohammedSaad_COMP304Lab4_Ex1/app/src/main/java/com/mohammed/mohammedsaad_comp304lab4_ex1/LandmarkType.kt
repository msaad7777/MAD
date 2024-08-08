package com.mohammed.mohammedsaad_comp304lab4_ex1

import java.io.Serializable

data class LandmarkType(
    val name: String,
    val landmarks: List<Landmark>
) : Serializable
