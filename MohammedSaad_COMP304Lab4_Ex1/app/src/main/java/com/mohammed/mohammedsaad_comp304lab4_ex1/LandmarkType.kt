package com.mohammed.mohammedsaad_comp304lab4_ex1

import android.os.Parcel
import android.os.Parcelable

data class LandmarkType(
    val name: String,
    val landmarks: List<Landmark>
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString()!!,
        parcel.createTypedArrayList(Landmark.CREATOR)!!
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeTypedList(landmarks)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<LandmarkType> {
        override fun createFromParcel(parcel: Parcel): LandmarkType {
            return LandmarkType(parcel)
        }

        override fun newArray(size: Int): Array<LandmarkType?> {
            return arrayOfNulls(size)
        }
    }
}
