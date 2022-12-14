package com.example.dogglers.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.dogglers.R
import com.example.dogglers.modle.Dog

object DataSource {
    val dogs = listOf<Dog>(
        Dog(R.drawable.tzeitel, "Tzeitel", "7", "Sunbathing"),
        Dog(R.drawable.leroy, "Leroy", "4", "Sleeping in dangerous places"),
        Dog(R.drawable.frankie, "Frankie", "2", "Stealing socks"),
        Dog(R.drawable.nox, "Nox", "8", "Meeting new animals"),
        Dog(R.drawable.faye, "Faye", "8", "Digging in the garden"),
        Dog(R.drawable.bella, "Bella", "14", "Chasing sea foam")
    )
}