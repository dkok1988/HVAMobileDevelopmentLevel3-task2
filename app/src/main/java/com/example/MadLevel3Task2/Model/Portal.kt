package com.example.MadLevel3Task2.Model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Portal(
    var title: String,
    var url: String
) : Parcelable