package com.drsync.parcelablewithnavigationcompose

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Person(
    val firstName: String,
    val lastName: String
): Parcelable
