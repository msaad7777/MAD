package com.mohammed.mohammedsaad_comp304lab4_ex1

import android.os.Parcel
import android.os.Parcelable

data class Landmark(
    val name: String,
    val address: String,
    val latitude: Double,
    val longitude: Double
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readDouble(),
        parcel.readDouble()
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeString(address)
        parcel.writeDouble(latitude)
        parcel.writeDouble(longitude)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Landmark> {
        override fun createFromParcel(parcel: Parcel): Landmark {
            return Landmark(parcel)
        }

        override fun newArray(size: Int): Array<Landmark?> {
            return arrayOfNulls(size)
        }
    }
}
