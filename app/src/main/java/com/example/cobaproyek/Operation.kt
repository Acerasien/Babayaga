package com.example.cobaproyek

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Operation (
    val operation:String = "" ,
    val resource:Long = 0L
):Parcelable