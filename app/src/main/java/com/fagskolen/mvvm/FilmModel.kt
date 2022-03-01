package com.fagskolen.mvvm

import java.util.*

class FilmModel(
    val title: String,
    val ageRating: String,
    val releaseDate: Date,
    val durationMinute: Long,
    val genres: MutableList<String>,
    val rating: Float,
    val reviews: Int
)
